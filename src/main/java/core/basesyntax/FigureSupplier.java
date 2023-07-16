package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    private static final int maxSize = 10;
    private ColorSupplier colorSupplier;

    public FigureSupplier(ColorSupplier colorSupplier) {
        this.colorSupplier = colorSupplier;
    }

    public Figure getRandomFigure() {
        Random random = new Random();
        int figureType = random.nextInt(5);
        switch (figureType) {
            case 0:
                int side = random.nextInt(maxSize) + 1;
                String color = colorSupplier.getRandomColor();
                return new Square(color, side);
            case 1:
                int width = random.nextInt(maxSize) + 1;
                int height = random.nextInt(maxSize) + 1;
                color = colorSupplier.getRandomColor();
                return new Rectangle(color, width, height);
            case 2:
                int firstLeg = random.nextInt(maxSize) + 1;
                int secondLeg = random.nextInt(maxSize) + 1;
                color = colorSupplier.getRandomColor();
                return new RightTriangle(color, firstLeg, secondLeg);
            case 3:
                int radius = random.nextInt(maxSize) + 1;
                color = colorSupplier.getRandomColor();
                return new Circle(color, radius);
            default:
                int topSide = random.nextInt(maxSize) + 1;
                int bottomSide = random.nextInt(maxSize) + 1;
                height = random.nextInt(maxSize) + 1;
                color = colorSupplier.getRandomColor();
                return new IsoscelesTrapezoid(color, topSide, bottomSide, height);
        }
    }

    public Figure getDefaultFigure() {
        return new Circle("WHITE", 10);
    }
}
