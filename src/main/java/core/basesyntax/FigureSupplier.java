package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    public Figure getRandomFigure() {
        final int FigureCount = 5;
        final int MaxRandomNumber = 20;
        Random random = new Random();
        int figureNumber = random.nextInt(FigureCount);
        Color randomColor = new ColorSupplier().getRandomColor();

        switch (figureNumber) {
            case 1:
                double radius = random.nextDouble() * MaxRandomNumber;
                return new Circle(radius, randomColor);
            case 2:
                double side = random.nextDouble() * MaxRandomNumber;
                return new Square(side, randomColor);
            case 3:
                double length = random.nextDouble() * MaxRandomNumber;
                double width = random.nextDouble() * MaxRandomNumber;
                return new Rectangle(length, width, randomColor);
            case 4:
                double firstLeg = random.nextDouble() * MaxRandomNumber;
                double secondLeg = random.nextDouble() * MaxRandomNumber;
                return new RightTriangle(firstLeg, secondLeg, randomColor);
            default:
                double topSide = random.nextDouble() * MaxRandomNumber;
                double downSide = random.nextDouble() * MaxRandomNumber;
                double height = random.nextDouble() * MaxRandomNumber;
                return new IsoscelesTrapezoid(topSide, downSide, height, randomColor);
        }
    }

    public Figure getDefaultFigure() {
        final double DefaultRadius = 10.0;
        return new Circle(DefaultRadius, Color.WHITE);
    }
}
