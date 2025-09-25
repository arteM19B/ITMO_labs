import static java.lang.Math. *;

// 26442
public class Lab1 {
    public static void main (String [] args) {
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
                if (a[i] == 8) {
                    w[i][j] = pow(E, cos(pow(x[j], x[j] / 0.5)));
                } else if (a[i] == 10 || a[i] == 14 || a[i] == 16 || a[i] == 18) {
                    w[i][j] = log(pow(sin(pow(pow(((x[j] - 1) / 2) / 3, 2), 0.5)), 2));
                } else {
                    w[i][j] = log(sqrt(pow(pow(abs(x[j]), 2) + 1, 2)));
                }
            }
        }
        for(int i = 0; i <  9; i++) {
	        for(int j = 0; j <  13; j++) {
		        String str = String.format("%7.4f ", w[i][j]);
		        System.out.print(str);
	        }
	        System.out.println();
	    }

    }
}
