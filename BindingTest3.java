public class BindingTest3 {
    public static void main(String[] args) {
        Parent_BT3 p3 = new Parent_BT3();
        Child_BT3 c3 = new Child_BT3();

        System.out.println("p3.x = "+p3.x);
        p3.method();
        System.out.println();
        System.out.println("c3.x = "+c3.x);
        c3.method();
    }
}
class Parent_BT3{
    int x = 100;
    void method(){
        System.out.println("Parent method");
    }
}
class Child_BT3 extends Parent_BT3{
    int x = 200;

    void method(){
        System.out.println("x = "+x);//200
        System.out.println("super.x = "+super.x);//100
        System.out.println("this.x = "+this.x);//200
    }
}