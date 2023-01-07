package core.basesyntax.figure;

import core.basesyntax.figure.color.ColorSupplier;
import core.basesyntax.figure.name.RandomName;
import java.util.Random;

public class FigureSupplier {
    //Constant
    private static final int BOUND_NUMBER = 10;
    private static final int RADIUS_CIRCLE = 10;
    //Object
    private ColorSupplier colorSupplier = new ColorSupplier();
    private RandomName randomName = new RandomName();
    private Random random = new Random();
    //Random variables
    private String color = colorSupplier.getRandomColor();
    private String nameFigure = randomName.getRandomName();

    public Figure getCircle() {
        int radius = random.nextInt(BOUND_NUMBER);
        return new Circle(color, radius);
    }

    public Figure getSquare() {
        int side = random.nextInt(BOUND_NUMBER);
        return new Square(color, side);
    }

    public Figure getRightTriangle() {
        int firstLeg = random.nextInt(BOUND_NUMBER);
        int secondLeg = random.nextInt(BOUND_NUMBER);
        return new RightTriangle(color, firstLeg, secondLeg);
    }

    public Figure getRectangle() {
        int sideA = random.nextInt(BOUND_NUMBER);
        int sideB = random.nextInt(BOUND_NUMBER);
        return new Rectangle(color, sideA, sideB);
    }

    public Figure getIsoscelesTrapezoid() {
        int upperSide = random.nextInt(BOUND_NUMBER);
        int downSide = random.nextInt(BOUND_NUMBER);
        int height = random.nextInt(BOUND_NUMBER);
        return new IsoscelesTrapezoid(color, upperSide, downSide, height);
    }

    public Figure getRandomFigure(String nameFigure) {
        switch (nameFigure) {
            case "SQUARE":
                return getSquare();
            case "TRIANGLE":
                return getRightTriangle();
            case "RECTANGLE":
                return getRectangle();
            case "CIRCLE":
                return getCircle();
            case "TRAPEZOID":
                return getIsoscelesTrapezoid();
            default: return getDefaultFigure();
        }
    }

    public Figure getDefaultFigure() {
        String color = "white";
        return new Circle(color, RADIUS_CIRCLE);
    }
}
