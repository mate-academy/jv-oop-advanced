package core.basesyntax;

import java.util.Random;

public class FigureSupplier {

    private static final int MAX_SIZE = 10;

    private final Random random = new Random();
    private final ColorSupplier colorSupplier = new ColorSupplier();

    public Figure getRandomFigure() {
        int figureType = random.nextInt(5);
        String color = colorSupplier.getRandomColor();

        switch (figureType) {
            case 0:
                double side = 1 + random.nextInt(MAX_SIZE);
                return new Square(color, side);
            case 1:
                double length = 1 + random.nextInt(MAX_SIZE);
                double width = 1 + random.nextInt(MAX_SIZE);
                return new Rectangle(color, length, width);
            case 2:
                double firstLeg = 1 + random.nextInt(MAX_SIZE);
                double secondLeg = 1 + random.nextInt(MAX_SIZE);
                return new RightTriangle(color, firstLeg, secondLeg);
            case 3:
                double radius = 1 + random.nextInt(MAX_SIZE);
                return new Circle(color, radius);
            case 4:
                double base1 = 1 + random.nextInt(MAX_SIZE);
                double base2 = 1 + random.nextInt(MAX_SIZE);
                double height = 1 + random.nextInt(MAX_SIZE);
                return new IsoscelesTrapezoid(color, base1, base2, height);
            default:
                return getDefaultFigure();
        }
    }

    public Figure getDefaultFigure() {
        return new Circle("white", 10);
    }
}
