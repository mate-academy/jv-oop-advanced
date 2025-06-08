package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    private static final int MAX_SIZE = 100;
    private final Random random = new Random();
    private final ColorSupplier colorSupplier = new ColorSupplier();

    public Figure getRandomFigure() {
        int randomIndex = random.nextInt(5);
        String color = colorSupplier.getRandomColor();
        switch (randomIndex) {

            case 0:
                double radius = random.nextDouble() * MAX_SIZE;
                return new Circle(color, radius);

            case 1:
                double side = random.nextDouble() * MAX_SIZE;
                return new Square(color, side);

            case 2:
                double width = random.nextDouble() * MAX_SIZE;
                double length = random.nextDouble() * MAX_SIZE;
                return new Rectangle(color, width, length);

            case 3:
                double firstLeg = random.nextDouble() * MAX_SIZE;
                double secondLeg = random.nextDouble() * MAX_SIZE;
                return new RightTriangle(color, firstLeg, secondLeg);

            case 4:
                double topBase = random.nextDouble() * MAX_SIZE;
                double bottomBase = random.nextDouble() * MAX_SIZE;
                double height = random.nextDouble() * MAX_SIZE;
                return new IsoscelesTrapezoid(color, topBase, bottomBase, height);
            default:
                return getDefaultFigure();

        }
    }

    public Figure getDefaultFigure() {
        return new Circle("white", 10);
    }
}
