package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    private static final int FIGURE_COUNT = 5;
    private static final int MAX_SIDE_LENGTH = 50;
    private ColorSupplier colorSupplier = new ColorSupplier();
    private Random random = new Random();

    public Figure getRandomFigure() {
        int index = random.nextInt(FIGURE_COUNT);
        Color color = colorSupplier.getRandomColor();
        int side = 1 + random.nextInt(MAX_SIDE_LENGTH);
        int side2 = 1 + random.nextInt(MAX_SIDE_LENGTH);
        int side3 = 1 + random.nextInt(MAX_SIDE_LENGTH);
        switch (index) {
            case 0:
                return new Square(color, side);
            case 1:
                return new Rectangle(color, side, side2);
            case 2:
                return new RightTriangle(color, side, side2);
            case 3:
                return new IsoscelesTrapezoid(color, side, side2, side3);
            default:
                return new Circle(color, side);
        }
    }

    public Figure getDefaultFigure() {
        return new Circle(Color.WHITE, 10);
    }
}
