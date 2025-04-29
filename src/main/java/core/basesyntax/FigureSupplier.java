package core.basesyntax;

import java.util.Random;

public class FigureSupplier {

    private double getRandomProperty() {
        Random randomNumber = new Random(); // random properties
        int lowerBound = 1;
        int upperBound = 10;
        double randomProperty = randomNumber.nextInt(upperBound - lowerBound) + lowerBound;
        return randomProperty;
    }

    public Figure getRandomFigure() {
        Random randomFigure = new Random();
        ColorSupplier randomColor = new ColorSupplier();
        RightTriangle rightTriangle = new RightTriangle();
        rightTriangle.setFirstLeg(getRandomProperty());
        rightTriangle.setSecondLeg(getRandomProperty());
        rightTriangle.setColor(randomColor.getRandomColor());
        rightTriangle.print();
        Square square = new Square();
        square.setSide(getRandomProperty());
        square.setColor(randomColor.getRandomColor());
        square.print();
        IsoscelesTrapezoid isoscelesTrapezoid = new IsoscelesTrapezoid();
        isoscelesTrapezoid.setFirstLeg(getRandomProperty());
        isoscelesTrapezoid.setSecondLeg(getRandomProperty());
        isoscelesTrapezoid.setHeight(getRandomProperty());
        isoscelesTrapezoid.setColor(randomColor.getRandomColor());
        isoscelesTrapezoid.print();
        Circle circle = new Circle();
        circle.setRadius(getRandomProperty());
        circle.setColor(randomColor.getRandomColor());
        circle.print();
        Rectangle rectangle = new Rectangle();
        rectangle.setFirstLeg(getRandomProperty());
        rectangle.setSecondLeg(getRandomProperty());
        rectangle.setColor(randomColor.getRandomColor());
        rectangle.print();
        Figure[] figures = {rightTriangle, square, isoscelesTrapezoid, circle, rectangle};
        int randomIndex = randomFigure.nextInt(figures.length);
        Figure result = figures[randomIndex];
        return result;
    }

    public Figure getDefaultFigure() {
        Circle constantCircle = new Circle();
        constantCircle.setRadius(10);
        constantCircle.setColor("white");
        constantCircle.print();
        return constantCircle;
    }
}

