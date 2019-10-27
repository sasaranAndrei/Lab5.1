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

    public MatrixComplex add (MatrixComplex a){
        if (this.getRows() != a.rows || this.getCols()  != a.cols) {// daca n au aceeasi dimensiune nu le putem aduna
            System.out.println("");
        }
        MatrixComplex sum = new MatrixComplex(a.rows,a.cols);

    }


    public void printMatrixComplex (){
        for (int i = 0 ; i < this.rows; i++){
            for (int j = 0 ; j < this.cols; j++){
                this.mat[i][j].printComplex();
            }
            System.out.println();
        }
    }
}
