package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    public static final int FIGURE_COUNT = 5;
    private static final int MAXIMAL_LENGTH = 99;
    private static final int DEFAULT_LENGTH = 10;

    private Random random = new Random();

    public Figure getRandomFigure() {
        int figureNumber = random.nextInt(FIGURE_COUNT);
        ColorSupplier colorSupplier = new ColorSupplier();
        String color = colorSupplier.getRandomColor();
        switch (figureNumber) {
            case 1:
                int radius = random.nextInt(MAXIMAL_LENGTH) + 1;
                return new Circle(color, radius);
            case 2:
                int topSide = random.nextInt(MAXIMAL_LENGTH) + 1;
                int bottomSide = random.nextInt(MAXIMAL_LENGTH) + 1;
                int height = random.nextInt(MAXIMAL_LENGTH) + 1;
                return new IsoscelesTrapezoid(color, topSide, bottomSide, height);
            case 3:
                int length = random.nextInt(MAXIMAL_LENGTH) + 1;
                int width = random.nextInt(MAXIMAL_LENGTH) + 1;
                return new Rectangle(color, length, width);
            case 4:
                int altitude = random.nextInt(MAXIMAL_LENGTH) + 1;
                int base = random.nextInt(MAXIMAL_LENGTH) + 1;
                return new RightTriangle(color, altitude, base);
            default:
                int side = random.nextInt(MAXIMAL_LENGTH) + 1;
                return new Square(color, side);

        }
    }

    public Figure getDefaultFigure() {
        return new Circle(Color.values()[0].name(), DEFAULT_LENGTH);
    }
}
