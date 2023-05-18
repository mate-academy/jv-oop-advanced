package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    private static final int NUMBER_OF_FIGURES = 5;
    private final Random random = new Random();
    private final ColorSupplier supplier = new ColorSupplier();

    public Figure getRandomFigure() {
        int figureType = random.nextInt(NUMBER_OF_FIGURES);

        switch (figureType) {
            case 0:
                return new Square(supplier.getRandomColor(), random.nextInt(50) + 1);
            case 1:
                return new Circle(supplier.getRandomColor(), random.nextInt(50) + 1);
            case 2:
                return new Rectangle(supplier.getRandomColor(), random.nextInt(50) + 1, random.nextInt(50) + 1);
            case 3:
                return new RightRectangle(supplier.getRandomColor(), random.nextInt(50) + 1, random.nextInt(50) + 1);
            case 4:
                return new IsoscelesTrapezoid(supplier.getRandomColor(), random.nextInt(50) + 1, random.nextInt(50) + 1, random.nextInt(50) + 1);
        }
        return null;
    }

    public Figure getDefaultFigure() {
        return new Circle("White", 10);
    }

}
