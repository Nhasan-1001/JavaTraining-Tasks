public class Q38_MultiLevel_Inheritance {
    public static void main(String[] args) {
        C obj1 = new C(50);
    }
}

class A{
    public A (int n){
        System.out.println("Parameterized Constructor for CLASS A :"+n);
        method1();
    }
    public void method1(){
        System.out.println("This is CLASS A METHOD");
    }
}
class B extends A
{
 public B (int n){
     super(5);
     System.out.println("Parameterized Constructor for CLASS B:"+n);
     method2();
 }
 public void method2 (){
     System.out.println("This is CLASS B METHOD");
 }
}
class C extends B
{
    public C(int n){
        super(8);
        System.out.println("Parameterized Constructor for CLASS C:"+n);
        method3 ();
    }
    public void method3 (){
        System.out.println("This is CLASS C METHOD");
    }
}
