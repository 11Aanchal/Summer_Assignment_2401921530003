import java.util.Random;
abstract class Compartment {
    public abstract String notice();
}

class FirstClass extends Compartment {
    public String notice() {
        return "Notice: This is First Class Compartment";
    }
}

class Ladies extends Compartment {
    public String notice() {
        return "Notice: This is Ladies Compartment";
    }
}

class General extends Compartment {
    public String notice() {
        return "Notice: This is General Compartment";
    }
}

class Luggage extends Compartment {
    public String notice() {
        return "Notice: This is Luggage Compartment";
    }
}
public class TestCompartment {
    public static void main(String[] args) {
        Compartment[] c = new Compartment[10];
        Random r = new Random();

        for (int i = 0; i < 10; i++) {
            int num = r.nextInt(4) + 1;

            switch (num) {
                case 1:
                    c[i] = new FirstClass();
                    break;
                case 2:
                    c[i] = new Ladies();
                    break;
                case 3:
                    c[i] = new General();
                    break;
                case 4:
                    c[i] = new Luggage();
                    break;
            }

            System.out.println(c[i].notice());
        }
    }
}
