 class Calculator {
    public static double add(double a, double b) {
        return a + b;
    }
    public static double sub(double a, double b) {
        return a - b;
    }
    public static double mul(double a, double b) {
        return a * b;
    }
    public static double div(double a, double b) {
        if (b != 0) {
            return a / b;
        }
        
    }
    public static int modul(int a, int b) {
        if (a != 0) {
            return a % b;
        }
    }
    public static double squareroot(double a) {
        if (a >= 0) {
            return Math.sqrt(a);
        }
    }
    public static double exponential(double base, double exponent) {
        return Math.pow(base, exponent);
    }
    public static double logarithm(double a, double b) {
        if (a > 0 && b > 1) {
            return Math.log(a) / Math.log(b);
        }
        else
        {
        
    }

    public static void main(String[] args) {
    }
}
