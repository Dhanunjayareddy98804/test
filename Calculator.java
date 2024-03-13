class Calculator {
    public static void main(String calculate[]) {
        int total = add(5, 6);
        System.out.println(total);
        int total2 = sub(66, 36);
        System.out.println(total2);
        int total3 = mul(23, 3);
        System.out.println(total3);
        int total4 = div(40, 2);
        System.out.println(total4);
        double total5 = mod(100, 3);
        System.out.println(total5);
    }

    public static int add(int num1, int num2) {
        return num1 + num2;
    }

    public static int sub(int num1, int num2) {
        return num1 - num2;
    }

    public static int mul(int num1, int num2) {
        return num1 * num2;
    }

    public static int div(int num1, int num2) {
        return num1 / num2;
    }
    public static double mod(int num1, int num2) {
        return num1 % num2;
    }
}
