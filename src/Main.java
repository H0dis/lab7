public class Main {
    public static void main(String[] args) {
        ContBancar cont1 = new ContBancar();
        cont1.deposit(3700);
        cont1.withdraw(50);
        System.out.println("Balance of cont1: " + cont1.getBalance());

        ContDeEconomii cont2 = new ContDeEconomii(3000);
        cont2.deposit(400);
        cont2.withdraw(1200);
        System.out.println("Balance of cont2: " + cont2.getBalance());

        ContDeCredit cont3 = new ContDeCredit(3000, 1000);
        cont3.withdraw(600);
        System.out.println("Balance of cont3: " + cont3.getBalance());
    }
}