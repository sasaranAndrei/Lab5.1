public class Main {
    public static void main (String[] args){
        Complex a = new Complex(4.0,2.0);
        Complex b = new Complex(1.0,8.0);
        Complex sum = a.addComplex(b);

        MatrixComplex m = new MatrixComplex(1,3);
        m.getMat()[0][0] = a;
        m.getMat()[0][1] = b;
        m.getMat()[0][2] = sum;

        m.printM    atrixComplex();
    }
}
