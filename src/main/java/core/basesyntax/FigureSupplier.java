package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    public static final int FIGURE_COUNT = 5;
    public static final String DEFAULT_COLOR = Color.WHITE.name().toLowerCase();
    public static final int MIN_LENGTH = 1;
    public static final int MAX_LENGTH = 10;
    private final Random random = new Random();
    private final ColorSupplier colorSupplier = new ColorSupplier();

    public Figure getRandomFigure() {
        int figureNumber = random.nextInt(FIGURE_COUNT);
        String randomColor = colorSupplier.getRandomColor();
        switch (figureNumber) {
            case 0:
                Circle circle = new Circle();
                circle.setColor(randomColor);
                circle.setRadius(randomValue());
                return circle;
            case 1:
                IsoscelesTrapezoid isoscelesTrapezoid = new IsoscelesTrapezoid();
                isoscelesTrapezoid.setColor(randomColor);
                isoscelesTrapezoid.setBottomSide(randomValue());
                isoscelesTrapezoid.setTopSide(randomValue());
                isoscelesTrapezoid.setHeight(randomValue());
                return isoscelesTrapezoid;
            case 2:
                Rectangle rectangle = new Rectangle();
                rectangle.setColor(randomColor);
                rectangle.setFirstSide(randomValue());
                rectangle.setSecondSide(randomValue());
                return rectangle;
            case 3:
                RightTriangle rightTriangle = new RightTriangle();
                rightTriangle.setColor(randomColor);
                rightTriangle.setFirstLeg(randomValue());
                rightTriangle.setSecondLeg(randomValue());
                return rightTriangle;
            default:
                Square square = new Square();
                square.setColor(randomColor);
                square.setSide(randomValue());
                return square;
        }
    }

    public Figure getDefaultFigure() {
        Circle circle = new Circle();
        circle.setColor(DEFAULT_COLOR);
        circle.setRadius(MAX_LENGTH);
        return circle;
    }

    private int randomValue() {
        return random.nextInt(MIN_LENGTH, MAX_LENGTH);
    }
}
