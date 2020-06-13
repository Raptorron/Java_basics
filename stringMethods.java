public class stringMethods {

  public static void main(String[] args){

    String string1 = "hello";
    String string2 = new String("Hello");

    System.out.println("Stirng.length():\t\t" + string1.length());
    System.out.println("String.toUpperCase():\t\t" + string1.toUpperCase());
    System.out.println("Stirng.toLowerCase():\t\t" + string1.toLowerCase());
    System.out.println("String.lastIndexOf('l'):\t\t" + string1.lastIndexOf('l'));
    System.out.println("String.charAt(4):\t\t" + string1.charAt(4));
    System.out.println("String.equals(string2):\t\t" + string1.equals(string2));
    System.out.println("String.equalsIgnoreCase(stirng2):\t\t" + string1.equalsIgnoreCase(string2));
  }
}
