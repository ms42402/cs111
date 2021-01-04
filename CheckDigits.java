public class CheckDigits {
    
    public static void main (String[] args) {

        long digit = Long.parseLong(args[0]);
        long i = 0;
        long right = 0;
        long right2 = 0;
        long sum1 = 0;
        long sum2 = 0;
        while (i <= 6) {
            right = digit % 10;
            sum1 = right + sum1;
            digit = digit / 10;
            right2 = digit % 10;
            sum2 = right2 + sum2;
            digit = digit / 10;
            i++;
        }
        sum1 = sum1 % 10;
        sum2 = sum2 % 10;
        sum2 = sum2 * 3;
        sum2 = sum2 % 10;
        long sum;
        sum = sum1 + sum2;
        sum = sum % 10;
        System.out.println(sum);

    }
}
