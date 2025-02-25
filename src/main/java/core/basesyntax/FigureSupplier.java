package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    private final int lowerBound = 1;
    private final int upperBound = 100;

    public Figure getRandomFigure() {
        int index = new Random().nextInt(Form.values().length);
        int sideOne = new Random().nextInt(lowerBound, upperBound);
        int sideTwo = new Random().nextInt(lowerBound, upperBound);
        int sideThree = new Random().nextInt(lowerBound, upperBound);
        ColorSupplier colorSupplier = new ColorSupplier();
        String color = colorSupplier.getRandomColor();
        Form form = Form.values()[index];
        String figure = form.name();
        return switch (figure) {
            case "CIRCLE" -> (new Circle(color,sideOne));
            case "ISOSCELES_TRAPEZOID" -> new IsoscelesTrapezoid(color,
                    sideOne, sideTwo, sideThree);
            case "RECTANGLE" -> new Rectangle(color, sideOne, sideTwo);
            case "RIGHT_TRIANGLE" -> new RightTriangle(color, sideOne, sideTwo, sideThree);
            default -> new Square(color, sideOne);
        };
    }

    public Figure getDefaultFigure() {
        return new Circle("White", upperBound);
    }
}
