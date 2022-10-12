package generics;


public class BoundedClass{
    public static void main(String[] args) {
       MultipleBound<A> obj = new MultipleBound<>(new A());
       obj.run();
    }
 }
 
 interface B {
    public void execute();
 }
 
 class A implements B{
    public void execute(){
       System.out.println("Inside class A");
    }
 }
 
 class MultipleBound<T extends A & B>{
    private T objRef;
    public MultipleBound(T obj){
       this.objRef = obj;
    }
    public void run(){
       this.objRef.execute();
    }
 }
