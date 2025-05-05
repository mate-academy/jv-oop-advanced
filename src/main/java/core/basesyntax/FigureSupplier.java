package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    private ColorSupplier colorSupplier = new ColorSupplier();
    private Random random = new Random();
    private final int boundFigure = 5;
    private final int maximalSize = 100;
    private final int defaultSize = 10;
    private final Color defaultColor = Color.WHITE;

    public Figure getRandomFigure() {
        int randomFigure = random.nextInt(boundFigure) + 1;

        switch (randomFigure) {
            case 1:
                int radius = random.nextInt(maximalSize) + 1;
                return new Circle(radius, colorSupplier.getRandomColor());
            case 2:
                int side = random.nextInt(maximalSize) + 1;
                return new Square(side, colorSupplier.getRandomColor());
            case 3:
                int firstSide = random.nextInt(maximalSize) + 1;
                int secondSide = random.nextInt(maximalSize) + 1;
                return new Rectangle(firstSide, secondSide, colorSupplier.getRandomColor());
            case 4:
                int firstLeg = random.nextInt(maximalSize) + 1;
                int secondLeg = random.nextInt(maximalSize) + 1;
                return new RightTriangle(firstLeg, secondLeg,
                        colorSupplier.getRandomColor());
            default:
                int topSide = random.nextInt(maximalSize) + 1;
                int bottomSide = random.nextInt(maximalSize) + 1;
                int height = random.nextInt(maximalSize) + 1;
                return new IsoscelesTrapezoid(topSide, bottomSide, height,
                        colorSupplier.getRandomColor());
        }
    }

    public Figure getDefaultFigure() {
        return new Circle(defaultSize, defaultColor.name());
    }
}
