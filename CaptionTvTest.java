import java.util.*;

class Tv{
    boolean power;
    int channel;

    void power(){power = !power;}
    void channelUp(){++channel;}
    void channelDown(){--channel;}
}

class CaptionTv extends Tv{
    boolean Caption;        //캡션상태 on/off
    //인스턴스 변수의 default는 0이다. (boolean자료형)

    void displayCaption(String text){
        if(Caption){        //캡션이 on일때
            System.out.println(text);
        }
    }
}

public class CaptionTvTest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Line that shows in display : ");
        String input = scanner.nextLine();

        CaptionTv ctv = new CaptionTv();
        ctv.channel = 10;
        ctv.channelUp();
        System.out.println(ctv.channel);
        ctv.displayCaption(input);
        ctv.Caption = true;
        ctv.displayCaption(input);
    }
}//class end.
