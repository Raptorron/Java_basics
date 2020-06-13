public class staticDemoExample {

  public static void main(String[] args){

    staticDemo instanceA = new staticDemo();
    System.out.println("instanceA counter; " + instanceA.counter);
    System.out.println("instanceA counter; " + instanceA.counter);

    staticDemo instanceB = new staticDemo();
    System.out.println("instanceB counter; " + instanceB.counter);
    System.out.println("instanceB counter; " + instanceB.counter);
  }
}
