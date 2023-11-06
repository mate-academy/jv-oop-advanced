package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    private static final ColorSupplier colorSupplier = new ColorSupplier();
    private static final Random random = new Random();

    public Figure getRandomFigure() {
        int numberRandom = random.nextInt(5);
        String color = colorSupplier.getRandomColor();

        switch (numberRandom) {
            case 0:
                double side = random.nextDouble() * 10 + 1;
                return new Square(color, side);
            case 1:
                double length = random.nextDouble() * 10 + 1;
                double width = random.nextDouble() * 10 + 1;
                return new Rectangle(color, length, width);
            case 2:
                double radius = random.nextDouble() * 10 + 1;
                return new Circle(color, radius);
            case 3:
                double firstLeg = random.nextDouble() * 10 + 1;
                double secondLeg = random.nextDouble() * 10 + 1;
                return new RightTriangle(color, firstLeg, secondLeg);
            case 4:
                double topBase = random.nextDouble() * 10 + 1;
                double bottomBase = random.nextDouble() * 10 + 1;
                double height = random.nextDouble() * 10 + 1;
                return new IsoscelesTrapezoid(color, topBase, bottomBase, height);
            default:
                return null;
        }
    }

    public Figure getDefaultFigure() {
        return new Circle("white", 10);
    }
}
