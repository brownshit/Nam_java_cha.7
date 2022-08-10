class Outer_5{
    int value = 10;     //Outer_5.this.value

    class Inner_5{
        int value = 20;     //this.value
        void method1(){
            int value = 30;
            System.out.println("           value : "+value);
            System.out.println("      this.value : "+this.value);
                                                    //this 의 의미는 해당 클래스
            System.out.println("Outer.this.value : "+Outer_5.this.value);
        }
    }
}

public class InnerEx5 {
    public static void main(String[] args) {
        Outer_5 outer = new Outer_5();
        Outer_5.Inner_5 inner = outer.new Inner_5();
        //생성한 인스턴스를 클래스 형태 참조형 변수에 대입해준다.
        inner.method1();
    }
}
