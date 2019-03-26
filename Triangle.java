package com.company.Task6;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.rmi.server.ExportException;

public class Triangle implements Shape, SideChanging, Serializable {
    private int[] lengthOfSides;

    public Triangle(int[] lengthOfSides) {
        this.lengthOfSides = lengthOfSides;
    }

    @Override
    public void getView() {
        System.out.println("Something that looks like Triangle");
        System.out.println("Size: (" + lengthOfSides[0] + ", " + lengthOfSides[1] + ", " + lengthOfSides[2] + ")");
    }

    public void changeInfo(int length, int index) {
        lengthOfSides[index] = length;
    }

    public int getInfo(int index) {
        return lengthOfSides[index];
    }

    public void writeObject() {
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(
                new String(getClass() + "-" + hashCode() + ".xml")))) {
            oos.writeObject(this);
        } catch (ExportException e) {
            System.out.println(e.getMessage());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
