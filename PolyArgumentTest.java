class Product_PAT{
    int price;
    int bonusPoint;

    Product_PAT(int price){     //super(price); 와 connect된다.
        this.price = price;
        bonusPoint = (int)(price/10.0); //보너스 점수는 가격의 10%
    }
}

class TV_PAT extends Product_PAT{
    TV_PAT (){
        //조상클래스의 생성자 product(int price)를 호출한다.
        super(100);
    }

    public String toString(){
        return "TV";
    }
}

class Computer_PAT extends Product_PAT{
    Computer_PAT (){
        super(200);
    }
    public String toString(){
        return "Computer";
    }
}

class Buyer{        //인스턴스 생성의 목적.
    int money = 1000;
    int bonusPoint = 0;

    void buy(Product_PAT p){
        if(money<p.price){
            System.out.println("잔액부족.");
            return;
        }

        money-=p.price;
        bonusPoint +=p.bonusPoint;
        System.out.println("구매완료.");
    }
}

public class PolyArgumentTest {
    public static void main(String[] args) {
        Buyer b = new Buyer();      //기본 생성자

        b.buy(new TV_PAT());
        b.buy(new Computer_PAT());

        System.out.println("잔액 : "+b.money);
        System.out.println("보유 Point : "+b.bonusPoint);
    }

}
