final class Singleton{
    private static Singleton s = new Singleton();
    //위의 생성자는 static이다.
    private Singleton(){
        //...
    }
    public static Singleton getInstance(){      //static으로 해줘야 하는데, psvm에서 메서드를 사용하려면 클래스메서드를 호출해야하기 때문이다.
        if(s == null) s=new Singleton();
        return s;
    }//애는 인스턴스를 생성하고 반환하는 메서드이다. why?? 생성자가 private이기 때문에. 동시에 이 클래스는 상속이 불가하다.
}

public class SingletonTest {
    public static void main(String[] args) {
        //Singleton s = new Singleton();        얘는 생성자가 private 이기 때문에 인스턴스 생성이 안된다.
        //그렇기 때문에 getInstance메서드를 이용해서 인스턴스를 생성해줄수 있다.
        Singleton s = Singleton.getInstance();//인스턴스 생성완료
    }

}
