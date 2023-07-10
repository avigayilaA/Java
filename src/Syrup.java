public class Syrup extends Medicine {
    private int bottleContent;

    public Syrup() {
    }

    public Syrup(int bottleContent) {
        setBottleContent(bottleContent);
    }

    public Syrup(String medicineName, String companyName, String companyEmail, double price, int quantity, String expirationYear, Type type, int bottleContent) throws InvalidEmailAddressException {
        super(medicineName, companyName, companyEmail, price, quantity, expirationYear, type);
        setBottleContent(bottleContent);
    }

    public void setBottleContent(int bottleContent) {
        this.bottleContent = bottleContent;
    }

    public int getBottleContent() {
        return bottleContent;
    }

    @Override
    public int totalInventory() {
        return bottleContent * getQuantity();
    }

    public String toString() {
        return super.toString() + ", bottleContent=" + bottleContent;
    }

}
