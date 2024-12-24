package loops;

public class Program14_FactorOfNumber {

    public static void main(String[] args) {
        int n = 100;
        for (int i = 1; i <= n / i; i++) {
            if(n%i == 0){
                System.out.println(i);
                if(n/i != i)
                    System.out.println(n/i);
            }
        }

    }
}
