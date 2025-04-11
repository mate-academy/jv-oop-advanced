package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    private static final int FIGURES_COUNT = 5;
    private static final String DEFAULT_COLOR = Colors.white.name();
    private  static final double DEFAULT_RADIUS = 10;
    private ColorSupplier colorSupplier = new ColorSupplier();
    private Random random = new Random();

    public Figure getRandomFigure() {
        String randomColor = colorSupplier.getRandomColor();
        int randomFigure = random.nextInt(FIGURES_COUNT);
        switch (randomFigure) {
            case 0:
                return new Circle(randomColor, random.nextDouble());
            case 1:
                return new Square(randomColor, random.nextDouble());
            case 2:
                return new IsoscelesTrapezoid(randomColor, random.nextDouble(),
                        random.nextDouble(), random.nextDouble());
            case 3:
                return new Rectangle(randomColor, random.nextDouble(), random.nextDouble());
            case 4:
                return new RightTriangle(randomColor, random.nextDouble(), random.nextDouble());
            default:
                return getDefaultFigure();
        }
    }

    public Figure getDefaultFigure() {
        return new Circle(DEFAULT_COLOR, DEFAULT_RADIUS);
    }
}
