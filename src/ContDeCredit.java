public class ContDeCredit extends ContBancar {
    private double sumaInitiala;
    private double plataLunara;

    public ContDeCredit(double sumaInitiala, double plataLunara) {
        this.sumaInitiala = sumaInitiala;
        this.plataLunara = plataLunara;
        balance = sumaInitiala;
    }

    @Override
    public boolean withdraw(double amount) {
        if (balance - amount >= -sumaInitiala) {
            balance -= amount;
            if (balance < 0) {
                double plataSuplimentara = Math.abs(balance);
                System.out.println("Ați depășit suma inițială. Trebuie să plătiți " + plataSuplimentara + " lunar.");
                balance = 0;
            }
            return true;
        } else {
            System.out.println("Nu puteți retrage suma specificată. Depășiți suma inițială disponibilă.");
            return false;
        }
    }
}