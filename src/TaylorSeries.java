public class TaylorSeries {
    double approximation = 0;

    public static int factorial(int num){
        if (num == 0) {
            return 1;
        }
        else{
            return num * factorial(num - 1);
        }
    }

    public double arctgFunction(double x,int n){
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
