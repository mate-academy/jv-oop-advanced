package core.basesyntax;

import java.util.Random;

public class FigureSupplier extends Figure {
    public static final int FIGURE_COUNT = 5;
    private static final Random random = new Random();
    private static final Color WHITE = Color.WHITE;
    private final ColorSupplier colorSupplier = new ColorSupplier();

    public Figure getRandomFigure() {
        int figureType = random.nextInt(FIGURE_COUNT);
        String color = colorSupplier.getRandomColor();
        int randomNumber = random.nextInt(DEFAULT_LENGTH) + 1;
        switch (figureType) {
            case 0 -> {
                return new Circle(color,randomNumber);
            }
            case 1 -> {
                return new Square(color, randomNumber);
            }
            case 2 -> {
                return new Rectangle(color, randomNumber,
                        randomNumber);
            }
            case 3 -> {
                return new RightTriangle(color, randomNumber,
                        randomNumber);
            }
            case 4 -> {
                return new IsoscelesTrapezoid(
                        color, randomNumber,
                        randomNumber,
                        randomNumber
                );
            }
            default -> {
                return new Figure();
            }
        }
    }

    public Figure getDefaultFigure() {
        return new Circle(WHITE.name(), DEFAULT_LENGTH);
    }
}
