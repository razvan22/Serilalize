package com.company;

import java.io.*;

public class File {

    public static void serialize(String path, Object object )throws IOException {
        String filePath = path+".dat";

        try (ObjectOutputStream objectWriter = new ObjectOutputStream(new BufferedOutputStream(new FileOutputStream(filePath)))) {
            objectWriter.writeObject(object);
        }catch (Exception e){
            System.out.println(e);
        }
    }
    public static Object deSerialize(String path) throws IOException {
        String filePath = path+".dat";
        Object currentObject = null;
        try(ObjectInputStream read = new ObjectInputStream(new BufferedInputStream(new FileInputStream(filePath)))) {
                try {
                    currentObject =  read.readObject();
                } catch (IOException ex) {
                    ex.printStackTrace();
                } catch (ClassNotFoundException ex) {
                    ex.printStackTrace();
                }
        }
        return currentObject;
    }
}
