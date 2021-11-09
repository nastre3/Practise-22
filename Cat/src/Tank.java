public class Tank {
    int x = 0;
    
    public Tank() {
        this(0);
    }
    
    public Tank(int x) {
        this.x = x;
    }


    public void goForward(int x) {
        this.x += x;
    }

    public void goBackward(int x) {
        this.x -= x;
    }

    public void printPosition() {
        System.out.printf("The Tank is at %d now.\n", x);
    }
}
