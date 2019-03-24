package com.company.Task6;

import java.io.*;
import java.rmi.server.ExportException;
import java.util.ArrayList;

public class Group implements Serializable {
    ArrayList<Shape> shapes;

    public Group(ArrayList<Shape> shapes){
        this.shapes = shapes;
    }

    public void addShape(Shape shape){
        shapes.add(shape);
    }

    public void removeShape(Shape shape){
        shapes.remove(shape);
    }

    public void printView(){
        for(Shape shape : shapes){
            shape.getView();
        }
    }

    public void writeObject(){
        try(ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(
                new String(getClass() + "-" + hashCode()+ ".xml")))){
            oos.writeObject(this);
        }
        catch (ExportException e){
            System.out.println(e.getMessage());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }


}


