package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    private Random random = new Random();
    private final int figureCount = 5;

    public Figure getRandomFigure() {

        String color = ColorSupplier.getRandomColor();
        int figureNumber = random.nextInt(figureCount);
        switch (figureNumber) {
            case 0:
                double side = random.nextDouble() * 10 + 1;
                return new Square(side, color);
            case 1:
                double radius = random.nextDouble() * 10 + 1;
                return new Circle(radius, color);
            case 2:
                double baseOne = random.nextDouble() * 10 + 1;
                double baseTwo = random.nextDouble() * 10 + 1;
                double height = random.nextDouble() * 10 + 1;
                return new IsoscelesTrapezoid(baseOne, baseTwo, height,
                        color);
            case 3:
                double sideA = random.nextDouble() * 10 + 1;
                double sideB = random.nextDouble() * 10 + 1;
                return new Rectangle(sideA, sideB, color);
            case 4:
                double catOne = random.nextDouble() * 10 + 1;
                double catTwo = random.nextDouble() * 10 + 1;
                return new RightTriangle(catOne, catTwo, color);
            default:
                return new Square(12, "Чорний");
        }
    }

    public Figure getDefaultFigure() {
        return new Circle(10, "white");
    }
}
