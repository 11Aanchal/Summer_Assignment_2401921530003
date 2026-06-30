interface test {
    void square(int n);
}

class Arithmetic implements test {
    public void square(int n) {
        System.out.println("Square: " + (n * n));
    }
}

class Outer {
    void display() {
        System.out.println("Outer class display");
    }

    class Inner {
        void display() {
            System.out.println("Inner class display");
        }
    }
}
class Point {
    private int x, y;

    Point() {
        x = 0;
        y = 0;
    }
    Point(int x, int y) {
        this.x = x;
        this.y = y;
    }
    void setX(int x) {
        this.x = x;
    }
    void setY(int y) {
        this.y = y;
    }
    void setXY(int x, int y) {
        this.x = x;
        this.y = y;
    }
    void show() {
        System.out.println("Point: (" + x + "," + y + ")");
    }
}
class Box {
    int length, breadth;

    Box(int l, int b) {
        length = l;
        breadth = b;
    }
    int area() {
        return length * breadth;
    }
}
class Box3D extends Box {
    int height;
    Box3D(int l, int b, int h) {
        super(l, b);
        height = h;
    }
    int volume() {
        return length * breadth * height;
    }
}
public class OOPSDemo {
    public static void main(String[] args) {
        Arithmetic a = new Arithmetic();
        a.square(5);
        Outer o = new Outer();
       o.display();
        Outer.Inner i = o.new Inner();
        i.display();
        Point p = new Point(2, 3);
        p.show();
        Box3D b = new Box3D(2, 3, 4);
        System.out.println("Area: " + b.area());
        System.out.println("Volume: " + b.volume());
    }
}
