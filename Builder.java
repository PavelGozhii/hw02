package com.company.Task6;

public class Builder {


    public Shape buildTriangle(int[] lengthOfSides) throws InvalidInputException {
        //Checking valid input
        if (lengthOfSides.length == 3) {
            if (lengthOfSides[0] > 0 && lengthOfSides[1] > 0 && lengthOfSides[2] > 0) {
                if ((lengthOfSides[0] + lengthOfSides[1]) < lengthOfSides[2] &&
                        lengthOfSides[1] + lengthOfSides[2] < lengthOfSides[0] &&
                        lengthOfSides[2] + lengthOfSides[0] < lengthOfSides[1]) {
                    return new Triangle(lengthOfSides);
                }
            }
        }
        throw new InvalidInputException();

    }

    public Shape buildCircle(int radius) {
        return new Circle(radius);
    }

    public Shape buildSquare(int length) {
        return new Square(length);
    }
}

class InvalidInputException extends Throwable {
}
