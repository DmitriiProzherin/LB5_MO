public class GoldenRatio {

    public static final double phi = (Math.pow(5, 1/2.0) - 1) / 2.0;

    public static double f(double x){
        return Math.pow(x, 2);
    }


    public static double search_naive_recursive(double a, double b, double eps){
        double length = b - a;
        double left = a + length * (1 - phi);
        double right = a + length * phi;

        double f_left = f(left);
        double f_right = f(right);

        if (length < 2*eps) return a + length / 2.0;

        if (f_left < f_right) return search_naive_recursive(a, right, eps);
        else return search_naive_recursive(left, b, eps);
    }

}
