public class SuperTest {
    public static void main(String[] args) {
        Child c = new Child();
        c.method();
    }
}

class Parent{
    int x = 10;
}

class Child extends Parent{
    int x = 20;
    void method(){
        System.out.println("x = "+x);
        //애는 멤버의 오버라이딩!
            //Child의 x가 더 힘이 강하다.
        System.out.println("this.x = "+this.x);
        System.out.println("super.x = "+super.x);       //얜 Parent의 멤버를 반환한다. this와 반대의 느낌..!??
    }
}