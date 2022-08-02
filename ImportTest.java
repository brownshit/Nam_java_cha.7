import java.text.SimpleDateFormat;
import java.util.Date;

public class ImportTest {
    public static void main(String[] args) {
        Date today = new Date();

        SimpleDateFormat date = new SimpleDateFormat("yyyy/MM/dd");
                                                            //보면 y는 년도 M은 월 d는 날짜 이렇게 할당된 값이 있다!
        SimpleDateFormat time = new SimpleDateFormat("hh:mm:ss a");

        System.out.println("오늘 날짜는 "+date.format(today));
        System.out.println("현재 시각은 "+time.format(today));
    }
}
