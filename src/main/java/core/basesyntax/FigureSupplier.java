package core.basesyntax;
  // Імпортуємо інтерфейс Figure
import java.util.Random;

import java.util.Random;

public class FigureSupplier {
    private static final int MAX_SIZE = 10;
    private final Random random = new Random();
    private final ColorSupplier colorSupplier = new ColorSupplier();

    public Figure getRandomFigure() {
        int figureType = random.nextInt(5);
        String color = colorSupplier.getRandomColor();
        switch (figureType) {
            case 0:
                return new Square(random.nextInt(MAX_SIZE) + 1, color);
            case 1:
                return new Circle(random.nextInt(MAX_SIZE) + 1, color);
            // Implement other cases for Rectangle, RightTriangle, IsoscelesTrapezoid
            default:
                return getDefaultFigure();
        }
    }

    public Figure getDefaultFigure() {
        return new Circle(10, "White");
    }
}
