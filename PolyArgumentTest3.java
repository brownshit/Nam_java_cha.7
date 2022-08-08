import java.util.*;

class Product_PAT3{
    int price;
    int bonuspoint;

    Product_PAT3(int p){
        this.price = p;
        bonuspoint = (int)(price/10.0);
    }

    Product_PAT3(){
        price = 0; bonuspoint = 0;
    }
}

class TV_PAT3 extends Product_PAT3{
    TV_PAT3(){ super(100);}
    public String toString(){ return "TV";}
}


class Computer_PAT3 extends Product_PAT3{
    Computer_PAT3(){ super(200);}
    public String toString(){ return "Computer";}
}

class Audio_PAT3 extends Product_PAT3{
    Audio_PAT3(){ super(50);}
    public String toString(){ return "Audio";}
}

class Buyer_PAT3{
    int money = 1000;
    int bonuspoint = 0;
    Vector item = new Vector();     //default로 10-의 크기의 배열을 가진다.

    void buy_PAT3(Product_PAT3 p){
        if(money<p.price){
            System.out.println("잔액부족");
            return;
        }
        money-= p.price;
        bonuspoint += p.bonuspoint;
        item.add(p);        //구입한 제품을 Vector에 저장한다.
        System.out.println(p+" 구매완료.");
    }

    void refund(Product_PAT3 p){      //p인스턴스 환불
        if(item.remove(p)){             //제품을 Vector에서 제거한다.
            money+=p.price;
            bonuspoint-=p.bonuspoint;
            System.out.println("환불완료");
        }else{
            System.out.println("구입하신 제품중 해당 상품이 없습니다.");
        }
    }

    void Summery(){
        int sum = 0;
        String itemList = "";       //무슨 형태일까

        if(item.isEmpty()){
            System.out.println("구입하신 제품이 없습니다.");
            return;
        }

        //반복문을 이용하여 구입한 물품의 총 가격과 목록을 만든다.
        for(int i = 0; i<item.size();i++){
            Product_PAT3 p = (Product_PAT3)item.get(i);
            sum+=p.price;
            itemList += (i==0)?""+p:", "+p;
            //itemList += ((i==0)?""+p:", "+p);
        }
        System.out.println("총 금액 : "+sum);
        System.out.println("구입하신 제품 : "+itemList);
    }
}

public class PolyArgumentTest3 {
    public static void main(String[] args) {
        Buyer_PAT3 b = new Buyer_PAT3();
        TV_PAT3 tv_pat3 = new TV_PAT3();
        Computer_PAT3 computer_pat3 = new Computer_PAT3();
        Audio_PAT3 audio_pat3 = new Audio_PAT3();

        b.buy_PAT3(tv_pat3);
        b.buy_PAT3(computer_pat3);
        b.buy_PAT3(audio_pat3);

        System.out.println();
        b.refund(computer_pat3);
        b.Summery();
    }

}
