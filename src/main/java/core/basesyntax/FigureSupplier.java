package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    private static final int FIGURES_COUNT = 5;
    private static final Color DEFAULT_COLOR = Color.WHITE;
    private static final int DEFAULT_RADIUS = 10;
    private static final int MAX_RANGE = 20;
    private final Random random = new Random();
    private final ColorSupplier colorSupplier = new ColorSupplier(random);

    public Figure getRandomFigure() {
        int randomNameFigure = random.nextInt(FIGURES_COUNT);
        switch (randomNameFigure) {
            case 0:
                Circle circle = new Circle();
                circle.setColor(colorSupplier.getRandomColor());
                circle.setRadius(random.nextInt(MAX_RANGE) + 1);
                return circle;
            case 1:
                Square square = new Square();
                square.setColor(colorSupplier.getRandomColor());
                square.setSide(random.nextInt(MAX_RANGE) + 1);
                return square;
            case 2:
                RightTriangle rightTriangle = new RightTriangle();
                rightTriangle.setColor(colorSupplier.getRandomColor());
                rightTriangle.setFirstLeg(random.nextInt(MAX_RANGE) + 1);
                rightTriangle.setSecondLeg(random.nextInt(MAX_RANGE) + 1);
                return rightTriangle;
            case 3:
                Rectangle rectangle = new Rectangle();
                rectangle.setColor(colorSupplier.getRandomColor());
                rectangle.setWidth(random.nextInt(MAX_RANGE) + 1);
                rectangle.setLength(random.nextInt(MAX_RANGE) + 1);
                return rectangle;
            default:
                IsoscelesTrapezoid isoscelesTrapezoid = new IsoscelesTrapezoid();
                isoscelesTrapezoid.setColor(colorSupplier.getRandomColor());
                isoscelesTrapezoid.setHeight(random.nextInt(MAX_RANGE) + 1);
                isoscelesTrapezoid.setFirstSide(random.nextInt(MAX_RANGE) + 1);
                isoscelesTrapezoid.setSecondSide(random.nextInt(MAX_RANGE) + 1);
                return isoscelesTrapezoid;
        }
    }

    public Figure getDefaultFigure() {
        Circle circle = new Circle();
        circle.setColor(DEFAULT_COLOR);
        circle.setRadius(DEFAULT_RADIUS);
        return circle;
    }
}
