public class BindingTest2 {
    public static void main(String[] args) {
        Parent_BT2 p2 = new Parent_BT2();
        Child_BT2 c2 = new Child_BT2();

        System.out.println(p2.x);
        p2.method();

        System.out.println(c2.x);//child 클래스가 parent클래스를 extend 하기 때문에
                                //객체를 만들어도 Parent 클래스의 인스턴스들을 사용가능
        c2.method();


    }
}
class Parent_BT2{
    int x = 100;//인스턴스 변수
    void method(){//인스턴스 매서드
        System.out.println("Parent method");
    }
}
class Child_BT2 extends Parent_BT2{ }