import java.util.concurrent.TimeUnit;
public class InfiniteSeries {

// 1) Write a method called myexp that takes x and n as parameters and
// estimates ex by adding the first n terms of this series.
// the numerator of each term is the same as its predecessor multiplied by x,
// the denominator is the same as its predecessor multiplied by i

// 2) Write a method called check that takes a parameter, x,
// and displays x, myexp(x), and Math.exp(x).


    public static double main(String[] args) {

        System.out.println("Enter an integer");
        int n = 0;
        double x = 0;
        for (double i = 0.1; i <= 100; i *= 10)
            check(x, n);
        return x;
    }
        public static double myexp ( double x, int n){
            double numer = 1;
            double denom = 1;
            double total = 1;
            for (int i = 1; i <= n; i++) {
                x = 0;
                numer *= x;
                denom *= i;
                 total += numer / denom;


            }
            return total;
        }




    private static double check(double x, int n) {
        double exp = myExp(x, n);
        System.out.println(+x);
        System.out.println(+ exp);
        return exp;
    }

    private static double myExp(double x, int n) {
        return x;
    }
}



