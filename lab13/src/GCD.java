public class GCD {
    public int forGCD(int num1,int num2) {
        int gcd = 1;
        for (int i = 1; i <= num1 && i <= num2; i++) {
            if ((num1%i == 0) && (num2%i == 0)) {
                gcd = i;
            }
        }
        return gcd;
    }
    public int whileGCD(int num1,int num2) {
        while (num1 != num2) {
            if (num1 > num2) {
                num1 = num1 - num2;
            }
            else {
                num2 = num2 - num1;
            }
        }
        return num1;
    }
    public int recurseGCD(int num1,int num2) {
        if (num2 !=0) {
            return recurseGCD(num2,num1%num2);
        }
        else {
            return num1;
        }
    }
}
