public class Main {
    public static void main (String[] args){
        Complex a = new Complex(0.0,2.0);
        Complex b = new Complex(1.0,-1.0);
        Complex sum = a.addComplex(b);

        MatrixComplex m = new MatrixComplex(2,2);
        m.getMat()[0][0] = a;
        m.getMat()[0][1] = b;
        m.getMat()[1][0] = sum;

        MatrixComplex p = new MatrixComplex(2,2);
        p.getMat()[0][0] = a.addComplex(sum);
        p.getMat()[1][0] = sum;
        p.getMat()[1][1] = sum.addComplex(a);

        MatrixComplex sumMatrix = m.addMatrixComplex(p);
        MatrixComplex subMatrix = m.subMatrixComplex(p);
        MatrixComplex mulMatrix = m.mulMatrixComplex(p);
        Complex scalar = new Complex (3.0,0.0);
        MatrixComplex dotMatrix = m.dotProduct(scalar);

        m.printMatrixComplex();
        p.printMatrixComplex();
        sumMatrix.printMatrixComplex();
        subMatrix.printMatrixComplex();
        mulMatrix.printMatrixComplex();
        dotMatrix.printMatrixComplex();
/*
        Complex prod = new Complex();
        prod = a.mulComplex(b);
        a.printComplex();
        b.printComplex();
        prod.printComplex();
*/
    }
}
