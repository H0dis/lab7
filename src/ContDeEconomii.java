public class ContDeEconomii extends ContBancar {
    private double limita;

    public ContDeEconomii(double limitaImpusa) {
        this.limita = limitaImpusa;
    }

    @Override
    public boolean withdraw(double amount) {
        if (balance - amount >= limita) {
            balance -= amount;
            return true;
        } else {
            System.out.println("Nu puteți retrage suma");
            return false;
        }
    }
}