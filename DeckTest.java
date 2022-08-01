public class DeckTest {
    public static void main(String[] args) {
        Deck d = new Deck();            //카드 한벌을 만든다.
        Card c = d.pick(0);       //섞기 전에 제일 위의 카드를 뽑는다.
        System.out.println(c);          //출력

        d.shuffle();                    //random으로 섞는다.
        c= d.pick(0);
        System.out.println(c);          //출력
    }
}



//Deck class
class Deck{
    //final은 변수의 상수화. 상수값을 변경시키려고 하면 오류가 발생한다.
    final int CARD_NUM = 52;
    Card cardArr[] = new Card[CARD_NUM];    //Card객체 배열을 포함

    Deck(){     //deck의 카드를 초기화 한다.
        int i = 0;
        for(int k = Card.KIND_MAX; k>0;k--){
            for(int n =0; n<Card.NUM_MAX; n++)
                cardArr[i++] = new Card(k, n+1);
        }
    }

    //아래의 두 메서드는 오버로딩된다.
    Card pick(int index){
        return cardArr[index];//index 위치의 카드를 한장 꺼내서 반환.
    }

    Card pick(){
        int index = (int)(Math.random()*CARD_NUM);
        return pick(index);//바로 위의 메서드가 실행된다. 왜 굳이 2단계로 나눴을까,,??!
    }

    void shuffle(){
        for(int i =0; i< cardArr.length; i++){
            int r = (int)(Math.random()*CARD_NUM);

            Card temp = cardArr[i];
            cardArr[i] = cardArr[r];
            cardArr[r] = temp;
        }
    }
}//Deck end.



//Card class
class Card{
    static final int KIND_MAX = 4;  //카드 무늬 수
    static final int NUM_MAX = 13;  //무늬 별 카드 수

    static final int SPADE = 4;
    static final int DIAMOND = 3;
    static final int HEART = 2;
    static final int CLOVER = 1;

    int kind;
    int number;

    Card(){
        this(SPADE,1);
    }

    Card(int kind, int number){
        this.kind = kind;
        this.number = number;
    }

    public String toString(){
        String [] kinds = {"","CLOVER","HEART","DIAMOND","SPADE"};
        String numbers = "0123456789XJQK";  //숫자 10은 x로 표현

        return "kind : "+kinds[this.kind]+" , number : "+numbers.charAt(this.number);
    }//toString 의 끝
}