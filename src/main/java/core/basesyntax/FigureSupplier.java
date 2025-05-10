package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    private static final int FIGURE_ID = 4;
    private static final int MAX_VALUE = 200;
    private ColorSupplier colorSupplier = new ColorSupplier();
    private Random random = new Random();

    public Figure getRandomFigure() {
        int figureId = new Random().nextInt(FIGURE_ID);
        int randomValue = random.nextInt(MAX_VALUE);

        switch (figureId) {
            case 0:
                return new Square(colorSupplier.getRandomColor(), randomValue);
            case 1:
                return new Rectangle(colorSupplier.getRandomColor(), randomValue, randomValue);
            case 2:
                return new RightTriangle(colorSupplier.getRandomColor(), randomValue, randomValue);
            case 3:
                return new Circle(colorSupplier.getRandomColor(), randomValue);
            default:
                return new IsoscelesTrapezoid(colorSupplier.getRandomColor(),
                        randomValue, randomValue, randomValue);
        }
    }

    public Figure getDefaultFigure() {
        return new Circle(Color.WHITE.name(), 100);
    }
}
