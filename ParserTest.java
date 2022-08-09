interface Parseable{
    //구문 분석작업을 수행한다.
    public abstract void parse(String fileName);
            //위와 같이 추상메서드...(인터페이스에서의 메서드 선언방법)
            //public abstract 생략가능
}
//리턴타입이 인터페이스이다...
//ㄴ 메서드가 해당 인터페이스를 구현한 클래스의 인스턴스를 반환한다는 의미이다.

class ParseManager{
    //리턴타입이 Parseable 인터페이스이다.
    public static Parseable getParser(String type){
        if(type.equals("XML")){
            return new XMLParser();
        }else{
            Parseable p = new HTMLParser();
            return p;
            //return new HTMLParser(); 와 같다.

        }
    }
}

class XMLParser implements Parseable{
    //인터페이스에서 선언되었던 메소드를 가져와서 구체화 시켜야 한다.
    /**
     * 이때 모든 멤버메서드를 구체화 시킬수 있으면 클래스로 아니면 추상클래스나 인터페이스로 가져온다(extends implements)
    **/
    public void parse(String filename){
        //구문 분석작업을 위한 코드를 적는다.
        System.out.println(filename+"-XML parsing completed");
    }
}

class HTMLParser implements Parseable{
    public void parse(String filename){
        //구문 분석작업을 위한 코드를 적는다.
        System.out.println(filename+"-HTML parsing completed");
    }
}

public class ParserTest {
    public static void main(String[] args) {
        //인터페이스 형태에 넣는 것.
        Parseable parser = ParseManager.getParser("XML");
        parser.parse("document.xml");
        parser = ParseManager.getParser("HTML");
        parser.parse("document.html");
    }
}
