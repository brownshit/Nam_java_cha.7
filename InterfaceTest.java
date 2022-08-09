class A{        //User
    public void methodA(B b){
        b.methodB();
    }
}
class B{        //Provider
    public void methodB(){
        System.out.println("method B()");
    }
}

//단점 : A, B중 한곳이 변경되면 다른쪽도 변경이 필수적으로 되어야 한다는 것
public class InterfaceTest {
    public static void main(String[] args) {
        A a = new A();
        a.methodA(new B());
    }

}
