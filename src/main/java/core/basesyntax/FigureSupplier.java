package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    private static final int FIGURE_COUNT = 5;
    private static final int RANDOM_BOUND = 30;
    private static final int DEFAULT_CIRCLE_RADIUS = 10;
    private Random random = new Random();
    private ColorSupplier colorSupplier = new ColorSupplier();

    public Figure getRandomFigure() {
        int numberOfFigures = random.nextInt(FIGURE_COUNT);
        Color randomColor = ColorSupplier.getRandomColor();
        switch (numberOfFigures) {
            case 0:
                Circle circle = new Circle();
                circle.setRadius(random.nextInt(RANDOM_BOUND));
                circle.setColor(randomColor);
                return circle;
            case 1:
                IsoscelesTrapezoid isoscelesTrapezoid = new IsoscelesTrapezoid();
                isoscelesTrapezoid.setSide(random.nextInt(RANDOM_BOUND));
                isoscelesTrapezoid.setBottom(random.nextInt(RANDOM_BOUND));
                isoscelesTrapezoid.setTop(random.nextInt(RANDOM_BOUND));
                isoscelesTrapezoid.setColor(randomColor);
                return isoscelesTrapezoid;
            case 2:
                Rectangle rectangle = new Rectangle();
                rectangle.setFirstLeg(random.nextInt(RANDOM_BOUND));
                rectangle.setSecondLeg(random.nextInt(RANDOM_BOUND));
                rectangle.setColor(randomColor);
                return rectangle;
            case 3:
                RightTriangle rightTriangle = new RightTriangle();
                rightTriangle.setFirstLeg(random.nextInt(RANDOM_BOUND));
                rightTriangle.setSecondLeg(random.nextInt(RANDOM_BOUND));
                rightTriangle.setColor(randomColor);
                return rightTriangle;
            case 4:
                Square square = new Square();
                square.setSide(random.nextInt(RANDOM_BOUND));
                square.setColor(randomColor);
                return square;
            default:
                return new Square();
        }
    }

    public Figure getDefaultFigure() {
        Circle circle = new Circle();
        circle.setRadius(DEFAULT_CIRCLE_RADIUS);
        circle.setColor(Color.WHITE);
        return circle;
    }
}


