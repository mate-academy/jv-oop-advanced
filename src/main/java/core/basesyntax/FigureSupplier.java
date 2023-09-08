package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    public static final int MAX_SIZE = 10;
    public static final int FIGURE_COUNT = 5;
    public static final String DEFAULT_COLOR = "WHITE";
    public static final int DEFAULT_RADIUS = 10;
    private Random random = new Random();
    private ColorSupplier colorSupplier;
    private String color;

    public FigureSupplier(ColorSupplier colorSupplier) {
        this.colorSupplier = colorSupplier;
    }

    private Figure getRandomSquare() {
        int side = random.nextInt(MAX_SIZE) + 1;
        color = colorSupplier.getRandomColor();
        return new Square(color, side);
    }

    private Figure getRandomRectangle() {
        int width = random.nextInt(MAX_SIZE) + 1;
        int height = random.nextInt(MAX_SIZE) + 1;
        color = colorSupplier.getRandomColor();
        return new Rectangle(color, width, height);
    }

    private Figure getRandomRightTriangle() {
        int firstLeg = random.nextInt(MAX_SIZE) + 1;
        int secondLeg = random.nextInt(MAX_SIZE) + 1;
        color = colorSupplier.getRandomColor();
        return new RightTriangle(color, firstLeg, secondLeg);
    }

    private Figure getRandomCircle() {
        int radius = random.nextInt(MAX_SIZE) + 1;
        color = colorSupplier.getRandomColor();
        return new Circle(color, radius);
    }

    private Figure getRandomIsoscelesTrapezoid() {
        int topSide = random.nextInt(MAX_SIZE) + 1;
        int bottomSide = random.nextInt(MAX_SIZE) + 1;
        int height = random.nextInt(MAX_SIZE) + 1;
        color = colorSupplier.getRandomColor();
        return new IsoscelesTrapezoid(color, topSide, bottomSide, height);
    }

    public Figure getRandomFigure() {
        int figureType = random.nextInt(FIGURE_COUNT);
        switch (figureType) {
            case 0:
                return getRandomSquare();
            case 1:
                return getRandomRectangle();
            case 2:
                return getRandomRightTriangle();
            case 3:
                return getRandomCircle();
            default:
                return getRandomIsoscelesTrapezoid();
        }
    }

    public Figure getDefaultFigure() {
        return new Circle(DEFAULT_COLOR,DEFAULT_RADIUS);
    }
}
