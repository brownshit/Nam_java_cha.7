public class TimeTest {
    public static void main(String[] args) {
        Time t = new Time(12,35,30);
        System.out.println(t);//toString메소드가 실행된다.
        t.setHour(t.getHour()+1);
        System.out.println(t);
    }
}

class Time{
    private int hour;
    private int min;
    private int sec;

    Time(int h, int m, int s){      //이 부분이 핵심이다. why? private 선언된 매개변수들을 public메서드들을 통해서 변경할 수 있게 해줬다.
        setHour(h);
        setMin(m);
        setSec(s);
    }

    public int getHour(){return hour;}
    public void setHour(int h){
        if(hour<0||hour>23) return;
        this.hour = h;
    }

    public int getMin(){return min;}
    public void setMin(int m){
        if(min<0||min>59) return;
        this.min = m;
    }

    public int getSec(){return sec;}
    public void setSec(int s){
        if(sec<0||sec>59) return;
        this.sec = s;
    }

    public String toString(){
        return hour+" "+min+" "+sec;
    }
}
