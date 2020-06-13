public class PersonObjectTest {

  public static String print(Object o){
    return o.toString();//object method
  }

  public static void main(String[] args){
    PersonExample someone = new PersonExample();

    someone.setName("Joe");

    System.out.println(print(someone));
  }
}
