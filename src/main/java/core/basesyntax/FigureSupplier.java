package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    private ColorSupplier colorSupplier = new ColorSupplier();

    public Figure getRandomFigure() {
        Random random = new Random();
        int type = random.nextInt(5);

        String color = colorSupplier.getRandomColor();
        switch (type) {
            case 0:
                double side = random.nextDouble() * 10 + 1;
                return new Square(side, color);
            case 1:
                double length = random.nextDouble() * 10 + 1;
                double width = random.nextDouble() * 10 + 1;
                return new Rectangle(length, width, color);
            case 2:
                double firstLeg = random.nextDouble() * 10 + 1;
                double secondLeg = random.nextDouble() * 10 + 1;
                return new RightTriangle(firstLeg, secondLeg, color);
            case 3:
                double radius = random.nextDouble() * 10 + 1;
                return new Circle(radius, color);
            case 4:
                double topBase = random.nextDouble() * 10 + 1;
                double bottomBase = random.nextDouble() * 10 + 1;
                double height = random.nextDouble() * 10 + 1;
                return new IsoscelesTrapezoid(topBase, bottomBase, height, color);
            default:
                return null;
        }
    }

    public Figure getDefaultFigure() {
        return new Circle(10, "white");
    }
}
