package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    private static final int MAX_FIGURE = 6;
    private Random random = new Random();
    private ColorSupplier colorSupplier = new ColorSupplier();

    public Figure getRandomFigure() {
        int randomNumberOfFigure = random.nextInt(MAX_FIGURE);
        switch (randomNumberOfFigure) {
            case 1:
                return new Circle(colorSupplier.getRandomColor(), random.nextInt(10));
            case 2:
                return new IsoscelesTrapezoid(random.nextInt(10),
                        random.nextInt(10), random.nextInt(10),
                        colorSupplier.getRandomColor());
            case 3:
                return new Rectangle(colorSupplier.getRandomColor(),
                        random.nextInt(10), random.nextInt(10));
            case 4:
                return new RightTriangle(colorSupplier.getRandomColor(),
                        random.nextInt(10), random.nextInt(10));
            case 5:
                return new Square(colorSupplier.getRandomColor(), random.nextInt(10));
            default:
                return getDefaultFigure();
        }
    }

    public Figure getDefaultFigure() {
        return new Circle(Color.WHITE.name(), 10);
    }
}
