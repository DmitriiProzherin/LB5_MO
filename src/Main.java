public class Main {
    static double eps = 1e-4 / 2.0;
    public static void main(String[] args) {
    System.out.printf("%3s%10s%10s%10s%10s%10s%10s%10s\n",
                "k", "length", "a", "b", "left", "right", "f_left", "f_right");
    double x_min = GoldenRatio.search_naive_recursive(-1, 1, eps);
    double f_min = GoldenRatio.f(x_min);
    System.out.printf("Точка минимума: %10f\nМинимальное значение функции: %10f", x_min, f_min);
    }
}