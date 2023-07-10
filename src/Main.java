import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Inventory inventory = new Inventory();

        Pills pill1 = null;
        try {
            pill1 = new Pills("Acamol", "Teva", "teva@gmail.com", 100, 50, "2025", Medicine.Type.PILLS, 50);
        } catch (InvalidEmailAddressException e) {
            e.printStackTrace();
        }
        Pills pill2 = null;
        try {
            pill2 = new Pills("Nurafen", "Lupin", "lupin@gmail.com", 170, 0, "2024", Medicine.Type.PILLS, 20);
        } catch (InvalidEmailAddressException e) {
            e.printStackTrace();
        }
        Pills pill3 = null;
        try {
            pill3 = new Pills("Advil", "Cipla", "cipla@gmail.com", 30, 0, "2024", Medicine.Type.PILLS, 70);
        } catch (InvalidEmailAddressException e) {
            e.printStackTrace();
        }

        try {
            inventory.addMedicine(pill1);
        } catch (MedicineAlreadyExistException e) {
            e.printStackTrace();
        }
        try {
            inventory.addMedicine(pill2);
        } catch (MedicineAlreadyExistException e) {
            e.printStackTrace();
        }

        try {
            inventory.addMedicine(pill3);
        } catch (MedicineAlreadyExistException e) {
            e.printStackTrace();
        }
        Syrup syrup1 = null;
        try {
            syrup1 = new Syrup("Acamol Syrup", "Teva", "teva@gmail.com", 40, 10, "2025", Medicine.Type.SYRUP, 30);
        } catch (InvalidEmailAddressException e) {
            e.printStackTrace();
        }
        Syrup syrup2 = null;
        try {
            syrup2 = new Syrup("Nurufen Syrup", "Lupin", "lupin@gmail.com", 150, 30, "2023", Medicine.Type.SYRUP, 80);
        } catch (InvalidEmailAddressException e) {
            e.printStackTrace();
        }
        Syrup syrup3 = null;
        try {
            syrup3 = new Syrup("Tiptap", "Cipla", "cipal@gmail.com", 200, 0, "2026", Medicine.Type.SYRUP, 10);
        } catch (InvalidEmailAddressException e) {
            e.printStackTrace();
        }
        try {
            inventory.addMedicine(syrup1);
        } catch (MedicineAlreadyExistException e) {
            e.printStackTrace();
        }
        try {
            inventory.addMedicine(syrup2);
        } catch (MedicineAlreadyExistException e) {
            e.printStackTrace();
        }
        try {
            inventory.addMedicine(syrup3);
        } catch (MedicineAlreadyExistException e) {
            e.printStackTrace();
        }

        Inhaler in1 = null;
        try {
            in1 = new Inhaler("Ventolin", "Glaxo Wellcome", "Glaxo Wellcome@gmail.com", 100, 0, "2025", Medicine.Type.INHALER, 60);
        } catch (InvalidEmailAddressException e) {
            e.printStackTrace();
        }
        Inhaler in2 = null;
        try {
            in2 = new Inhaler("Irbonet", "Relax,", "Relax@gmail.com", 120, 100, "2025", Medicine.Type.INHALER, 30);
        } catch (InvalidEmailAddressException e) {
            e.printStackTrace();
        }
        Inhaler in3 = null;
        try {
            in3 = new Inhaler("Steroidim", "Paldo,", "Paldo@gmail.com", 90, 65, "2025", Medicine.Type.INHALER, 150);
        } catch (InvalidEmailAddressException e) {
            e.printStackTrace();
        }
        try {
            inventory.addMedicine(in1);
        } catch (MedicineAlreadyExistException e) {
            e.printStackTrace();
        }
        try {
            inventory.addMedicine(in2);
        } catch (MedicineAlreadyExistException e) {
            e.printStackTrace();
        }
        try {
            inventory.addMedicine(in3);
        } catch (MedicineAlreadyExistException e) {
            e.printStackTrace();
        }
        //search by name-if name wont exist an error will appear
        try {
            inventory.searchMedicineByName("acamol");
        } catch (MedicineDoesNotExistException e) {
            e.printStackTrace();
        }
        //  search by type-print it out to see there is no error
        System.out.println("All medicine from " + (Medicine.Type.SYRUP) + " type are:");
        for (Medicine medicine1 :  inventory.searchMedicineByType(Medicine.Type.SYRUP)) {
            System.out.println(medicine1.toString());
        }
        //search for medicine in stock-quantity >0
        System.out.println("All medicine in stock");
        for (Medicine medicine2 : inventory.getMedicinesInStock()) {
            System.out.println(medicine2.toString());
        }
        //add existing medicine
        try {
            inventory.addMedicine(pill1);
        } catch (MedicineAlreadyExistException e) {
            e.printStackTrace();
        }
        //search for non-existing medicine
        try {
            inventory.searchMedicineByName("acamo");
        } catch (MedicineDoesNotExistException e) {
            e.printStackTrace();
        }
        //add medicine with not valid email
        Inhaler in4 = null;
        try {
            in4 = new Inhaler("New Ventolin", "Glaxo Wellcome1", "Glaxo Wellcomegmail.com", 100, 0, "2025", Medicine.Type.INHALER, 60);
        } catch (InvalidEmailAddressException e) {
            e.printStackTrace();
        }
        //because email is in correct it wasnt added to array list, it will fail on null pointer exception since in4= null
        if (in4 != null) {
            try {
                inventory.addMedicine(in4);
            } catch (MedicineAlreadyExistException e) {
                e.printStackTrace();
            }
        } else {
            // Handle the case where in4 is null (e.g., display an error message)
            System.out.println("Invalid Inhaler object");
        }
    }
}

