public abstract class Medicine {
    private String medicineName;
    private String companyName;
    private String companyEmail;
    private double price;
    private int quantity;
    private String expirationYear;
    Type type;

    enum Type {
        PILLS, SYRUP, INHALER
    }

    public Medicine() {
    }

    public Medicine(String medicineName, String companyName, String companyEmail, double price, int quantity, String expirationYear, Type type) throws InvalidEmailAddressException {
        setMedicineName(medicineName);
        setCompanyName(companyName);
        setCompanyEmail(companyEmail);
        setPrice(price);
        setQuantity(quantity);
        setExpirationYear(expirationYear);
        setType(type);
    }

    public void setMedicineName(String medicineName) {
        this.medicineName = medicineName.toUpperCase();
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public void setCompanyEmail(String companyEmail) throws InvalidEmailAddressException {
        if (companyEmail.contains("@") && companyEmail.charAt(0) != '@' && !companyEmail.endsWith("@") && companyEmail.indexOf('@') < companyEmail.lastIndexOf('.')) {
            this.companyEmail = companyEmail;
        } else {
            throw new InvalidEmailAddressException(companyEmail);
        }
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public void setExpirationYear(String expirationYear) {
        this.expirationYear = expirationYear;
    }

    public void setType(Type type) {
        this.type = type;
    }

    public String getMedicineName() {
        return medicineName;
    }

    public String getCompanyName() {
        return companyName;
    }

    public String getCompanyEmail() {
        return companyEmail;
    }

    public double getPrice() {
        return price;
    }

    public int getQuantity() {
        return quantity;
    }

    public String getExpirationYear() {
        return expirationYear;
    }

    public Type getType() {
        return type;
    }

    public abstract int totalInventory();

    public boolean inStock() {
        if (quantity > 0) return true;
        else return false;
    }

    public String toString() {
        return "medicineName=" + medicineName + ", companyName=" + companyName + ", companyEmail=" + companyEmail + ", price=" + price + ", quantity=" + quantity + ", expirationYear=" + expirationYear + ", type=" + type;
    }
}
