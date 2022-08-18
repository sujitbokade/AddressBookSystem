package com.bridgelabz.addressbooksystem;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class FileIO {
    static final String FILE_PATH = "C:\\Users\\Vitthal\\IdeaProjects\\Day10_Assignment_Problem\\src\\com\\bridgelabz\\addressbooksystem\\Contacts.txt";

    static boolean read() throws FileNotFoundException {
        File filePath = new File(FILE_PATH);
        for (File file : filePath.listFiles()) {
            System.out.println("AddressBook name: " + file.getName());
            Scanner scanner = new Scanner(file);
            while (scanner.hasNextLine()) {
                System.out.println(scanner.nextLine());
            }
        }
        return true;
    }

    static boolean write(ArrayList<Contact> addressBook, String addressBookName) throws IOException {
        File file = new File(FILE_PATH + addressBookName + ".txt");
        boolean isCreated = file.createNewFile();
        if (!isCreated) {
            file.delete();
            file.createNewFile();
        }
        System.out.println("file created");
        FileWriter fileWriter = new FileWriter(file);
        String data = "";
        for (Contact contact : addressBook) {
            data = data.concat(contact.toString()).concat("\n");
        }
        System.out.println(data);
        fileWriter.write(data);
        fileWriter.close();
        return true;
    }
}
