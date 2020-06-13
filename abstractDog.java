public class abstractDog extends abstractAnimal {

  public void move(){
    System.out.println("The dog walks around");
    //^ has been overwriten from abstract
  }

  public void beg(){
    System.out.println("The dog looks cute to get food");
  }
}
