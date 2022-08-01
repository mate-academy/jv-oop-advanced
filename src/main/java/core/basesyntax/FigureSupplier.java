package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    private static final int MAX_PROPERTY_VALUE = 100;
    private static final int NUMBER_OF_FIGURES = 5;
    private Random random = new Random();
    private ColorSupplier colorSupplier = new ColorSupplier();

    public Figure getRandomFigure() {
        int figureNumber = random.nextInt(NUMBER_OF_FIGURES);
        switch (figureNumber) {
            case 1:
                return new IsoscelesTrapezoid(colorSupplier.getRandomColor(),
                        random.nextInt(MAX_PROPERTY_VALUE),
                        random.nextInt(MAX_PROPERTY_VALUE),
                        random.nextInt(MAX_PROPERTY_VALUE));
            case 2:
                return new RightTriangle(colorSupplier.getRandomColor(),
                        random.nextInt(MAX_PROPERTY_VALUE),
                        random.nextInt(MAX_PROPERTY_VALUE));
            case 3:
                return new Rectangle(colorSupplier.getRandomColor(),
                        random.nextInt(MAX_PROPERTY_VALUE),
                        random.nextInt(MAX_PROPERTY_VALUE));
            case 4:
                return new Square(colorSupplier.getRandomColor(),
                        random.nextInt(MAX_PROPERTY_VALUE));
            default:
                return getDefaultFigure();
        }
    }

    public Figure getDefaultFigure() {
        return new Circle("WHITE", 10);
    }
}
