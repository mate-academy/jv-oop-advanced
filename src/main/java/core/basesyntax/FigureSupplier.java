package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    private static final int FIGURE_LENGTH = 5;
    private static final int MAX_RANDOM_INT = 100;
    private static final Random random = new Random();
    private int randomSide1 = random.nextInt(MAX_RANDOM_INT);
    private int randomSide2 = random.nextInt(MAX_RANDOM_INT);
    private final ColorSupplier supplier = new ColorSupplier();

    public Figure getRandomFigure() {
        int index = random.nextInt(FIGURE_LENGTH);
        switch (index) {
            case 0 :
                return new Circle(randomSide1, supplier.getRandomColor());
            case 1 :
                return new IsoscelesTrapezoid(randomSide1, randomSide2, supplier.getRandomColor());
            case 2 :
                return new RightTriangle(randomSide1, randomSide2, supplier.getRandomColor());
            case 3 :
                return new Rectangle(randomSide1, randomSide2, supplier.getRandomColor());
            default:
                return new Square(randomSide1, supplier.getRandomColor());
        }
    }

    public Figure getDefaultFigure() {
        return new Circle(10, "white");
    }

}
