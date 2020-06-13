abstract class abstractAnimal {

  public void eat(){
    System.out.println("The animal munches on some food");
  }

  abstract void move();
  //^ this method guarantees that each concrete subclass will be forced to define implimentation details for itself
}
