package com.company.Task6;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.rmi.server.ExportException;

public class Square implements Shape, Serializable {
    private int side;

    public Square(int side) {
        this.side = side;
    }

    @Override
    public void getView() {
        System.out.println("Something that looks like Square");
        System.out.println("Side = " + side);
    }

    public void setSide(int length) {
        this.side = side;
    }

    public int getSide() {
        return side;
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
