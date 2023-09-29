package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    public static final int FIGURE_COUNT = 5;

    public static Figure getRandomFigure() {
        Random random = new Random();
        int randomChoice = random.nextInt(FIGURE_COUNT); // Choose a random type of figure
        String color = ColorSupplier.getRandomColor();

        switch (randomChoice) {
            case 0:
                double squareSide = random.nextDouble() * 10 + 1;
                return new Square(squareSide, color);
            case 1:
                double length = random.nextDouble() * 10 + 1;
                double width = random.nextDouble() * 10 + 1;
                return new Rectangle(length, width, color);
            case 2:
                double base = random.nextDouble() * 10 + 1;
                double height = random.nextDouble() * 10 + 1;
                return new RightTriangle(base, height, color);
            case 3:
                double radius = random.nextDouble() * 10 + 1;
                return new Circle(radius, color);
            default:
                double topBase = random.nextDouble() * 10 + 1;
                double bottomBase = random.nextDouble() * 10 + 1;
                double trapezoidSide = random.nextDouble() * 10 + 1;
                return new IsoscelesTrapezoid(topBase, bottomBase, trapezoidSide, color);
        }
    }

    public static Figure getDefaultFigure() {
        // The default shape is a white circle with a radius of 10
        return new Circle(10, Colors.WHITE.name());
    }

}
