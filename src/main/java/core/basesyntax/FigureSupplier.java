package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    private static final int FIGURE_AMOUNT = 5;
    private static final int CIRCLE_RADIUS = 10;
    private static final String CIRCLE_NAME = "Circle";
    private static final String CIRCLE_COLOR = "White";

    public Figure getRandomFigure() {
        ColorSupplier supplier = new ColorSupplier();
        Random random = new Random();
        int currentRandomFigureIndex = random.nextInt(FIGURE_AMOUNT);
        switch (currentRandomFigureIndex) {
            case 0:
                return new Circle(
                    "Circle",
                    random.nextInt(100),
                    supplier.getRandomColor()
            );
            case 1:
                return new IsoscelesTrapezoid(
                        "IsoscelesTrapezoid",
                        random.nextInt(100),
                        random.nextInt(100),
                        random.nextInt(100),
                        supplier.getRandomColor()
                );
            case 2:
                return new Rectangle(
                        "Rectangle",
                        random.nextInt(100),
                        random.nextInt(100),
                        supplier.getRandomColor()
                );
            case 3:
                return new RightTriangle(
                        "RightTriangle",
                        random.nextInt(100),
                        random.nextInt(100),
                        supplier.getRandomColor()
                );
            case 4:
                return new Square(
                        "Square",
                        random.nextInt(100),
                        supplier.getRandomColor()
                );
            default:
                return null;
        }
    }

    public Circle getDefaultFigure() {

        return new Circle(
                CIRCLE_NAME,
                CIRCLE_RADIUS,
                CIRCLE_COLOR
        );
    }
}
