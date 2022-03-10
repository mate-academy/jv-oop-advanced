package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    public static final int FIGURE_COUNT = 5;
    public static final int MAX_PROPERTY_VALUE = 50;

    private Random random = new Random();
    private ColorSupplier colorSupplier = new ColorSupplier();

    public Figure getRandomFigure() {
        int figureNumber = random.nextInt(FIGURE_COUNT);

        switch (figureNumber) {
            case 0:
                return new Circle(random.nextInt(1, MAX_PROPERTY_VALUE),
                        colorSupplier.getRandomColor());
            case 1:
                return new IsoscelesTrapezoid(random.nextInt(1, MAX_PROPERTY_VALUE),
                        random.nextInt(1,MAX_PROPERTY_VALUE),
                        random.nextInt(1,MAX_PROPERTY_VALUE), colorSupplier.getRandomColor());
            case 2:
                return new Rectangle(random.nextInt(1,MAX_PROPERTY_VALUE),
                        random.nextInt(1,MAX_PROPERTY_VALUE),
                        colorSupplier.getRandomColor());
            case 3:
                return new RightTriangle(random.nextInt(1,MAX_PROPERTY_VALUE),
                        random.nextInt(1,MAX_PROPERTY_VALUE),
                        colorSupplier.getRandomColor());
            default:
                return new Square(random.nextInt(1,MAX_PROPERTY_VALUE),
                        colorSupplier.getRandomColor());
        }
    }

    public Figure getDefaultFigure() {
        return new Circle(10, "white");
    }
}
