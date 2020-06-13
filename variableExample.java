public class variableExample {
  public static void main(String[] args){

    boolean myBoolian = false;

    byte myByte = 2;

    short myShort = 3;

    char myChar = 'b';

    int myInt = 5;

    float myFloat = 0.25f;

    long myLong = 99999999L;

    double myDouble = 5.999d;

    String myString = new String("this is a String object, created with a constructor!");

    System.out.println("2 + 3 = " + (myByte + myShort));
    System.out.println("Is myInt < 6: " + myBoolian);
    System.out.println("Here's some floating point division (myDouble / myFloat): ");
    System.out.println(myDouble / myFloat);
    System.out.println("But what happens when we divide integers? 5 / 2 = ");
    System.out.println(myInt / myByte);
    System.out.println("There's no decimal, and one remainder!");

  }
}
