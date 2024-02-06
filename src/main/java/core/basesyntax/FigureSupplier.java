package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    private static final int DEFAULT_CIRCLE_RADIUS = 10;
    private static final int LIMIT_VALUE = 20;
    private static final int AMOUNT_OF_FIGURES = 5;
    private final Random random = new Random();
    private final ColorSupplier colorSupplier = new ColorSupplier();

    public Figure getRandomFigure() {
        int numberOfFigures = random.nextInt(AMOUNT_OF_FIGURES);
        Figure figure = null;
        switch (numberOfFigures) {
            case 0:
                figure = new Circle(colorSupplier.getRandomColor(),
                        random.nextInt(LIMIT_VALUE));
                break;
            case 1:
                figure = new IsoscelesTrapezoid(colorSupplier.getRandomColor(),
                        random.nextInt(LIMIT_VALUE),
                        random.nextInt(LIMIT_VALUE),
                        random.nextInt(LIMIT_VALUE));
                break;
            case 2:
                figure = new Rectangle(colorSupplier.getRandomColor(),
                        random.nextInt(LIMIT_VALUE),
                        random.nextInt(LIMIT_VALUE));
                break;
            case 3:
                figure = new RightTriangle(colorSupplier.getRandomColor(),
                        random.nextInt(LIMIT_VALUE),
                        random.nextInt(LIMIT_VALUE));
                break;
            default:
                figure = new Square(colorSupplier.getRandomColor(), random.nextInt(LIMIT_VALUE));
        }
        return figure;
    }

    public Figure getDefaultFigure() {
        return new Circle(Color.WHITE.name().toLowerCase(), DEFAULT_CIRCLE_RADIUS);
    }
}
