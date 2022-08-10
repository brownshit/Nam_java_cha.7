public class InnerEx6_anonymous_class {

    Object iv = new Object(){void method(){}};
    static Object cv = new Object(){void method2(){}};

    void mymethod(){
        Object lv = new Object(){void method3(){}};
    }
}
