package com.company.Task6;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.rmi.server.ExportException;

public class Circle implements Shape, Serializable {
    int radius;

    public Circle(int radius){
        this.radius = radius;
    }

    @Override
    public void getView() {
        System.out.println("Something that looks like Circle");
        System.out.println("Radius = " + radius);
    }

    public void setRadius(int radius){
        this.radius = radius;
    }

    public int getRadius(){
        return this.radius;
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
