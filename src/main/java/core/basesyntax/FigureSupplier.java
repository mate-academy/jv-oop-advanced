package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    private Random numFigure = new Random();
    private Random meaning = new Random();
    private ColorSupplier getColor = new ColorSupplier();

    public Figure getIsoscelesTrapezoid() {
        String color = getColor.getRandomColor();
        double randomMeaningA = meaning.nextDouble(10.00d);
        double randomMeaningB = meaning.nextDouble(10.00d);
        double randomMeaningC = meaning.nextDouble(10.00d);
        return new IsoscelesTrapezoid(randomMeaningB, randomMeaningA, randomMeaningC, color);
    }

    public Figure getCircle() {
        String color = getColor.getRandomColor();
        double randomMeaningR = meaning.nextDouble(10.00d);
        return new Circle(randomMeaningR, color);
    }

    public Figure getRightTriangle() {
        String color = getColor.getRandomColor();
        double randomMeaningA = meaning.nextDouble(10.00d);
        return new RightTriangle(randomMeaningA, color);
    }

    public Figure getRectangle() {
        String color = getColor.getRandomColor();
        double randomMeaningA = meaning.nextDouble(10.00d);
        double randomMeaningB = meaning.nextDouble(10.00d);
        return new Rectangle(randomMeaningA, randomMeaningB, color);
    }

    public Figure getSquare() {
        String color = getColor.getRandomColor();
        double randomMeaningA = meaning.nextDouble(10.00d);
        return new Square(randomMeaningA,color);
    }

    public Figure getRandomFigure() {
        switch (numFigure.nextInt(6)) {
            case 1:
                return getIsoscelesTrapezoid();
            case 2:
                return getCircle();
            case 3:
                return getRightTriangle();
            case 4:
                return getRectangle();
            case 5:
                return getSquare();
            default:
                return getRandomFigure();
        }
    }

    public Figure getDefaultFigure() {
        return new Circle(10, "WHITE");
    }
}

