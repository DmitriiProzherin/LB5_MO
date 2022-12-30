public class GoldenRatio {
    private static int k = 0;
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

        System.out.printf("%3d%10f%10f%10f%10f%10f%10f%10f\n",
                k, length, a, b, left, right, f_left, f_right);
        k++;
        if (length < 2*eps) {
            k = 0;
            return a + length / 2.0;
        }

        if (f_left < f_right) return search_naive_recursive(a, right, eps);
        else return search_naive_recursive(left, b, eps);
    }

}
