public class FighterTest {
    public static void main(String[] args) {

        Fighter f = new Fighter();

        if(f instanceof Unit){
            System.out.println("f는 Unit 클래스의 자손클래스");
        }
        if(f instanceof Fightable){
            System.out.println("f는 Fightable 인터페이스를 구현");
        }
        if(f instanceof Movable){
            System.out.println("f는 Movable 인터페이스를 구현");
        }
        if(f instanceof Attackable){
            System.out.println("f는 Attackable 인터페이스를 구현");
        }
    }
}
//instanceof
//isinstance        두개의 메소드의 사용법을 숙지하고있자!!

class Fighter extends Unit implements Fightable{
    public void move(int x, int y){/*내용 생략*/}
    public void attack(Unit u){/*내용 생략*/}
}
class Unit{
    int CurrentHP;
    int x; int y;
}
interface Fightable extends Movable, Attackable{}
interface Movable{void move(int x, int y);}
interface Attackable{ void attack(Unit u);} //메서드의 선언만 한 것.

/**
 * 인터페이스 -> 인터페이스 : extends
 * 클래스 -> 클래스       : extends
 * 인터페이스 -> 클래스   : implement
 *
 * extends : 확장하다
 * implement : 구체화 하다
 * **/