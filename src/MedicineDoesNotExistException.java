public class MedicineDoesNotExistException extends Exception {

    public MedicineDoesNotExistException(String name) {
        super("Medicine " + name + " doesnt exist");
    }
}
