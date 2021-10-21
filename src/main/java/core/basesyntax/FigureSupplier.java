package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    public static final ColorSupplier COLOR_SUPPLIER = new ColorSupplier();
    private static Random random;
    public static final int PHARAMETRE = random.nextInt(20);

    public Figure getRandomFigure() {
        int number = random.nextInt(5);
        switch (number) {
            case 0:
                return new Circle(COLOR_SUPPLIER.getRandomColor(), PHARAMETRE);
            case 1:
                return new Square(COLOR_SUPPLIER.getRandomColor(), PHARAMETRE);
            case 2:
                return new Rectangle(COLOR_SUPPLIER.getRandomColor(), PHARAMETRE, PHARAMETRE);
            case 3:
                return new IsoscelesTrapezoid(COLOR_SUPPLIER.getRandomColor(),
                        PHARAMETRE, PHARAMETRE, PHARAMETRE);
            default:
                return new RightTriangle(COLOR_SUPPLIER.getRandomColor(), PHARAMETRE, PHARAMETRE);
        }

    }

    public Figure getDefaultFigure() {
        return new Circle(Color.WHITE.toString(), 10);
    }
}
