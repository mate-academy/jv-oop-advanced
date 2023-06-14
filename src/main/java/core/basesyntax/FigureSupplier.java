package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    private Random random = new Random();
    private String randomFigure = "";
    private ColorSupplier colorSupplier = new ColorSupplier();

    public Figure getRandomFigure() {
        randomFigure = String.valueOf(FiguresList.values()
                [random.nextInt(FiguresList.values().length)]);

        switch (randomFigure) {
            case "SQUARE":
                return new Square(random.nextInt(19) + 1, colorSupplier.getRandomColor());
            case "RECTANGLE":
                return new Rectangle(random.nextInt(19) + 1,
                        random.nextInt(19) + 1, colorSupplier.getRandomColor());
            case "RIGHT_TRIANGLE":
                return new RightTriangle(random.nextInt(19) + 1,
                        random.nextInt(19) + 1, colorSupplier.getRandomColor());
            case "CIRCLE":
                return new Circle(random.nextInt(19) + 1, colorSupplier.getRandomColor());
            default:
                return new IsoscelesTrapezoid(random.nextInt(19) + 1, random.nextInt(19) + 1,
                        random.nextInt(19) + 1, colorSupplier.getRandomColor());
        }
    }

    public Figure getDefaultFigure() {
        return new Circle(10, "white");
    }
}
