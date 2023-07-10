import java.util.ArrayList;

public class Inventory {

    ArrayList<Medicine> medicinesArraylist = new ArrayList<>();

    public void addMedicine(Medicine medicine) throws MedicineAlreadyExistException {
        for (Medicine singleMedicine : medicinesArraylist) {
            if (medicine.getMedicineName().equalsIgnoreCase(singleMedicine.getMedicineName()))
                throw new MedicineAlreadyExistException(medicine.getMedicineName());
        }
        medicinesArraylist.add(medicine);
    }

    public Medicine searchMedicineByName(String name) throws MedicineDoesNotExistException {
        for (Medicine medicine : medicinesArraylist) {
            if (name.equalsIgnoreCase(medicine.getMedicineName())) return medicine;
        }
        {
            throw new MedicineDoesNotExistException(name);
        }
    }

    public ArrayList<Medicine> searchMedicineByType(Medicine.Type type) {
        ArrayList<Medicine> subMedicineArrayList = new ArrayList<>();
        for (Medicine medicine : medicinesArraylist) {
            if (medicine.getType().equals(type)) subMedicineArrayList.add(medicine);
        }
        return subMedicineArrayList;
    }

    public ArrayList<Medicine> getMedicinesInStock() {
        ArrayList<Medicine> subMedicineArrayList = new ArrayList<>();
        for (Medicine medicine1 : medicinesArraylist) {
            if (medicine1.inStock()) subMedicineArrayList.add(medicine1);
        }
        return subMedicineArrayList;
    }

}






