public class stringTest {

  public static void main(String[] args){

    String stringA = "Hello";
    String stringB = new String("Hello");

    System.out.println("Stirng A: " + stringA);
    System.out.println("String B: " + stringB);

    if(stringA == stringB)
      System.out.println("StringA and StringB point to the same object");
    else
      System.out.println("StringA and StringB DO NOT point to the same object");
  }
}
