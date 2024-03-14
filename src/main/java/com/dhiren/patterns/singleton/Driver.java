package com.dhiren.patterns.singleton;

import java.io.File;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.nio.file.Files;

import static com.dhiren.patterns.singleton.DateUtils.FILE_PATH;

public class Driver {
    public static void main(String[] args) {
        DateUtils dateUtils = DateUtils.getDateUtilsInstance();
        DateUtils dateUtils2 = DateUtils.getDateUtilsInstance();
        DateUtils dateUtils3;
        System.out.println(dateUtils == dateUtils2);

        try (
                ObjectOutputStream oos = new ObjectOutputStream(Files.newOutputStream(new File(FILE_PATH).toPath()));
                ObjectInputStream ois = new ObjectInputStream(Files.newInputStream(new File(FILE_PATH).toPath()))
        ) {
            oos.writeObject(dateUtils);
            dateUtils3 = (DateUtils) ois.readObject();
        } catch (IOException | ClassNotFoundException e) {
            throw new RuntimeException(e);
        }

        System.out.println(dateUtils == dateUtils3);

    }
}
