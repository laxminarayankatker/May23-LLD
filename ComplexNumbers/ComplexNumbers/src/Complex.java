public class Complex {
    private int  real ;
    private  int  imaginary ;

    public Complex()
    {

    }
    public Complex(int real,int imaginary)
    {
        this.real = real;
        this.imaginary=imaginary;
    }

    public Complex Add(Complex othernumber)
    {
        Complex result = new Complex();
        result.real = this.real+ othernumber.real;
        result.imaginary = this.imaginary+ othernumber.imaginary;
        return result;
    }
    public Complex Subtract(Complex othernumber)
    {
        Complex result = new Complex();
        result.real = this.real - othernumber.real;
        result.imaginary = this.imaginary - othernumber.imaginary;
        return result;
    }
    public void Display()
    {
        System.out.println("Complex Number Real..."+this.real+" Imaginary..."+this.imaginary);
    }
}
