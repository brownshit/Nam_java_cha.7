import static java.lang.System.out;
import static java.lang.Math.*;

public class StaticImportEx1 {
    public static void main(String[] args) {
        out.println(random());
        //System.out.println();여기서 System은 클래스였던거고 println이 클래스 매서드 였던거임
        out.println("Math.PI : "+PI);
    }

}
