package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    private static final int FIGURE_NUMBER = 5;
    private static final int RANDOM_BOUND = 10;
    private static final double DEFAULT_CIRCLE_AREA = 100 * Math.PI;

    private Random random = new Random();
    private ColorSupplier colorSupplier = new ColorSupplier();
    private Square square = new Square();
    private Rectangle rectangle = new Rectangle();
    private RightTriangle rightTriangle = new RightTriangle();
    private Circle circle = new Circle();
    private IsoscelesTrapezoid isoscelesTrapezoid = new IsoscelesTrapezoid();

    public Figure getRandomFigure() {
        int figureNumber = random.nextInt(FIGURE_NUMBER) + 1;
        Color randomColor = colorSupplier.getRandomColor();

        switch (figureNumber) {
            case 1:
                return new Square(square.countArea(), randomColor,
                        random.nextInt(RANDOM_BOUND) + 1);
            case 2:
                return new Circle(circle.countArea(), randomColor,
                        random.nextInt(RANDOM_BOUND) + 1);
            case 3:
                return new Rectangle(rectangle.countArea(), randomColor,
                        random.nextInt(RANDOM_BOUND) + 1, random.nextInt(RANDOM_BOUND) + 1);
            case 4:
                return new RightTriangle(rightTriangle.countArea(),
                        randomColor, random.nextInt(RANDOM_BOUND) + 1);
            case 5:
                return new IsoscelesTrapezoid(isoscelesTrapezoid.countArea(), randomColor,
                        random.nextInt(RANDOM_BOUND) + 1, random.nextInt(2 * RANDOM_BOUND) + 1,
                        random.nextInt(2 * RANDOM_BOUND) + 1);
            default:
                return null;
        }
    }

    public Figure getDefaultFigure() {
        return new Circle(DEFAULT_CIRCLE_AREA, Color.WHITE, RANDOM_BOUND);
    }
}
