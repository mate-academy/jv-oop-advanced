package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    private Random random = new Random();
    private FiguresList figuresList;
    private ColorSupplier colorSupplier = new ColorSupplier();

    public Figure getRandomFigure() {
        figuresList = FiguresList.values()
                [random.nextInt(FiguresList.values().length)];

        switch (figuresList.name()) {
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
