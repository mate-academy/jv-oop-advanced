package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    private Random random = new Random();
    private ColorSupplier colorSupplier = new ColorSupplier();

    public Figure getRandomFigure() {
        int figureIndex = random.nextInt(FigureType.values().length);
        FigureType randomFigure = FigureType.values()[figureIndex];
        switch (randomFigure) {
            case CIRCLE -> {
                return new Circle(colorSupplier.getRandomColor(), random.nextInt(50));
            }
            case SQUARE -> {
                return new Square(colorSupplier.getRandomColor(), random.nextInt(50));
            }
            case RECTANGLE -> {
                return new Rectangle(colorSupplier.getRandomColor(), random.nextInt(50),
                        random.nextInt(50));
            }
            case RIGHT_TRIANGLE -> {
                return new RightTriangle(colorSupplier.getRandomColor(), random.nextInt(50),
                        random.nextInt(50));
            }
            case ISOSCELES_TRAPEZOID -> {
                return new IsoscelesTrapezoid(colorSupplier.getRandomColor(), random.nextInt(50),
                        random.nextInt(50), random.nextInt(50));
            }
            default -> {
                return getDefaultFigure();
            }
        }
    }

    public Figure getDefaultFigure() {
        return new Circle(Color.WHITE.name(), 10);
    }
}
