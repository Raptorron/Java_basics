public class A {

  public static int staticCount = 0;
  //static member

  public int instanceCount = 0;
  //instance member

  public A(){
    staticCount++;
    this.instanceCount++;
  }

  public static int getStaticCount(){
    return A.staticCount;
  }

  public static void setStaticCount(int staticCount){
    A.staticCount = staticCount;
  }

  public int getInstanceCount(){
    return this.instanceCount;
  }

  public void setInstanceCount(int instanceCount){
    this.instanceCount = instanceCount;
  }
}
// Again, notice that the methods that manipulate staticCount, have the keyword static applied to them.

// Furthermore, take note that when setting the staticCount variable, we don't use the keyword this, we use the class name as a qualifier.

// Now that our class is setup, create another class Test in which we'll create instances of A and see how the different members operate.
