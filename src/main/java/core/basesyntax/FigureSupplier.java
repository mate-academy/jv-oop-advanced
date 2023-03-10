package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    private static final int FIGURE_COUNT = 5;
    private static final int MAX_NUMBER = 10;
    private final Random random = new Random();
    private final ColorSupplier colorSupplier = new ColorSupplier();

    public Circle getRandomCircle() {
        int radius = random.nextInt(MAX_NUMBER);
        FigureColor color = colorSupplier.getRandomColor();
        return new Circle(color, radius);
    }

    public Square getRandomSquare() {
        int sideLength = random.nextInt(MAX_NUMBER);
        FigureColor color = colorSupplier.getRandomColor();
        return new Square(color, sideLength);
    }

    public Rectangle getRandomRectangle() {
        int width = random.nextInt(MAX_NUMBER);
        int height = random.nextInt(MAX_NUMBER);
        FigureColor color = colorSupplier.getRandomColor();
        return new Rectangle(color, width, height);
    }

    public RightTriangle getRandomRightTriangle() {
        int firstLeg = random.nextInt(MAX_NUMBER);
        int secondLeg = random.nextInt(MAX_NUMBER);
        FigureColor color = colorSupplier.getRandomColor();
        return new RightTriangle(color, firstLeg, secondLeg);
    }

    public IsoscelesTrapezoid getRandomIsoscelesTrapezoid() {
        int topLength = random.nextInt(MAX_NUMBER);
        int bottomLength = random.nextInt(MAX_NUMBER);
        int height = random.nextInt(MAX_NUMBER);
        FigureColor color = colorSupplier.getRandomColor();
        return new IsoscelesTrapezoid(color, topLength, bottomLength, height);
    }

    public Figure getRandomFigure() {
        int index = random.nextInt(FIGURE_COUNT);

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
        return new Circle(FigureColor.WHITE, MAX_NUMBER);
    }
}
