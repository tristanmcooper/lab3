import static org.junit.Assert.*;
import org.junit.*;

import java.util.ArrayList;
import java.util.List;

public class ListTests {

    @Test
    public void testFilter1() {

        List<String> inputList = new ArrayList<>();
        inputList.add(new String("testing1"));
        inputList.add(new String("testing2"));

        List<String> expected = new ArrayList<>();
        // expected.add(new String(""));
        // expected.add(new String(""));

        assertEquals(expected, ListExamples.filter(inputList,));



    }
    
}
