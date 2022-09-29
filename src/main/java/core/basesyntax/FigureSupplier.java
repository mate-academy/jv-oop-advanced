package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    private static final int MAX_NUMBER = 50;
    private final ColorSupplier colorSupplier = new ColorSupplier();
    private final Random randomNumber = new Random();

    public Figure getDefaultFigure() {
        return new Circle("WHITE", 10);
    }

    public Figure getRandomFigure() {
        switch (getFigure()) {
            case "CIRCLE":
                return new Circle(colorSupplier.getRandomColor(), randomNumber.nextInt(MAX_NUMBER));
            case "RIGHT_TRIANGLE":
                return new RightTriangle(colorSupplier.getRandomColor(),
                        randomNumber.nextInt(MAX_NUMBER), randomNumber.nextInt(MAX_NUMBER));
            case "RECTANGLE":
                return new Rectangle(colorSupplier.getRandomColor(),
                        randomNumber.nextInt(MAX_NUMBER), randomNumber.nextInt(MAX_NUMBER));
            case "SQUARE":
                return new Square(colorSupplier.getRandomColor(),
                        randomNumber.nextInt(MAX_NUMBER));
            default:
                return new IsoscelesTrapezoid(colorSupplier.getRandomColor(),
                        randomNumber.nextInt(MAX_NUMBER), randomNumber.nextInt(MAX_NUMBER),
                        randomNumber.nextInt(MAX_NUMBER));
        }
    }

    public String getFigure() {
        return Figures.values()[randomNumber.nextInt(Figures.values().length)].name();
    }
}
