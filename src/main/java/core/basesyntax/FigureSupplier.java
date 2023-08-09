package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    private static final Random RANDOM = Main.RANDOM;
    private static final int FIGURE_COUNT = 5;
    private static final ColorSupplier COLOR_SUPPLIER = new ColorSupplier();
    private static final int MAX_SIZE_OF_SIDE = 100;

    public Figure getRandomFigure() {
        String figureColor = COLOR_SUPPLIER.getRandomColor();
        switch (RANDOM.nextInt(FIGURE_COUNT)) {
            case 0:
                return new Circle(figureColor, getParameter());
            case 1:
                return new IsoscelesTrapezoid(figureColor, getParameter(), getParameter());
            case 2:
                return new Rectangle(figureColor, getParameter(), getParameter());
            case 3:
                return new RightTriangle(figureColor, getParameter(), getParameter());
            default:
                return new Square(figureColor, getParameter());
        }
    }

    private static int getParameter() {
        return RANDOM.nextInt(MAX_SIZE_OF_SIDE);
    }

    public Figure getDefaultFigure() {
        return new Circle(Color.WHITE.name().toLowerCase(), 10);
    }
}
