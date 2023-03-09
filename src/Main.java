public class Main {
    public static void main(String[] args) {
        int account = 100;
        int pay = 1_003;
        int bonus;
        if (pay > 1_000) {
            bonus = pay / 100;
        } else {
            bonus = 0;
        }
        int balance = account + pay + bonus;
        System.out.println("Balance: " + balance + "rub." );
        System.out.println("Bonus: " + bonus + "rub." );



    }
}