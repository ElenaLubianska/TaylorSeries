public class TaylorSeries extends TaylorSeriesFact{
    static double approximation = 0;

    public static double arctgFunction(double x, int n){

        int[] arr = new int[]{0, 1, 0, -2, 0};

        for (int i = 0; i < n; i++) {
            double coefficient = arr[i];
            double numerator = Math.pow(x, i);
            double denominator = factorial(i);
            approximation += (coefficient * (numerator / denominator));
        }
        return approximation;
    }
}
