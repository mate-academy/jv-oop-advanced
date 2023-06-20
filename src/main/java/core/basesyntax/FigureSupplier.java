package core.basesyntax;


import java.util.Random;

public class FigureSupplier {
    private static final int NUMBER_OF_FIGURES_COUNT = 5;
    private Random random = new Random();
    private ColorSupplier colorSupplier = new ColorSupplier();

    public Figure getRandomFigure() {
        Color color = colorSupplier.getRandomColor();
        int figureIndex = random.nextInt(NUMBER_OF_FIGURES_COUNT);
        switch (figureIndex) {
            case 0:
                return new Square(random.nextDouble() * 10 + 1, color);
            case 1:
                return new Rectangle(random.nextDouble() * 10
                        + 1, random.nextDouble() * 10
                        + 1, color);
            case 2:
                return new RightTriangle(random.nextDouble() * 10
                        + 1, random.nextDouble() * 10
                        + 1, color);
            case 3:
                return new Circle(random.nextDouble() * 10 + 1, color);
            case 4:
                return new IsoscelesTrapezoid(random.nextDouble() * 10
                        + 1, random.nextDouble() * 10
                        + 1,
                        random.nextDouble() * 10
                                + 1, color);
            default:
                throw new IllegalArgumentException("Invalid figure number: " + figureIndex);
        }
    }

    public Figure getDefaultFigure() {
        return new Circle(10, Color.WHITE);
    }
}