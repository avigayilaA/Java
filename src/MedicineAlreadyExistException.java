public class MedicineAlreadyExistException extends Exception {
    public MedicineAlreadyExistException(String name) {
        super("Medicine " + name + " already exists");
    }
}
