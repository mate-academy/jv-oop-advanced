package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    private final int defaultCircleRadius = 10;
    private final String defaultCircleColor = "white";
    private final int figureCount = 5;
    private Random random = new Random();

    public Figure getRandomFigure() {
        int num = random.nextInt(figureCount);

        switch (num) {
            case 0:
                return new Square(random.nextInt(100));
            case 1:
                return new Circle(random.nextInt(100));
            case 2:
                return new Rectangle(random.nextInt(100),
                        random.nextInt(100));
            case 3:
                return new RightTriangle(random.nextInt(100),
                        random.nextInt(100));
            case 4:
                return new IsoscelesTrapezoid(random.nextInt(100),
                        random.nextInt(100),
                        random.nextInt(100));
            default:
                return getDefaultFigure();
        }
    }

    public Figure getDefaultFigure() {
        return new Circle(defaultCircleRadius, defaultCircleColor);
    }
}
