package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    private static final int FIGURE_NUMBER = 5;
    private static final int MAX_LENGTH = 20;
    private final ColorSupplier colorSupplier = new ColorSupplier();
    private final Random random = new Random();

    public Figure getRandomFigure() {
        String randomColor = colorSupplier.getRandomColor();
        int figureType = random.nextInt(FIGURE_NUMBER);
        switch (figureType) {
            case 0:
                return new Circle(randomColor, random.nextDouble() * MAX_LENGTH);
            case 1:
                return new Square(randomColor, random.nextDouble() * MAX_LENGTH);
            case 2:
                return new Rectangle(
                        randomColor,
                        random.nextDouble() * MAX_LENGTH,
                        random.nextDouble() * MAX_LENGTH);
            case 3:
                return new RightTriangle(
                        randomColor,
                        random.nextDouble() * MAX_LENGTH,
                        random.nextDouble() * MAX_LENGTH);
            default:
                return new IsoscelesTrapezoid(
                        randomColor, random.nextDouble() * MAX_LENGTH,
                        random.nextDouble() * MAX_LENGTH,
                        random.nextDouble() * MAX_LENGTH);
        }
    }

    public Figure getDefaultFigure() {
        return new Circle("WHITE", 10);
    }
}
