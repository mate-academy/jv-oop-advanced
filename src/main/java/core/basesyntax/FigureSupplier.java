package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    public Random randomObjectInitialization = new Random();
    public ColorSupplier colorSupplierObjectInitialization = new ColorSupplier();
    public final String[] figures = {"circle", "square", "right triangle", "rectangle", "isosceles trapezoid"};

    public Figure getRandomFigure() {
        int randomNumber = randomObjectInitialization.nextInt(figures.length);
        String figureFromFigures = figures[randomNumber];
        switch (figureFromFigures) {
            case "circle":
                return getRandomCircle();
            case "square":
                return getRandomSquare();
            case "right triangle":
                return getRandomRightTriangle();
            case "rectangle":
                return getRandomRectangle();
            default:
                return getRandomIsoscelesTrapezoid();
        }
    }

    public Circle getRandomCircle() {
        String randomColor = colorSupplierObjectInitialization.getRandomColor();
        int randomRadius = randomObjectInitialization.nextInt(10) + 1;
        return new Circle(randomColor, randomRadius);
    }

    public Square getRandomSquare() {
        String randomColor = colorSupplierObjectInitialization.getRandomColor();
        int randomSide = randomObjectInitialization.nextInt(10) + 1;
        return new Square(randomColor, randomSide);
    }

    public RightTriangle getRandomRightTriangle() {
        String randomColor = colorSupplierObjectInitialization.getRandomColor();
        int randomLeg = randomObjectInitialization.nextInt(10) + 1;
        return new RightTriangle(randomColor, randomLeg);
    }

    public Rectangle getRandomRectangle() {
        String randomColor = colorSupplierObjectInitialization.getRandomColor();
        int randomHeight = randomObjectInitialization.nextInt(10) + 1;
        int randomWidth = randomObjectInitialization.nextInt(10) + 1;
        return new Rectangle(randomColor, randomHeight, randomWidth);
    }

    public IsoscelesTrapezoid getRandomIsoscelesTrapezoid() {
        String randomColor = colorSupplierObjectInitialization.getRandomColor();
        int randomUpperSide = randomObjectInitialization.nextInt(10) + 1;
        int randomLowerSide = randomObjectInitialization.nextInt(10) + 1;
        int randomLeg = randomObjectInitialization.nextInt(10) + 1;
        int randomHeight = randomObjectInitialization.nextInt(10) + 1;
        return new IsoscelesTrapezoid(randomColor, randomUpperSide, randomLowerSide, randomHeight, randomLeg);
    }
}

