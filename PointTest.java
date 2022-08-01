public class PointTest {
    public static void main(String[] args) {
        Point3D p3 = new Point3D(1,2,3);
        System.out.println(p3.getLocation());

        Point_pointtest pp = new Point_pointtest(p3.x, p3.y);
        System.out.println(pp.getLocation());
    }
}

class Point_pointtest{
    int x; int y;

    Point_pointtest(int x, int y){
        this.x = x;
        this.y = y;
    }

    String getLocation(){
        return "x : "+x+" , y : "+y;
    }
}

class Point3D extends Point_pointtest{
    int z;
    Point3D(int x, int y, int z){   //super
        super(x,y);
        this.z = z;
    }
    String getLocation(){
        return "x : "+x+" , y : "+y+" , z : "+z;
    }
}