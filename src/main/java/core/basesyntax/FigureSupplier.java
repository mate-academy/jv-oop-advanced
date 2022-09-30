package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    private static final int FIGURE_LENGTH = Figures.values().length;
    private static final Random random = new Random();
    private final ColorSupplier supplier = new ColorSupplier();
    private final int randomSide = random.nextInt(100);

    public Figure getRandomFigure() {
        int index = random.nextInt(FIGURE_LENGTH);
        if (Figures.values()[index].equals(Figures.CIRCLE)) {
            return new Circle(randomSide, supplier.getRandomColor());
        } else if (Figures.values()[index].equals(Figures.ISOSCELESTRAPEZOID)) {
            return new IsoscelesTrapezoid(randomSide, randomSide, supplier.getRandomColor());
        } else if (Figures.values()[index].equals(Figures.RIGHTTRIANGLE)) {
            return new RightTriangle(randomSide, randomSide, supplier.getRandomColor());
        } else if (Figures.values()[index].equals(Figures.RECTANGLE)) {
            return new Rectangle(randomSide, randomSide, supplier.getRandomColor());
        } else {
            return new Square(randomSide, supplier.getRandomColor());
        }
    }

    public Figure getDefaultFigure() {
        return new Circle(10, "white");
    }

}
