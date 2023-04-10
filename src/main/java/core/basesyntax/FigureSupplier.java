package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    private static final Random RANDOM_FIGURE = new Random();

    public Figure getRandomFigure(String randomColor) {
        String color = ColorSupplier.getRandomColor();
        int figureType = RANDOM_FIGURE.nextInt(5);
        switch (figureType) {
            case 0:
                double side = RANDOM_FIGURE.nextDouble() * 10;
                return new Square(color, side);
            case 1:
                double length = RANDOM_FIGURE.nextDouble() * 10;
                double width = RANDOM_FIGURE.nextDouble() * 10;
                return new Rectangle(color, length, width);
            case 2:
                double topBase = RANDOM_FIGURE.nextDouble() * 10;
                double bottomBase = RANDOM_FIGURE.nextDouble() * 10;
                double height = RANDOM_FIGURE.nextDouble() * 10;
                return new IsoscelesTrapezoid(color, topBase, bottomBase, height);
            case 3:
                double radius = RANDOM_FIGURE.nextDouble() * 10;
                return new Circle(color, radius);
            default:
                double firstLeg = RANDOM_FIGURE.nextDouble() * 10;
                double secondLeg = RANDOM_FIGURE.nextDouble() * 10;
                return new RightTriangle(color, firstLeg, secondLeg);
        }
    }

    public Figure getDefaultFigure() {
        return new Circle("white", 10);
    }
}

