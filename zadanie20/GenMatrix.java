package zadanie20;

public class GenMatrix <T extends Number> {
    private T[][] matrix;
    private int rows;
    private int columns;

    public GenMatrix(T[][] matrix) {
        this.matrix = matrix;
        this.rows = matrix.length;
        this.columns = matrix[0].length;
    }
    public T[][] getMatrix() {
        return matrix;
    }
    public int getRows() {
        return rows;
    }
    public int getColumns() {
        return columns;
    }

    public GenMatrix add(GenMatrix a) {
        if(rows != a.getRows() || columns != a.getColumns()) {
            System.out.println("NO!");
            return null;
        }
        Double[][] res = new Double[rows][columns];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                res[i][j] = matrix[i][j].doubleValue() + a.getMatrix()[i][j].doubleValue();
            }
        }
        return new GenMatrix(res);
    }

    public GenMatrix multiply(GenMatrix a) {
        if (this.getColumns() != a.getRows()) {
            System.out.println("NO");
            return null;
        }
        Double[][] res = new Double[rows][a.getColumns()];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < a.getColumns(); j++) {
                res[i][j] = 0.0;
            }
        }
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < a.getColumns(); j++) {
                for (int n = 0; n < columns; n++) {
                    res[i][j] += matrix[i][n].doubleValue() * a.getMatrix()[n][j].doubleValue();
                }
            }
        }
        return new GenMatrix(res);
    }
    public GenMatrix substrat(GenMatrix a) {
        if(rows != a.getRows() || columns != a.getColumns()) {
            System.out.println("NO!");
            return null;
        }
        Double[][] res = new Double[rows][columns];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                res[i][j] = matrix[i][j].doubleValue() - a.getMatrix()[i][j].doubleValue();
            }
        }
        return new GenMatrix(res);
    }

}
