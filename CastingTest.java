public class CastingTest {
    public static void main(String[] args) {
        Car car = null;
        FireEngine fe = new FireEngine();
        FireEngine fe2 = null;

        fe.water();
        car =fe;        //자동 Casting
        // car.water();     컴파일 에러. Car타입의 참조변수로는 water를 호출 할 수 없다.
        fe2 = (FireEngine)car;      //조상타입-->자손타입
        fe2.water();

    }
}

class Car {
    String color;
    int door;

    void drive(){       //운전하는 기능
        System.out.println("drive Brrr~~");
    }

    void stop(){        //멈추는 기능
        System.out.println("stop!!");
    }
}

class FireEngine extends Car{
    void water(){
        System.out.println("water!!");
    }
}