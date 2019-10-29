public class MatrixComplex {
    private Integer rows;
    private Integer cols;
    private Complex[][] mat;

    public MatrixComplex(Integer rows, Integer cols) {
        this.rows = rows;
        this.cols = cols;
        this.mat = new Complex[rows][cols];
        for (int i = 0 ; i < rows; i++)
            for (int j = 0; j < cols; j++)
                this.mat[i][j] = new Complex(0.0,0.0);
    }

    public Integer getRows() {
        return rows;
    }

    public void setRows(Integer rows) {
        this.rows = rows;
    }

    public Integer getCols() {
        return cols;
    }

    public void setCols(Integer cols) {
        this.cols = cols;
    }

    public Complex[][] getMat() {
        return mat;
    }

    public void setMat(Complex[][] mat) {
        this.mat = mat;
    }

    public MatrixComplex addMatrixComplex (MatrixComplex a){
        MatrixComplex sum = new MatrixComplex(a.rows,a.cols);
        if (this.getRows() != a.rows || this.getCols()  != a.cols) {// daca n au aceeasi dimensiune nu le putem aduna
            System.out.println("eroare");
        }
        else {

            for (int i = 0; i < sum.rows; i++) {
                for (int j = 0; j < sum.cols; j++) {
                    sum.mat[i][j] = this.mat[i][j].addComplex(a.mat[i][j]);
                }
            }
        }
        return sum;
    }
    public MatrixComplex subMatrixComplex (MatrixComplex a){
        MatrixComplex sub = new MatrixComplex(a.rows,a.cols);
        if (this.getRows() != a.rows || this.getCols()  != a.cols) {// daca n au aceeasi dimensiune nu le putem scadea
            System.out.println("eroare");
        }
        else {

            for (int i = 0; i < sub.rows; i++) {
                for (int j = 0; j < sub.cols; j++) {
                    sub.mat[i][j] = this.mat[i][j].subComplex(a.mat[i][j]);
                }
            }
        }
        return sub;
    }

    public MatrixComplex mulMatrixComplex (MatrixComplex a){
        MatrixComplex mul = new MatrixComplex(this.getRows(),a.cols);
        if (this.getCols() != a.rows) { // (m,n) x (n,p) = (m,p)
            System.out.println("eroare");
        }
        else {
            Complex nextElement = new Complex (0.0,0.0);
            for (int i = 0; i < mul.rows; i++){
                for (int j = 0; j < mul.cols; j++){
                    nextElement.setReal(0.0);
                    nextElement.setImag(0.0);
                    for (int k = 0; k < this.getCols(); k++){
                         nextElement = nextElement.addComplex(this.getMat()[i][k].mulComplex(a.getMat()[k][j]));
                    }
                    mul.mat[i][j].setReal(nextElement.getReal());
                    mul.mat[i][j].setImag(nextElement.getImag());
                }
            }
        }
        return mul;
    }

    public MatrixComplex dotProduct (Complex scalar){
        MatrixComplex dot = new MatrixComplex(this.getRows(), this.getCols());
        for (int i = 0 ; i < this.getRows(); i++){
            for (int j = 0 ; j < this.getCols(); j++){
                dot.getMat()[i][j] = this.getMat()[i][j].mulComplex(scalar);
            }
        }
        return dot;
    }

    public void printMatrixComplex (){
        for (int i = 0 ; i < this.rows; i++){
            for (int j = 0 ; j < this.cols; j++){
                this.mat[i][j].printComplex();
            }
            System.out.println();
        }
        System.out.println();
    }
}
