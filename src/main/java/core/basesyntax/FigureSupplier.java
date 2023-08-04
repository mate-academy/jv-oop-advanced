package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    private final ColorSupplier colorSupplier = new ColorSupplier();

    public Figure getRandomFigure() {
        Random random = new Random();
        int figureType = random.nextInt(5);
        double side = random.nextDouble() * 10 + 1;
        double firstLeg = random.nextDouble() * 10 + 1;
        double secondLeg = random.nextDouble() * 10 + 1;
        double radius = random.nextDouble() * 10 + 1;
        double topBase = random.nextDouble() * 10 + 1;
        double bottomBase = random.nextDouble() * 10 + 1;
        double height = random.nextDouble() * 10 + 1;
        String color = colorSupplier.getRandomColor();

        switch (figureType) {
            case 0:
                return new Circle(radius, color);
            case 1:
                return new Square(side, color);
            case 2:
                return new Rectangle(side, side * 2, color);
            case 3:
                return new RightTriangle(firstLeg, secondLeg, color);
            case 4:
                return new IsoscelesTrapezoid(topBase, bottomBase, height, color);
            default:
                throw new IllegalArgumentException("Invalid figure type");
        }
    }

    public Figure getDefaultFigure() {
        return new Circle(10, "white");
    }
}
