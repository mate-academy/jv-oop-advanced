package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    public static final int FIGURE_COUNT = 5;
    public static final String DEFAULT_COLOR = "white";
    public static final int MIN_LENGTH = 1;
    public static final int MAX_LENGTH = 10;
    private final Random random = new Random();
    private final ColorSupplier colorSupplier = new ColorSupplier();

    public Figure getRandomFigure() {
        int figureNumber = random.nextInt(FIGURE_COUNT);
        int randomLength = random.nextInt(MIN_LENGTH, MAX_LENGTH);
        String randomColor = colorSupplier.getRandomColor();
        switch (figureNumber) {
            case 0:
                Circle circle = new Circle();
                circle.setColor(randomColor);
                circle.setRadius(randomLength);
                return circle;
            case 1:
                IsoscelesTrapezoid isoscelesTrapezoid = new IsoscelesTrapezoid();
                isoscelesTrapezoid.setColor(randomColor);
                isoscelesTrapezoid.setBottomSide(randomLength);
                isoscelesTrapezoid.setTopSide(randomLength);
                isoscelesTrapezoid.setHeight(randomLength);
                return isoscelesTrapezoid;
            case 2:
                Rectangle rectangle = new Rectangle();
                rectangle.setColor(randomColor);
                rectangle.setFirstSide(randomLength);
                rectangle.setSecondSide(randomLength);
                return rectangle;
            case 3:
                RightTriangle rightTriangle = new RightTriangle();
                rightTriangle.setColor(randomColor);
                rightTriangle.setFirstLeg(randomLength);
                rightTriangle.setSecondLeg(randomLength);
                return rightTriangle;
            default:
                Square square = new Square();
                square.setColor(randomColor);
                square.setSide(randomLength);
                return square;
        }
    }

    public Figure getDefaultFigure() {
        Circle defCircle = new Circle();
        defCircle.setColor(DEFAULT_COLOR);
        defCircle.setRadius(MAX_LENGTH);
        return defCircle;
    }
}
