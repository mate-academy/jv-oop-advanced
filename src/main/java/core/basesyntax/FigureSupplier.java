package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    public static final int SET_VALUE = 10;
    public static final int MAX_FOR_FIGURE = 15;
    private final Random random = new Random();
    private final ColorSupplier colorSupplier = new ColorSupplier();

    public Figure getRandomFigure() {
        int index = random.nextInt(6);
        switch (index) {
            case 1:
                return new Circle(colorSupplier.getRandomColor(),
                        random.nextInt(MAX_FOR_FIGURE));
            case 2:
                return new IsoscelesTrapezoid(colorSupplier.getRandomColor(),
                        random.nextInt(MAX_FOR_FIGURE), random.nextInt(MAX_FOR_FIGURE),
                        random.nextInt(MAX_FOR_FIGURE));
            case 3:
                return new Rectangle(colorSupplier.getRandomColor(),
                        random.nextInt(MAX_FOR_FIGURE), random.nextInt(MAX_FOR_FIGURE));
            case 4:
                return new RightTriangle(colorSupplier.getRandomColor(),
                        random.nextInt(MAX_FOR_FIGURE), random.nextInt(MAX_FOR_FIGURE));
            default:
                return new Square(colorSupplier.getRandomColor(),
                        random.nextInt(MAX_FOR_FIGURE));
        }
    }

    public Figure getDefaultFigure() {
        return new Circle((Color.WHITE).name(),SET_VALUE);
    }
}
