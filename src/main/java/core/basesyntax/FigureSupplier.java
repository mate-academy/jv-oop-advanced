package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    private static final int Figure_Count = 5;
    public static final int Max_Value = 25;
    private static final Random random = new Random();
    private ColorSupplier supplier = new ColorSupplier();

    public Figure getRandomFigure() {

        switch (random.nextInt(Figure_Count)) {
            case 0:
                return new Circle(supplier.getRandomColor(), random.nextInt(Max_Value));
            case 1:
                return new Square(supplier.getRandomColor(), random.nextInt(Max_Value));
            case 2:
                return new Rectangle(supplier.getRandomColor(),
                        random.nextInt(Max_Value),
                        random.nextInt(Max_Value));
            case 3:
                return new IsoscelesTrapezoid(supplier.getRandomColor(),
                        random.nextInt(Max_Value),
                        random.nextInt(Max_Value),
                        random.nextInt(Max_Value));
            case 4:
                return new RightTriangle(supplier.getRandomColor(),
                        random.nextInt(Max_Value),
                        random.nextInt(Max_Value));
            default:
                return getDefaultFigure();
        }
    }

    public Figure getDefaultFigure() {
        final Color DEFAULT_COLOR = Color.WHITE;
        final int DEFAULT_RADIUS = 10;
        return new Circle(DEFAULT_COLOR, DEFAULT_RADIUS);
    }
}
