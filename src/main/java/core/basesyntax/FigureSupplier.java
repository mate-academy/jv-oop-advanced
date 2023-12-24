package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    private static final int MAX = 5;
    private static final int MIN = 1;
    private Random random = new Random();
    private ColorSupplier colorSupplier = new ColorSupplier();

    public Figure getRandomFigure() {

        Figure randomFigure = null;

        int randomType = random.nextInt(MAX - MIN + MIN) + MIN;
        String color;
        switch (randomType) {
            case 1 -> {
                double radius = random.nextDouble() * 20;
                String name = "Circle";
                color = colorSupplier.getRandomColor();
                randomFigure = new Circle(radius, name, color);
            }
            case 2 -> {
                double sideA = random.nextDouble() * 20;
                double sideB = random.nextDouble() * 20;
                String name = "Rectangle";
                color = colorSupplier.getRandomColor();
                randomFigure = new Rectangle(sideA, sideB, name, color);
            }
            case 3 -> {
                double side = random.nextDouble() * 20;
                String name = "Square";
                color = colorSupplier.getRandomColor();
                randomFigure = new Square(side, name, color);
            }
            case 4 -> {
                double bottomBase = random.nextDouble() * 20;
                double upperBase = random.nextDouble() * 20;
                double lateralSide = random.nextDouble() * 20;
                String name = "IsoscelesTrapezoid";
                color = colorSupplier.getRandomColor();
                randomFigure = new IsoscelesTrapezoid(bottomBase,
                        upperBase, lateralSide, name, color);
            }
            case 5 -> {
                double cat1 = random.nextDouble() * 20;
                double cat2 = random.nextDouble() * 20;
                String name = "RightTriangle";
                color = colorSupplier.getRandomColor();
                randomFigure = new RightTriangle(cat1, cat2, name, color);
            }
            default -> getDefaultFigure();
        }
        return randomFigure;
    }

    public Figure getDefaultFigure() {
        return new Circle(10, "Circle", Color.WHITE.name());
    }
}
