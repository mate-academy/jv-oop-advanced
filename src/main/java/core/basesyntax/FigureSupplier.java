package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    private static final int FIGURE_LENGTH = 5;
    private static final Random random = new Random();
    private final ColorSupplier supplier = new ColorSupplier();

    public Figure getRandomFigure() {
        int index = random.nextInt(FIGURE_LENGTH);
        int randomSide = random.nextInt(100);
        switch (index) {
            case 0 :
                return new Circle(randomSide, supplier.getRandomColor());
            case 1 :
                return new IsoscelesTrapezoid(randomSide, randomSide, supplier.getRandomColor());
            case 2 :
                return new RightTriangle(randomSide, randomSide, supplier.getRandomColor());
            case 3 :
                return new Rectangle(randomSide, randomSide, supplier.getRandomColor());
            default:
                return new Square(randomSide, supplier.getRandomColor());
        }
    }

    public Figure getDefaultFigure() {
        return new Circle(10, "white");
    }

}
