public class BoxVolume {
    double length, width, breadth;

    public BoxVolume(double len, double wid, double brd) {
        this.length = len;
        this.width = wid;
        this.breadth = brd;
    }

    void calculateVolume() {
        System.out.println("The volume of the box is : " + (length * width * breadth));
    }

    public static void main(String args[]) {
        BoxVolume box = new BoxVolume(10, 20, 30);
        box.calculateVolume();
    }
    
}
