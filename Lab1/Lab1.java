import static java.lang.Math.*;

// 26442
public class Lab1 {
    public static void main(String[] args) {
        short a[] = new short[9];
        for (int i = 0; i <= 8; i++) {
            short j = 22;
            a[i] = j;
            j -= 2;
        }

        double x[] = new double[13];
        for (int i = 0; i < 13; i++) {
            x[i] = random() * (-15) + 4;
        }

        double w[][] = new double[9][13];
        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 13; j++) {
                w[i][j] = calculateElement(a[i], x[j]);
            }
        }
        
        printMatrix(w);
    }
    
    public static double calculateElement(short aValue, double xValue) {
        if (aValue == 8) {
            return pow(E, cos(pow(xValue, xValue / 0.5)));
        } else if (aValue == 10 || aValue == 14 || aValue == 16 || aValue == 18) {
            return log(pow(sin(pow(pow(((xValue - 1) / 2) / 3, 2), 0.5)), 2));
        } else {
            return log(sqrt(pow(pow(abs(xValue), 2) + 1, 2)));
        }
    }
    
    public static void printMatrix(double[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                String str = String.format("%7.4f ", matrix[i][j]);
                System.out.print(str);
            }
            System.out.println();
        }
    }
}
