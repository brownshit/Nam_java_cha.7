public class DrawShape {
    public static void main(String[] args) {
        Point[] p = {new Point(100, 200),
                new Point(140, 50),
                new Point(200, 100)
        };
        Triangle t = new Triangle(p);
        Circle c = new Circle(new Point(150,150),50);

        t.draw();
        c.draw();
    }
}

class Shape{        //모든 도형들은 형태를 가지고 있기 때문에 extends로 상속되게 된다.(Shape가)
    String color = "black";
    void draw(){
        System.out.printf("[color = %s]\n",color);
    }
}

class Point{        //has a 관계를 가지기 위해 필요한 클래스
    int x; int y;
    Point(int x, int y){
        this.x =x;
        this.y = y;
    }
    Point(){
        this(0,0);
    }
    String getXY(){
        return ("("+x+","+y+")");
    }
}
class Circle extends Shape{
    Point center;       //원은 Point를 가지고 있다 _ has a 관계
    int r;

    Circle(){
        this(new Point(0,0),100);
    }
    Circle(Point center, int r){
        this.center = center;
        this.r = r;
    }

    void draw(){        //원을 그리는 대신에 원의 정보를 출력하도록 했다.
        System.out.printf("[center = (%d, %d), r = %d, color = %s]\n", center.x, center.y, r,color);
    }

}

class Triangle extends Shape{
    Point[] p = new Point[3];   //삼각형은 Point를 3개 가지고 있다 _ has a 관계

    Triangle(Point[] p){
        this.p  = p;
    }

    void draw(){
        System.out.printf("[p1 = %s, p2 = %s, p3 = %s, color = %s]\n",p[0].getXY(),p[1].getXY(),p[2].getXY(),color);
    }
}

