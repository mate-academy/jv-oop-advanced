package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    public Figure getRandomFigure() {
        int figureCount = 5;
        Random randResult = new Random();
        int figureNum = randResult.nextInt(figureCount);

        double randomRange = 100.0;

        ColorSupplier randomColor = new ColorSupplier();

        String color = randomColor.getRandomColor();

        switch (figureNum) {
            case 0:
                double randomSide = new Random().nextDouble() * randomRange;
                return new Square(randomSide, color);
            case 1:
                double randomSideA = new Random().nextDouble() * randomRange;
                double randomSideB = new Random().nextDouble() * randomRange;
                return new Rectangle(randomSideA, randomSideB, color);
            case 2:
                double randomRadius = new Random().nextDouble() * randomRange;
                return new Circle(randomRadius, color);
            case 3:
                double randomUpperBase = new Random().nextDouble() * randomRange;
                double randomLowerBase = new Random().nextDouble() * randomRange;
                double randomHeight = new Random().nextDouble() * randomRange;
                return new IsoscelesTrapezoid(randomUpperBase, randomLowerBase, randomHeight,
                        color);
            case 4:
                double randomFirstLeg = new Random().nextDouble() * randomRange;
                double randomSecondLeg = new Random().nextDouble() * randomRange;
                return new RightTriangle(randomFirstLeg, randomSecondLeg, color);
            default:
                return new Square(0.00, null);
        }
    }
}
