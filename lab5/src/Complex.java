public class Complex {
    private Double real;
    private Double imag;

    public Complex(Double real, Double imag) {
        this.real = real;
        this.imag = imag;
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

    public void printComplex (){
        if (this.imag < 0.0)
            System.out.print(this.real + " " + this.imag + "i    ");
        else if (this.imag == 0.0)
            else System.out.print(this.real);
            else System.out.print(this.real + " +" + this.imag + "i   ");
    }
}
