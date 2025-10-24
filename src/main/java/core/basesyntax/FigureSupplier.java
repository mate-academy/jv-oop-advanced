package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    private static final int FIGURE_COUNT = 5;
    private final Random random = new Random();
    private final ColorSupplier colorSupplier = new ColorSupplier();

    public Figure getRandomFigure() {
        int figureType = random.nextInt(FIGURE_COUNT);
        String color = colorSupplier.getRandomColor();

        switch (figureType) {
            case 0:
                return new Square(color, random.nextInt(9) + 1);
            case 1:
                return new Rectangle(color, random.nextInt(9)
                        + 1, random.nextInt(9) + 1);
            case 2:
                return new RightTriangle(color, random.nextInt(9)
                        + 1, random.nextInt(9) + 1);
            case 3:
                return new Circle(color, random.nextInt(9) + 1);
            case 4:
            default:
                return new IsoscelesTrapezoid(color, random.nextInt(9)
                        + 1, random.nextInt(9)
                        + 1, random.nextInt(9) + 1);
        }
    }

    public Figure getDefaultFigure() {
        return new Circle("white", 10);
    }
}
