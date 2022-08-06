public class BindingTest {
    public static void main(String[] args) {
        Parent_BT p = new Parent_BT();
        Child_BT c = new Child_BT();

        System.out.println(p.x);
        p.method();

        System.out.println(c.x);
        c.method();

    }
}

class Parent_BT{
    int x = 100;//인스턴스 변수
    void method(){//인스턴스 매서드
        System.out.println("Parent method");
    }
}
class Child_BT extends Parent_BT{
    int x = 200;

    void method(){
        System.out.println("Child method");
    }
}

