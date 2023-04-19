package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    private static final int FIGURES_AMOUNT = 5;
    private static final double MAGIC_NUMBER = 25;
    private final Random random = new Random();
    private final ColorSupplier supplier = new ColorSupplier();
    private Figure figure;

    public Figure getRandomFigure() {
        switch (random.nextInt(FIGURES_AMOUNT)) {
            case 0:
                figure = new Square(supplier.getRandomColor(), MAGIC_NUMBER);
                break;
            case 1:
                figure = new Circle(supplier.getRandomColor(), MAGIC_NUMBER);
                break;
            case 2:
                figure = new RightTriangle(supplier.getRandomColor(), MAGIC_NUMBER, MAGIC_NUMBER);
                break;
            case 3:
                figure = new IsoscelesTrapezoid(supplier.getRandomColor(), MAGIC_NUMBER,
                        MAGIC_NUMBER, MAGIC_NUMBER);
                break;
            case 4:
                figure = new Rectangle(supplier.getRandomColor(), MAGIC_NUMBER, MAGIC_NUMBER);
                break;
            default:
                break;
        }
        return figure;
    }

    public Figure getDefaultFigure() {
        return figure = new Circle("white", 10.0);
    }
}
