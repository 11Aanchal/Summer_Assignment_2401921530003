interface Playable {
    void play();
}
class Veena implements Playable {
    public void play() {
        System.out.println("Playing Veena");
    }
}
class Saxophone implements Playable {
    public void play() {
        System.out.println("Playing Saxophone");
    }
}
public class Test {
    public static void main(String[] args) {
        
        Veena v = new Veena();
        v.play();
      
        Saxophone s = new Saxophone();
        s.play();
    
        Playable p;

        p = v;
        p.play();

        p = s;
        p.play();
    }
}
