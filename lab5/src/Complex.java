public class Complex {
    private Double real;
    private Double imag;

    public Complex(Double real, Double imag) {
        this.real = real;
        this.imag = imag;
    }
    public Complex (){
        this(0.0,0.0);
    //    this.real = 0.0;
    //    this.imag = 0.0; // dupa am aflat care i duma cu constructoru care apeleaza constructoru de mai sus
    }
    public Double getReal() {
        return real;
    }

    public void setReal(Double real) {
        this.real = real;
    }

    public Double getImag() {
        return imag;
    }

    public void setImag(Double imag) {
        this.imag = imag;
    }

    public Complex addComplex (Complex a){
        Complex sum = new Complex(0.0,0.0);
        sum.real = this.real + a.real;
        sum.imag = this.imag + a.imag;
        return sum;
    }

    public Complex subComplex (Complex a){
        Complex sub = new Complex(0.0,0.0);
        sub.real = this.real - a.real;
        sub.imag = this.imag - a.imag;
        return sub;
    }

    public Complex mulComplex (Complex a){
        Complex mul = new Complex(0.0,0.0);
        mul.real = this.real * a.real - this.imag * a.imag;
        mul.imag = this.real * a.imag + this.imag * a.real;
        return mul;
    }

    public void printComplex (){

        if (this.imag < 0.0)
            System.out.print(this.real + " " + this.imag + "i    ");
        else if (this.imag == 0.0)
            System.out.print(this.real+ "    ");
        else if (this.real == 0.0)
            System.out.print(this.imag+"i  ");
        else System.out.print(this.real + " +" + this.imag + "i   ");
    }
}
