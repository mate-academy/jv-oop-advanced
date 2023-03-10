package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    private final int FigureCount = 5;
    private final int MaxNumber = 10;
    private final Random random = new Random();
    private final ColorSupplier colorSupplier = new ColorSupplier();

    public Circle getRandomCircle() {
        int radius = random.nextInt(MaxNumber);
        FigureColor color = colorSupplier.getRandomColor();
        return new Circle(color, radius);
    }

    public Square getRandomSquare() {
        int sideLength = random.nextInt(MaxNumber);
        FigureColor color = colorSupplier.getRandomColor();
        return new Square(color, sideLength);
    }

    public Rectangle getRandomRectangle() {
        int width = random.nextInt(MaxNumber);
        int height = random.nextInt(MaxNumber);
        FigureColor color = colorSupplier.getRandomColor();
        return new Rectangle(color, width, height);
    }

    public RightTriangle getRandomRightTriangle() {
        int firstLeg = random.nextInt(MaxNumber);
        int secondLeg = random.nextInt(MaxNumber);
        FigureColor color = colorSupplier.getRandomColor();
        return new RightTriangle(color, firstLeg, secondLeg);
    }

    public IsoscelesTrapezoid getRandomIsoscelesTrapezoid() {
        int topLength = random.nextInt(MaxNumber);
        int bottomLength = random.nextInt(MaxNumber);
        int height = random.nextInt(MaxNumber);
        FigureColor color = colorSupplier.getRandomColor();
        return new IsoscelesTrapezoid(color, topLength, bottomLength, height);
    }

    public Figure getRandomFigure() {
        int index = random.nextInt(FigureCount);

        switch (index) {
            case 0:
                return getRandomCircle();
            case 1:
                return getRandomSquare();
            case 2:
                return getRandomRectangle();
            case 3:
                return getRandomRightTriangle();
            default:
                return getRandomIsoscelesTrapezoid();
        }
    }

    public Figure getDefaultFigure() {
        return new Circle(FigureColor.WHITE, MaxNumber);
    }
}
