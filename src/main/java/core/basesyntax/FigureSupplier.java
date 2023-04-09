package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    static final int DEFAULT_CIRCLE_RADIUS = 10;
    static final int SIDE_LENGTH = 100;
    private final String defaultCircleColor = "white";
    private final int figureCount = 5;
    private Random random = new Random();

    public Figure getRandomFigure() {
        int numberFigure = random.nextInt(figureCount);

        switch (numberFigure) {
            case 0:
                return new Square(random.nextInt(SIDE_LENGTH));
            case 1:
                return new Circle(random.nextInt(SIDE_LENGTH));
            case 2:
                return new Rectangle(random.nextInt(SIDE_LENGTH),
                        random.nextInt(SIDE_LENGTH));
            case 3:
                return new RightTriangle(random.nextInt(SIDE_LENGTH),
                        random.nextInt(SIDE_LENGTH));
            case 4:
                return new IsoscelesTrapezoid(random.nextInt(SIDE_LENGTH),
                        random.nextInt(SIDE_LENGTH),
                        random.nextInt(SIDE_LENGTH));
            default:
                return getDefaultFigure();
        }
    }

    public Figure getDefaultFigure() {
        return new Circle(DEFAULT_CIRCLE_RADIUS, defaultCircleColor);
    }
}
