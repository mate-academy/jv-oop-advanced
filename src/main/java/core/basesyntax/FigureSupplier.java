package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    private static final Color CIRCLE_COLOR = Color.WHITE;
    private static final int CAPACITY = 4;
    private static final int RADIUS = 10;
    private Random random = new Random();
    private String randomColor = new ColorSupplier().getRandomColor();
    private int figureType = random.nextInt(CAPACITY);

    public Figure getRandomFigure() {
        switch (figureType) {
            case 0:
                return new Rectangle(random.nextDouble(10),
                        random.nextDouble(10), randomColor);
            case 1:
                return new IsoscelesTrapezoid(random.nextDouble(12),
                        random.nextDouble(11), random.nextDouble(10),
                        randomColor);
            case 2:
                return new RightTriangle(random.nextDouble(10),
                        random.nextDouble(12), randomColor);
            case 3:
                return new Square(random.nextDouble(10), randomColor);

            default:
                return getDefaultFigure();
        }
    }

    public Figure getDefaultFigure() {
        return new Circle(RADIUS, CIRCLE_COLOR.name());
    }
}
