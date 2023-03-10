package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    private static final int figureCount = 5;
    private final int maxNumber = 10;
    private final Random random = new Random();
    private final ColorSupplier colorSupplier = new ColorSupplier();

    public Circle getRandomCircle() {
        int radius = random.nextInt(maxNumber);
        FigureColor color = colorSupplier.getRandomColor();
        return new Circle(color, radius);
    }

    public Square getRandomSquare() {
        int sideLength = random.nextInt(maxNumber);
        FigureColor color = colorSupplier.getRandomColor();
        return new Square(color, sideLength);
    }

    public Rectangle getRandomRectangle() {
        int width = random.nextInt(maxNumber);
        int height = random.nextInt(maxNumber);
        FigureColor color = colorSupplier.getRandomColor();
        return new Rectangle(color, width, height);
    }

    public RightTriangle getRandomRightTriangle() {
        int firstLeg = random.nextInt(maxNumber);
        int secondLeg = random.nextInt(maxNumber);
        FigureColor color = colorSupplier.getRandomColor();
        return new RightTriangle(color, firstLeg, secondLeg);
    }

    public IsoscelesTrapezoid getRandomIsoscelesTrapezoid() {
        int topLength = random.nextInt(maxNumber);
        int bottomLength = random.nextInt(maxNumber);
        int height = random.nextInt(maxNumber);
        FigureColor color = colorSupplier.getRandomColor();
        return new IsoscelesTrapezoid(color, topLength, bottomLength, height);
    }

    public Figure getRandomFigure() {
        int index = random.nextInt(figureCount);

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
        return new Circle(FigureColor.WHITE, maxNumber);
    }
}
