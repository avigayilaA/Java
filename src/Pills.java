public class Pills extends Medicine {
    private int numOfPillsInBox;

    public Pills() {
    }

    public Pills(String medicineName, String companyName, String companyEmail, double price, int quantity, String expirationYear, Type type, int numOfPillsInBox) throws InvalidEmailAddressException {
        super(medicineName, companyName, companyEmail, price, quantity, expirationYear, type);
        setNumOfPillsInBox(numOfPillsInBox);
    }

    public Pills(int numOfPillsInBox) {
        setNumOfPillsInBox(numOfPillsInBox);
    }


    public int getNumOfPillsInBox() {
        return numOfPillsInBox;
    }

    public void setNumOfPillsInBox(int numOfPillsInBox) {
        this.numOfPillsInBox = numOfPillsInBox;
    }

    @Override
    public int totalInventory() {
        return numOfPillsInBox * getQuantity();
    }

    public String toString() {
        return super.toString() + ", numOfPills=" + numOfPillsInBox;
    }
}
