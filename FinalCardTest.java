class Card_for_FCT{
    final int NUMBER;
    final String KIND;
    static int width = 100;
    static int height = 250;

    Card_for_FCT(String kind, int num){
        this.NUMBER = num;
        this.KIND = kind;
    }
    Card_for_FCT(){
        this("Heart",1);
    }

    public String toString(){
        return KIND+" "+NUMBER;
    }
    //난 아직도 얘의 쓰임새를 잘 모르겠다. toString 메서든 건 알겠는데 이거 오버라이딩인가?

}

public class FinalCardTest {
    public static void main(String[] args) {
        Card_for_FCT c = new Card_for_FCT("Heart",10);
        //c.NUMBER = 5;     얘는 이미 초기화가 된 상수이므로, 더이상 값의 변경은 일어날 수 없다.
        System.out.println(c.KIND);
        System.out.println(c.NUMBER);
        System.out.println(c);
        //System.out.println(c.toString);   과 같다.
    }

}
