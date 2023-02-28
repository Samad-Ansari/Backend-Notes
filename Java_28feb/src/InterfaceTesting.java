
interface Shape {
    void draw();

    static int u = 1;
    static void  uMethod(){
        System.out.println("Shape UMethod : " + u);
    }

    final int v = 2;
    default void vMethod(){
        System.out.println("Shape VMethod : " + v);
    }

    public int w = 3;
    private void wMethod(){
        System.out.println("Shape WMethod : " + w);
    }

}

class Circle implements Shape{
    public void draw(){
        System.out.println("Draw Circle");
    }
}

// Multiple Inheritance

interface Father {
    static String gender = "male";
    final String address = "53/2";
    public int age = 33;

    default void eats(){
        System.out.println("Father is a ");
        System.out.println("I'm a vegiterian");
    }
}

public class InterfaceTesting {
    public static void main(String[] args) {
        Circle c = new Circle();
        c.draw();

        c.vMethod(); // default method only

        System.out.println("Object " + c.u);
        System.out.println("Object " + c.v);
        System.out.println("Object " + c.w);

        System.out.println("Shape " + Shape.u);
        System.out.println("Shape " + Shape.v);
        System.out.println("Shape " + Shape.w);

        Shape.uMethod();
//        Shape.vMethod();
//        Shape.wMethod();




    }
}
