public class ArraysExample {
  public static void main(String[] args) {
    int[] firstArray = new int[3];
    int[] secondArray = {1, 2, 3};

    firstArray[0] = 2;
    firstArray[1] = 4;
    firstArray[2] = 6;

    System.out.println("the value in firstArray[1] is " + firstArray[1]);

    System.out.println("the length of secondArray in " + secondArray.length);
  }
}
