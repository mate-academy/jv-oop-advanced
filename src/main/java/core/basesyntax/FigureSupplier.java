package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    private static final int NUMBER_OF_FIGURES = 5;
    private static final double MAX_VALUE = 100;
    private final ColorSupplier colorSupplier = new ColorSupplier();
    private final Random rand = new Random();

    public Figure getRandomFigure() {
        int figureIndex = rand.nextInt(NUMBER_OF_FIGURES);

        String color = colorSupplier.getRandomColor();
        switch (figureIndex) {
            case 0:
                double side = rand.nextDouble(MAX_VALUE) + 1;
                return new Square(side, color);
            case 1:
                double rectWidth = rand.nextDouble(MAX_VALUE) + 1;
                double rectHeight = rand.nextDouble(MAX_VALUE) + 1;
                return new Rectangle(rectWidth, rectHeight, color);
            case 2:
                double radius = rand.nextDouble(MAX_VALUE) + 1;
                return new Circle(radius, color);
            case 3:
                double firstLeg = rand.nextDouble(MAX_VALUE) + 1;
                double secondLeg = rand.nextDouble(100) + 1;
                return new RightTriangle(firstLeg, secondLeg, color);
            case 4:
                double firstParallelSide = rand.nextDouble(MAX_VALUE) + 1;
                double secondParallelSide = rand.nextDouble(MAX_VALUE) + 1;
                double height = rand.nextDouble(MAX_VALUE) + 1;
                return new IsoscelesTrapezoid(firstParallelSide, secondParallelSide,
                        height, color);
            default:
                return getDefaultFigure();
        }
    }

    public Figure getDefaultFigure() {
        return new Circle(10, Colors.WHITE.name());
    }
}
