package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    private static final int MAX_SIZE_LENGTH = 25;
    private final ColorSupplier colorSupplier = new ColorSupplier();
    private final Random random = new Random();

    public Figure getRandomFigure() {
        FigureForm figureForm = FigureForm.values()[random.nextInt(FigureForm.values().length)];

        switch (figureForm) {
            case SQUARE:
                return new Square(
                        colorSupplier.getRandomColor(),
                        random.nextInt(MAX_SIZE_LENGTH)
                );
            case RECTANGLE:
                return new Rectangle(
                        colorSupplier.getRandomColor(),
                        random.nextInt(MAX_SIZE_LENGTH),
                        random.nextInt(MAX_SIZE_LENGTH)
                );
            case RIGHT_TRIANGLE:
                return new RightTriangle(
                        colorSupplier.getRandomColor(),
                        random.nextInt(MAX_SIZE_LENGTH),
                        random.nextInt(MAX_SIZE_LENGTH)
                );
            case CIRCLE:
                return new Circle(
                        colorSupplier.getRandomColor(),
                        random.nextInt(MAX_SIZE_LENGTH)
                );
            case ISOSCELES_TRAPEZOID:
            default:
                return new IsoscelesTrapezoid(
                        colorSupplier.getRandomColor(),
                        random.nextInt(MAX_SIZE_LENGTH),
                        random.nextInt(MAX_SIZE_LENGTH),
                        random.nextInt(MAX_SIZE_LENGTH)
                );
        }
    }
}
