public class Main {
    public static void main(String[] args) {
        Complex c1 = new Complex(1,2);
        Complex c2 = new Complex(3,4);
        c1.Display();
        c2.Display();
        Complex c3 = c1.Add(c2);
        Complex c4 = c1.Subtract(c2);
        c3.Display();
        c4.Display();
        //System.out.println("Hello world!!!!");
    }
}