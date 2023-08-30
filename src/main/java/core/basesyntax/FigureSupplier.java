package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    private final String defaultColor = Color.WHITE.name();
    private final Random random = new Random();
    private final ColorSupplier colorSupplier = new ColorSupplier();

    public Figure getRandomFigure() {
        int figureIndex = random.nextInt(0, 5);
        switch (figureIndex) {
            case 0:
                return new Circle(colorSupplier.getRandomColor(), random.nextInt(0, 10));
            case 1:
                return new Square(colorSupplier.getRandomColor(), random.nextInt(0, 10));
            case 2:
                return new Rectangle(colorSupplier.getRandomColor(), random.nextInt(0, 10),
                        random.nextInt(0, 10));
            case 3:
                return new RightTriangle(colorSupplier.getRandomColor(), random.nextInt(0, 10),
                        random.nextInt(0, 10));
            case 4:
                return new IsoscelesTrapezoid(colorSupplier.getRandomColor(), random.nextInt(0,10),
                        random.nextInt(0, 10));
            default:
                return getDefaultFigure();
        }
    }

    public Figure getDefaultFigure() {

        int defaultRadius = 10;
        return new Circle(defaultColor, defaultRadius);
    }
}
