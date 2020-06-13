public class ExceptionTestExample {

  public static void main(String[] args){

    try {
      System.out.println("1 / 0 = " + (1 / 0));
    } catch(ArithmeticException e){
      System.out.println("Caught an arithmetic exception");

      e.printStackTrace();
    } finally {
      System.out.println("This is the potional \"finally\" block.");
    }
    System.out.println("The code has continued on, as normal!");
  }
}
