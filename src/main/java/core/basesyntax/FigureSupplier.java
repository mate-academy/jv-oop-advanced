package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    public static final int FIGURE_COUNTER = 4;
    public static final int MAX_SIDE_VALUE = 100;
    public static final int STATIC_RADIUS = 10;

    public Figure getRandomFigure() {
        Random random = new Random();
        int randomCount = random.nextInt(FIGURE_COUNTER);
        switch (randomCount) {
            case 0:
                return new Circle(new ColorSupplier().getRandomColor(),
                        random.nextInt(MAX_SIDE_VALUE));
            case 1:
                return new RightTriangle(new ColorSupplier().getRandomColor(),
                        random.nextInt(MAX_SIDE_VALUE), random.nextInt(MAX_SIDE_VALUE));
            case 2:
                return new Rectangle(new ColorSupplier().getRandomColor(),
                        random.nextInt(MAX_SIDE_VALUE), random.nextInt(MAX_SIDE_VALUE));
            case 3:
                return new IsoscelesTrapezoid(new ColorSupplier().getRandomColor(),
                        random.nextInt(MAX_SIDE_VALUE), random.nextInt(MAX_SIDE_VALUE),
                        random.nextInt(MAX_SIDE_VALUE));
            default:
                return new Square(new ColorSupplier().getRandomColor(),
                        random.nextInt(MAX_SIDE_VALUE));
        }
    }

    public Figure getDefaultFigure() {
        return new Circle(Color.WHITE.toString(), STATIC_RADIUS);
    }
}
