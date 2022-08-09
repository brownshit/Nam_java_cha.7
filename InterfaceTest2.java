class A2{
    void autoPlay (I2 i){
        //I2자체가 매개변수로 들어오면 자손클래스 B2의 인스턴스가 온다
        i.play();
    }
}

interface I2{
    public abstract void play();    //메서드는 무조건 public abstract 붙는다 생략가능
}

class B2 implements I2{
    public void play(){
        System.out.println("play in B class");
    }
}

class C2 implements I2{
    public void play(){
        System.out.println("play in C class");
    }
}

public class InterfaceTest2 {
    public static void main(String[] args) {
        A2 a = new A2();
        a.autoPlay(new B2());
        //메서드 선언시에는 인터페이스지만 호출은 자손 클래스로 들어가야 한다.
        a.autoPlay(new C2());
        //void autoPlay(I2 i) 호출.
    }
}
