package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    private ColorSupplier colorSupplier = new ColorSupplier();

    public Figure getRandomFigure() {
        String randomColor = String.valueOf(colorSupplier.getRandomColor());
        Random random = new Random();
        int figureType = random.nextInt(5);

        switch (figureType) {
            case 0:
                double sideLength = random.nextDouble() * 10 + 1;
                return new Square(randomColor, sideLength);

            case 1:
                double width = random.nextDouble() * 10 + 1;
                double height = random.nextDouble() * 10 + 1;
                return new Rectangle(randomColor, width, height);

            case 2:
                double firstLeg = random.nextDouble() * 10 + 1;
                double secondLeg = random.nextDouble() * 10 + 1;
                return new RightTriangle(randomColor, firstLeg, secondLeg);

            case 3:
                double radius = random.nextDouble() * 10 + 1;
                return new Circle(randomColor, radius);

            case 4:
                double topBase = random.nextDouble() * 10 + 1;
                double bottomBase = random.nextDouble() * 10 + 1;
                double trapezoidHeight = random.nextDouble() * 10 + 1;
                return new IsoscelesTrapezoid(randomColor, topBase, bottomBase, trapezoidHeight);

            default:
                return null;
        }
    }

    public Figure getDefaultFigure() {
        return new Circle("WHITE", 10);
    }
}
