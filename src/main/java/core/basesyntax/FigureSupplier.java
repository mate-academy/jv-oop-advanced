package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    private static final int LOWER_BOUND = 1;
    private static final int UPPER_BOUND = 100;
    private static final int FORM_LENGTH = Form.values().length;

    public Figure getRandomFigure() {
        int index = new Random().nextInt(FORM_LENGTH);
        final int sideOne = new Random().nextInt(LOWER_BOUND, UPPER_BOUND);
        final int sideTwo = new Random().nextInt(LOWER_BOUND, UPPER_BOUND);
        final int sideThree = new Random().nextInt(LOWER_BOUND, UPPER_BOUND);
        ColorSupplier colorSupplier = new ColorSupplier();
        String color = colorSupplier.getRandomColor();
        Form form = Form.values()[index];
        return switch (form.name()) {
            case "CIRCLE" -> (new Circle(color,sideOne));
            case "ISOSCELES_TRAPEZOID" -> new IsoscelesTrapezoid(color,
                    sideOne, sideTwo, sideThree);
            case "RECTANGLE" -> new Rectangle(color, sideOne, sideTwo);
            case "RIGHT_TRIANGLE" -> new RightTriangle(color, sideOne, sideTwo, sideThree);
            default -> new Square(color, sideOne);
        };
    }

    public Figure getDefaultFigure() {
        return new Circle("White", UPPER_BOUND);
    }
}
