class sample1 {
    int a;
    public int b;
    private int c;
    protected int d;
}

public class access {
    public static void main(String[] args) {
        sample1 ob = new sample1();
        ob.a = 10;
        ob.b = 20;
        ob.c= 30; // error as c is private
        ob.d=40;

        System.out.println(ob.a);
        System.out.println(ob.b);
        System.out.println(ob.d);
    }
}