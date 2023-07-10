public class Inhaler extends Medicine {
    private int amountOfClick;

    public Inhaler() {
    }

    public Inhaler(int amountOfClick) {
        this.amountOfClick = amountOfClick;
    }

    public Inhaler(String medicineName, String companyName, String companyEmail, double price, int quantity, String expirationYear, Type type, int amountOfClick) throws InvalidEmailAddressException {
        super(medicineName, companyName, companyEmail, price, quantity, expirationYear, Type.INHALER);
        this.amountOfClick = amountOfClick;
    }

    public void setAmountOfClick(int amountOfClick) {
        this.amountOfClick = amountOfClick;
    }

    public int getAmountOfClick() {
        return amountOfClick;
    }

    @Override
    public int totalInventory() {
        return amountOfClick * getQuantity();
    }

    public String toString() {
        return super.toString() + ", amountOfClick=" + amountOfClick;
    }
}
