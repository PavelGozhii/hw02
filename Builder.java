package com.company.Task6;

public class Builder {

    public Shape builTriangle(int[] lengthOfSides) {
        if (lengthOfSides.length == 3) {
            return new Triangle(lengthOfSides);
        }else return null;
    }

    public Shape buildCircle(int radius){
        return new Circle(radius);
    }

    public Shape buildSquare(int length){
        return new Square(length);
    }
}
