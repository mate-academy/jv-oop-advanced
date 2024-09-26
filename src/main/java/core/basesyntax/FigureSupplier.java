package core.basesyntax;

import java.util.Random;

public class FigureSupplier {

    private static final int MAX_VALUE = 5;
    private static final Random random = new Random();
    private final ColorSupplier colorSupplier = new ColorSupplier();

    public static Figure getDefaultFigure() {
        return new Circle("White", 10);
    }

    public static Figure getRandomFigure() {
        int figureType = random.nextInt(MAX_VALUE);
        String color = ColorSupplier.getRandomColor();

        switch (figureType) {

            case 0:
                int side = random.nextInt(10) + 1;
                return new Square(color, side);
            case 1:
                int radius = random.nextInt(10) + 1;
                return new Circle(color, radius);

            case 2:
                int bothside = random.nextInt(10) + 1;
                int height = random.nextInt(10) + 1;
                return new Rectangle(color, bothside, height);

            case 3:
                int bothside2 = random.nextInt(10) + 1;
                int height2 = random.nextInt(10) + 1;
                return new RightTriangle(color, bothside2, height2);

            case 4:
                int upbothside = random.nextInt(10) + 1;
                int downbothside = random.nextInt(10) + 1;
                int height3 = random.nextInt(10) + 1;
                return new IsoscelesTrapezoid(color, upbothside, downbothside, height3);

            default:
                return new Circle("White", 10);
        }
    }
}
