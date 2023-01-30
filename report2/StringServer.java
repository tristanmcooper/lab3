import java.io.IOException;
import java.net.URI;

import java.util.ArrayList;

class Handler implements URLHandler {

    ArrayList<String> list = new ArrayList<String>();

    public String printArray() {
        String finalString = "";
        for (int i = 0; i < list.size(); i++) {
            finalString += list.get(i)+"\n";
        }
        return finalString;
    }

    public String handleRequest(URI url) {


        if (url.getPath().equals("/")) {
            String emptyRequest = printArray();
            return emptyRequest;
        }

        else {
            System.out.println("Path: " + url.getPath());

            if (url.getPath().contains("/add-message")) {

                String[] parameters = url.getQuery().split("=");

                if (parameters[0].equals("s")) {

                    for (int i = 1; i < parameters.length; i++) {
                        list.add(parameters[i]);
                    }

                    String printedArray = printArray();
                    return printedArray;
                }
            }
            return "404 Not Found";
        }
    }
}

class StringServer extends Handler {
    public static void main(String[] args) throws IOException {
        if(args.length == 0){
            System.out.println("Missing port number! Try any number between 1024 to 49151");
            return;
        }

        int port = Integer.parseInt(args[0]);
        Server.start(port, new StringServer());

    }
}



    
