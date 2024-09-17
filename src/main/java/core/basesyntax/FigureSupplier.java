package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    public static final int FIGURE_COUNT = 4;
    private final ColorSupplier colorSupplier = new ColorSupplier();
    private final Random random = new Random();

    public Figure getRandomFigure() {
        Color color = colorSupplier.getRandomColor();
        int figureNumber = random.nextInt(FIGURE_COUNT);
        switch (figureNumber) {
            case 0:
                return new IsoscelesTrapezoid(color, random.nextDouble() * 10,
                        random.nextDouble() * 10, random.nextDouble() * 10);
            case 1:
                return new Circle(color, random.nextDouble() * 10);
            case 2:
                return new RightTriangle(color, random.nextDouble() * 10,
                        random.nextDouble() * 10);
            case 3:
                return new Rectangle(color, random.nextDouble() * 10,
                        random.nextDouble() * 10);
            default:
                return new Square(color, random.nextDouble() * 10);
        }
    }

    public Figure getDefaultFigure() {
        return new Circle(Color.WHITE, 10); // Assuming Color.WHITE is valid
    }
}
