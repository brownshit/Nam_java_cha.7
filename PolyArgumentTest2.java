class Product_PAT2{
    int price;
    int bonusPoint;

    Product_PAT2(int price){     //super(price); 와 connect된다.
        this.price = price;
        bonusPoint = (int)(price/10.0); //보너스 점수는 가격의 10%
    }

    Product_PAT2(){}//기본생성자
}

class TV_PAT2 extends Product_PAT2{
    TV_PAT2 (){
        //조상클래스의 생성자 product(int price)를 호출한다.
        super(100);
    }
    public String toString(){
        return "TV";
    }
}

class Computer_PAT2 extends Product_PAT2{
    Computer_PAT2 (){
        super(200);
    }
    public String toString(){
        return "Computer";
    }
}

class Audio_PAT2 extends Product_PAT2{
    Audio_PAT2 (){
        super(50);
    }
    public String toString(){
        return "Audio";
    }
}


class Buyer2{        //인스턴스 생성의 목적.
    int money = 1000;
    int bonusPoint = 0;

    Product_PAT2[] item = new Product_PAT2[10];     //구입된제품을 저장하기 위한 배열
        //10의 size를 갖는 배열을 선언해주었다.
    int i = 0;  //Product 배열에 사용될 카운터

    void buy(Product_PAT2 p){
        if(money<p.price){
            System.out.println("잔액부족.");
            return;
        }

        money-=p.price;
        bonusPoint +=p.bonusPoint;

        //제품을 Product[] item에 저장한다.
        item[i++] = p;

        System.out.println(p+"구매완료.");
    }

    void Summery(){
        int sum = 0;
        String itemList = "";       //구입한 물품목록

        for(int i = 0; i<item.length; i++){
            if(item[i] == null) break;
            sum += item[i].price;
            itemList += (i==0) ? ""+ item[i] : "" + item[i];
            //마지막콤마 없애는 코드
        }
        System.out.println("구입하신 물품의 총 금액은 "+sum+"만원입니다.");
        System.out.println("구입하신 제품은 "+itemList+"입니다.");
    }
}

public class PolyArgumentTest2 {
    public static void main(String[] args) {
        Buyer2 b = new Buyer2();      //기본 생성자

        b.buy(new TV_PAT2());
        b.buy(new Computer_PAT2());
        b.buy(new Audio_PAT2());
        b.Summery();
    }

}
