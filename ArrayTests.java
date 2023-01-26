

public class ArrayTests {
	@Test 
	public void testReverseInPlace() {
    int[] input1 = { 3 };
    ArrayExamples.reverseInPlace(input1);
    assertArrayEquals(new int[]{ 3 }, input1);
	}

  // My test case
  // BUG: Cannot reverse the same list this way; a temp list is necessary
  // because you are changing the values of the list as you are copying them,
  // so by the time you reach one after the middle index, you are copying over
  // elements that have already been copied, not the originals -- that data is 
  // lost
  @Test
  public void testReverseInPlace2() {
    int[] input2 = {1,2,3,4,5};
    ArrayExamples.reverseInPlace(input2);
    assertArrayEquals(new int[]{5,4,3,2,1}, input2);
  }


  @Test
  public void testReversed() {
    int[] input1 = { };
    assertArrayEquals(new int[]{ }, ArrayExamples.reversed(input1));
  }

  // My test case
  // BUG: assigns values of the new array to the old one instead of vice-versa
  // This way, the returned array will always be empty?
  @Test
  public void testReversed2() {
    int[] input2 = {1,2,3,4,5};
    assertArrayEquals(new int[] {5,4,3,2,1}, ArrayExamples.reversed(input2));
  }

  @Test
  public void testAverageWithoutLowest() {
    double[] input1 = {5.0,4.0,1.0,3.0,2.0,1.0};
    assertEquals(3.5, ArrayExamples.averageWithoutLowest(input1),0);
  }

}
