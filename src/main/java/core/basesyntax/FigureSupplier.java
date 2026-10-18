
package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    private static final int FIGURES_COUNT = 5;
    private static final int MAX_SIZE = 10;
    private static final String WHITE = "white";

    private final Random random = new Random();
    private final ColorSupplier colorSupplier = new ColorSupplier();

    public Figure getRandomFigure() {
        String color = colorSupplier.getRandomColor();
        int numberFigure = random.nextInt(FIGURES_COUNT);

        switch (numberFigure) {
            case 0:
                return new Circle(color, random.nextInt(MAX_SIZE) + 1);
            case 1:
                return new Square(color, random.nextInt(MAX_SIZE) + 1);
            case 2:
                return new Rectangle(color,
                        random.nextInt(MAX_SIZE) + 1,
                        random.nextInt(MAX_SIZE) + 1);
            case 3:
                return new RightTriangle(color,
                        random.nextInt(MAX_SIZE) + 1,
                        random.nextInt(MAX_SIZE) + 1);
            default:
                return new IsoscelesTrapezoid(color,
                        random.nextInt(MAX_SIZE) + 1,
                        random.nextInt(MAX_SIZE) + 1,
                        random.nextInt(MAX_SIZE) + 1);
        }
    }

    public Figure getDefaultFigure() {
        return new Circle(WHITE, 10);
    }
}
