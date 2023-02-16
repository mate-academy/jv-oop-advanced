package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    private static final int MAX_NUMBER = 100;
    private static final int FIGURE_COUNTER = 5;
    private static final Color DEFAULT_COLOR = Color.WHITE;
    private static final int DEFAULT_RADIUS = 10;
    private final Random random = new Random();
    private final ColorSupplier colorSupplier = new ColorSupplier();

    public Circle getCircle() {
        double radius = random.nextInt(MAX_NUMBER);
        Color color = colorSupplier.getRandomColor();
        return new Circle(color, radius);

    }

    public Square getSquare() {
        double side = random.nextInt(MAX_NUMBER);
        Color color = colorSupplier.getRandomColor();
        return new Square(color, side);
    }

    public IsoscelesTrapezoid getIsoscelesTrapezoid() {
        double topSide = random.nextInt(MAX_NUMBER);
        double bottomSide = random.nextInt(MAX_NUMBER);
        double middleSide = random.nextInt(MAX_NUMBER);
        Color color = colorSupplier.getRandomColor();
        return new IsoscelesTrapezoid(color, topSide, bottomSide, middleSide);
    }

    public Rectangle getRectangle() {
        double width = random.nextInt(MAX_NUMBER);
        double height = random.nextInt(MAX_NUMBER);
        Color color = colorSupplier.getRandomColor();
        return new Rectangle(color, width, height);
    }

    public RightTriangle getRightTriangle() {
        double firstLeg = random.nextInt(MAX_NUMBER);
        double secondLeg = random.nextInt(MAX_NUMBER);
        Color color = colorSupplier.getRandomColor();
        return new RightTriangle(color, firstLeg, secondLeg);
    }

    public Figure getRandomFigure() {
        int index = new Random().nextInt(FIGURE_COUNTER);
        switch (index) {
            case 0:
                return getCircle();
            case 1:
                return getIsoscelesTrapezoid();
            case 2:
                return getSquare();
            case 3:
                return getRectangle();
            default:
                return getRightTriangle();
        }
    }

    public Figure getDefaultFigure() {
        return new Circle(DEFAULT_COLOR, DEFAULT_RADIUS);
    }
}
