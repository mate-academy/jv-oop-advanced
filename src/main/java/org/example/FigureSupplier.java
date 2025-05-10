package org.example;

import java.util.Random;

public class FigureSupplier {
    private static final int FIGURE_COUNT = 5;
    private final ColorSupplier colorSupplier = new ColorSupplier();

    public Figure getRandomFigure() {
        Random random = new Random();
        int choice = random.nextInt(FIGURE_COUNT);
        String color = colorSupplier.getRandomColor();

        switch (choice) {
            case 0:
                double side = 5 + random.nextDouble() * 10;
                return new Square(color, side);
            case 1:
                double width = 5 + random.nextDouble() * 10;
                double height = 5 + random.nextDouble() * 10;
                return new Rectangle(color, width, height);
            case 2:
                double firstLeg = 5 + random.nextDouble() * 10;
                double secondLeg = 5 + random.nextDouble() * 10;
                return new RightTriangle(color, firstLeg, secondLeg);
            case 3:
                double radius = 5 + random.nextDouble() * 10;
                return new Circle(color, radius);
            case 4:
                double base1 = 5 + random.nextDouble() * 10;
                double base2 = 5 + random.nextDouble() * 10;
                double heightTrapezoid = 5 + random.nextDouble() * 10;
                return new IsoscelesTrapezoid(color, base1, base2, heightTrapezoid);
            default:
                throw new IllegalArgumentException("Unexpected choice value: " + choice);
        }
    }

    public Figure getDefaultFigure() {
        return new Circle("white", 10);
    }
}


