public class InnerEx1 {

    class InstanceInner{
        int iv = 100;
    //  static int cv = 100;        static 변수는 선언할 수 없다. 왜냐면 클래스 자체가 instance class이기 때문에
        final static int CONST = 100;   //final static은 상수이므로 가능하다.(그냥 static만 안된다.)
    }

    static class StaticInner{
        int iv = 200;
        static int cv = 200;
        //static 클래스만 static멤버를 정의할 수 있다. (static클래스가 아니면 -인스턴스 클래스이면- static멤버를 정의 할 수 없다.)
    }

    void myMethod(){
        class LocalInner{   //단지 메서드 안에서 클래스가 발견되면 지역클래스로 간주한다.
            int iv = 300;
    //      static int cv = 300;        //얘도 클래스가 인스턴스 기반 지역 클래스 이므로 static멤버를 정의해줄 수 없다.
            final static int CONST = 300;
        }
    }

    public static void main(String[] args) {
        System.out.println(InstanceInner.CONST);

        StaticInner st = new StaticInner();
        System.out.println("StaticInner"+st.iv);
        System.out.println("StaticInner"+StaticInner.cv);
        
    }
}
