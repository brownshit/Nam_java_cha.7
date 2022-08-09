public class DefaultmethodTest {
    public static void main(String[] args) {
        Child_DT c = new Child_DT();
        c.method1();
        c.method2();
        Myinterface.staticMethod();
        Myinterface2.staticMethod();
    }
}

class Child_DT extends Parent_DT implements Myinterface, Myinterface2{
    public void method1(){
        System.out.println("method1() in Child");
    }
}

class Parent_DT{
    public void method2(){
        System.out.println("method2() in Parent");
    }
}

interface Myinterface{
    default void method1(){
        System.out.println("method1() in Myinterface");
    }

    default void method2(){
        System.out.println("method2() in Myinterface");
    }

    static void staticMethod(){     //static메서드는 인스턴스 생성없이 main에서 호출이 가능하다!
        System.out.println("staticmethod() in Myinterface");
    }
}

interface Myinterface2{
    default void method1(){
            //아래 문장은 출력할수 있는 방법이 없다. 인터페이스를 상속받은 클래스가 오버라이딩을 해버려서.
        System.out.println("method1() in Myinterface2");
    }

    static void staticMethod(){
        System.out.println("staticMethod() in Myinterface2");
    }
}