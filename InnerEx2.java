public class InnerEx2 {
    class InstanceInner{}
    static class StaticInner{}

    //인스턴스 멤버간에는 서로 직접 접근이 가능하다.
    InstanceInner iv = new InstanceInner();
    //static 멤버간에는 서로 직접 접근이 가능하다.
    StaticInner cv = new StaticInner();

    static void staticMethod(){
        //static메서드는 인스턴스 멤버에 직접 접근할 수 없다.
    //  InstanceInner obj1 = new InstanceInner();

        StaticInner obj2 = new StaticInner();
        /**
         * 굳이 접근하려면 아래와 같이 객체를 생성해야 한다.
         * 인스턴스 클래스는 외부 클래스를 먼저 생성해야만 생성할 수 있다.
         *      ㄴ 접근 자체가 인스턴스가 있어야 가능하기 때문에 먼저 외부 클래스의 인스턴스가 필요한 것.
         */
        InnerEx2 ie2 = new InnerEx2();
        InstanceInner obj1 = ie2.new InstanceInner();   //기본생성자로 인스턴스가 생성된다.
    }

    void instancemethod(){
        //인스턴스 메서드에서는 인스턴스 멤버와 static멤버 모두 접근 가능하다.
        InstanceInner obj1 = new InstanceInner();
        StaticInner obj2 = new StaticInner();

        //메서드 내에 지역적으로 성넌된 내부 클래스는 외부에서 접근할 수 없다.(클래스 자체가 캡슐화가 되어버린다.)
    //  LocalInner lv = new LocalInner();
    }

    void mymethod(){
        class LocalInner{}
        LocalInner lv = new LocalInner();
    }
}
