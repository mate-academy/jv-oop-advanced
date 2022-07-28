package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    private static final int MAX_SIZE = 10;

    public Figure getRandomFigure() {
        int index = new Random().nextInt(FigureSelector.values().length);
        ColorSupplier colorSupplier = new ColorSupplier();
        String figure = FigureSelector.values()[index].toString();
        switch (figure) {
            case "CIRCLE":
                Circle circle = new Circle(new Random().nextInt(MAX_SIZE),
                        colorSupplier.getRandomColor());
                return circle;
            case "SQUARE":
                Square square = new Square(new Random().nextInt(MAX_SIZE),
                        colorSupplier.getRandomColor());
                return square;
            case "RECTANGLE":
                Rectangle rectangle = new Rectangle(new Random().nextInt(MAX_SIZE),
                        new Random().nextInt(MAX_SIZE), colorSupplier.getRandomColor());
                return rectangle;
            case "RIGHTTRIANGLE":
                RightTriangle rightTriangle = new RightTriangle(new Random().nextInt(MAX_SIZE),
                        new Random().nextInt(MAX_SIZE), colorSupplier.getRandomColor());
                return rightTriangle;
            case "ISOSCELESTRAPEZOID":
                IsoscelesTrapezoid isoscelesTrapezoid = new IsoscelesTrapezoid(new Random()
                        .nextInt(MAX_SIZE),
                        new Random().nextInt(MAX_SIZE), new Random().nextInt(MAX_SIZE),
                        colorSupplier.getRandomColor());
                return isoscelesTrapezoid;
            default:
                return getDefaultFigure();
        }
    }

    public Figure getDefaultFigure() {
        return new Circle();
    }
}
