public class InstanceofTest {
    public static void main(String[] args) {
        FireEngine fe = new FireEngine();

        if(fe instanceof FireEngine){
            System.out.println("FireEngine <O>");
        }
        if(fe instanceof Car){
            System.out.println("Car <O>");
        }
        if(fe instanceof Object){
            System.out.println("Object <O>");
        }
        System.out.println(fe.getClass().getName());
    }
}
