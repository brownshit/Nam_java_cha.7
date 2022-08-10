class Outer{
    class InstanceInner_4{  //인스턴스 클래스
        int iv = 100;
    }
    static class StaticInner_4{     //static 클래스
        int iv = 200;
        static int cv = 300;
    }
    void myMethod_4(){      //지역 클래스를 위한 내부 메서드
        class LocalInner_4{
            int iv = 400;
            //iv자체는 상수 취급이되어버리나,,??! JDK 1.8부터는 그런다는데
        }
    }
}
public class InnerEx4 {
    public static void main(String[] args) {

        //인스턴스 클래스의 인스턴스를 생성하려면
        //외부 클래스의 인스턴스를 먼저 생성해야한다.
        Outer oc = new Outer();
        Outer.InstanceInner_4 ii = oc.new InstanceInner_4();
        //인스턴스 내의 인스턴스 느낌

        System.out.println("ii.iv : "+ii.iv);
        System.out.println("Outer.StaticInner.cv : "+Outer.StaticInner_4.cv);


        //스태틱 내부 클래스의 인스턴스는 외부 클래스를 먼저 생성하지 않아도 된다.
        Outer.StaticInner_4 si = new Outer.StaticInner_4();
        //바로 스태틱 클래스 인스턴스의 선언
        System.out.println("si.iv : "+si.iv);
        System.out.println("Outer.StaticInner_4.cv : "+Outer.StaticInner_4.cv);
    }
}
