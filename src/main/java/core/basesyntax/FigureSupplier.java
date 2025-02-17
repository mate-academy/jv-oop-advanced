package core.basesyntax;

import java.util.Random;

public class FigureSupplier {

    private double getRandomProperty() {
        Random randomNumber = new Random(); // random properties
        double randomProperty = randomNumber.nextInt(0, 10);
        return randomProperty;
    }

    public Figure getRandomFigure() {
        Random randomFigure = new Random();
        ColorSupplier randomColor = new ColorSupplier();
        RightTriangle rightTriangle = new RightTriangle();
        rightTriangle.setFirstLeg(getRandomProperty());
        rightTriangle.setSecondLeg(getRandomProperty());
        rightTriangle.setHeight(getRandomProperty());
        rightTriangle.setColor(randomColor.getRandomColor());
        Square square = new Square();
        square.setSide(getRandomProperty());
        square.setColor(randomColor.getRandomColor());
        IsoscelesTrapezoid isoscelesTrapezoid = new IsoscelesTrapezoid();
        isoscelesTrapezoid.setFirstLeg(getRandomProperty());
        isoscelesTrapezoid.setSecondLeg(getRandomProperty());
        isoscelesTrapezoid.setHeight(getRandomProperty());
        isoscelesTrapezoid.setColor(randomColor.getRandomColor());
        Circle circle = new Circle();
        circle.setRadius(getRandomProperty());
        circle.setColor(randomColor.getRandomColor());
        Rectangle rectangle = new Rectangle();
        rectangle.setFirstLeg(getRandomProperty());
        rectangle.setSecondLeg(getRandomProperty());
        rectangle.setColor(randomColor.getRandomColor());
        Figure[] figures = {rightTriangle, square, isoscelesTrapezoid, circle, rectangle};
        int randomIndex = randomFigure.nextInt(figures.length);
        return figures[randomIndex];
    }

    public Figure getDefaultFigure() {
        Circle constantCircle = new Circle();
        constantCircle.setRadius(10);
        constantCircle.setColor("white");
        return constantCircle;
    }
}
