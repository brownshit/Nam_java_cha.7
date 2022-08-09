public class RepairableTest {
    public static void main(String[] args) {
        Tank_RT tank = new Tank_RT();
        Dropship_RT dropship = new Dropship_RT();

        Marine_RT marine = new Marine_RT();
        SCV_RT scv = new SCV_RT();

        scv.repair(tank);
        scv.repair(dropship);
        //scv.repair(marine);       marine은 리페어 인터페이스가 implements 되어 있지 않아서 리페어가 불가능하다.

    }
}
//인터페이스의 선언
interface Repairable_RT{}

//클래스의 선언
class GroundUnit_RT extends Unit_RT {
    GroundUnit_RT(int HP){
        super(HP);      //Unit_RT의 생성자에 HP넣어서 해당 유닛 인스턴스 생성
    }
}

class AirUnit_RT extends Unit_RT {
    AirUnit_RT(int HP){
        super(HP);
    }
}
class Unit_RT {
    int hitpoint;
    final int MAX_HP;       //아직 초기화가 안된상태
    Unit_RT(int HP){
        MAX_HP = HP;        //여기서 초기화를 시켜주면 된다.
    }
    //...그 외의 Unit에 대한 동적 메서드들
}

class Tank_RT extends GroundUnit_RT implements Repairable_RT{
    Tank_RT(){
        super(150);
        hitpoint = MAX_HP;
    }

    public String toString(){
        return "TANK";
    }
}

class Dropship_RT extends AirUnit_RT implements Repairable_RT{
    Dropship_RT(){
        super(125);     //해당 생성자가 실행되면 조상의 조상,Unit의 인스턴스가 생성, HP가 125가 들어가 상수가 초기화 된다.
        hitpoint = MAX_HP;
    }

    public String toString(){
        return "DROPSHIP";
    }
}

class Marine_RT extends GroundUnit_RT{
    Marine_RT(){
        super(40);
        hitpoint = MAX_HP;
    }
    public String toString(){
        return "MARINE";
    }
}

class SCV_RT extends GroundUnit_RT implements Repairable_RT{
    SCV_RT(){
        super(60);
        hitpoint = MAX_HP;
    }

    void repair(Repairable_RT rrt){     //해당 인터페이스를 인수로 받으면 상속받게된 하위 클래스의 인스턴스가 대신 들어간다.
        if(rrt instanceof Unit_RT){
            Unit_RT u = (Unit_RT)rrt;       //Casting(형변환)을 통해서 유닛형식의 인스턴스에 넣어준다.
            while(u.hitpoint !=u.MAX_HP){       //MAX_HP와 hitpoint가 같아질때까지 계속 힐
                /**HP증가시킨다.**/
                u.hitpoint++;
            }
            System.out.println(u.toString()+"의 수리가 끝났습니다.");
        }
    }
}
