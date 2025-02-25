package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    private final int lowerBound = 1;
    private final int upperBound = 100;

    public Figure getRandomFigure() {
        int index = new Random().nextInt(Form.values().length);
        ColorSupplier colorSupplier = new ColorSupplier();
        Form form = Form.values()[index];
        String figure = form.toString();
        return switch (figure) {
            case "CIRCLE" -> new Circle(colorSupplier.getRandomColor(),
                    new Random().nextInt(lowerBound, upperBound));
            case "ISOSCELES_TRAPEZOID" -> new IsoscelesTrapezoid(colorSupplier.getRandomColor(),
                    new Random().nextInt(lowerBound, upperBound),
                    new Random().nextInt(lowerBound, upperBound),
                    new Random().nextInt(lowerBound, upperBound));
            case "RECTANGLE" -> new Rectangle(colorSupplier.getRandomColor(),
                    new Random().nextInt(lowerBound, upperBound),
                    new Random().nextInt(lowerBound, upperBound));
            case "RIGHT_TRIANGLE" -> new RightTriangle(colorSupplier.getRandomColor(),
                    new Random().nextInt(lowerBound, upperBound),
                    new Random().nextInt(lowerBound, upperBound),
                    new Random().nextInt(lowerBound, upperBound));
            default -> new Square(colorSupplier.getRandomColor(),
                    new Random().nextInt(lowerBound, upperBound));
        };
    }

    public Figure getDefaultFigure() {
        return new Circle("White", upperBound);
    }
}
