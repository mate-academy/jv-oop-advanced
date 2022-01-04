package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    private static final int AMOUNT_OF_FIGURES = 5;

    public Figure getRandomFigure() {
        int randomFigure = new Random().nextInt(AMOUNT_OF_FIGURES);
        switch (randomFigure) {
            case 1: return getRandomCircle();
            case 2: return getRandomIsoscelesTrapezoid();
            case 3: return getRandomRectangle();
            case 4: return getRandomRightTriangle();
            default: return getRandomSquare();
        }
    }

    public Figure getDefaultFigure() {
        String color = new ColorSupplier().getDefaultColor();
        double radius = 10;
        return new Circle(color, radius);
    }

    private double getRandomNumber(double maxNumber) {
        return new Random().nextInt(20) + 1;
    }

    private Figure getRandomCircle() {
        String color = new ColorSupplier().getRandomColor();
        double radius = getRandomNumber(20);
        return new Circle(color, radius);
    }

    private Figure getRandomIsoscelesTrapezoid() {
        String color = new ColorSupplier().getRandomColor();
        double baseSideLine = getRandomNumber(20);
        double topSideLine = getRandomNumber(20);
        double height = getRandomNumber(20);
        return new IsoscelesTrapezoid(color, baseSideLine, topSideLine, height);
    }

    private Figure getRandomRectangle() {
        String color = new ColorSupplier().getRandomColor();
        double sideOne = getRandomNumber(20);
        double sideTwo = getRandomNumber(20);
        return new Rectangle(color, sideOne, sideTwo);
    }

    private Figure getRandomRightTriangle() {
        String color = new ColorSupplier().getRandomColor();
        double firstLeg = getRandomNumber(20);
        double secondLeg = getRandomNumber(20);
        return new RightTriangle(color, firstLeg, secondLeg);
    }

    private Figure getRandomSquare() {
        String color = new ColorSupplier().getRandomColor();
        double side = getRandomNumber(20);
        return new Square(color, side);
    }
}
