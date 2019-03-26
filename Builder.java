package com.company.Task6;

public class Builder {


    public Shape buildTriangle(int[] lengthOfSides) throws InvalidInputException {
        if (lengthOfSides.length != 3 ||
                (lengthOfSides[0] + lengthOfSides[1] < lengthOfSides[2]) ||
                (lengthOfSides[1] + lengthOfSides[2] < lengthOfSides[0]) ||
                (lengthOfSides[2] + lengthOfSides[0] < lengthOfSides[1])) {
            throw new InvalidInputException();
        }
        return new Triangle(lengthOfSides);
    }

    public Shape buildCircle(int radius) {
        return new Circle(radius);
    }

    public Shape buildSquare(int length) {
        return new Square(length);
    }
}
