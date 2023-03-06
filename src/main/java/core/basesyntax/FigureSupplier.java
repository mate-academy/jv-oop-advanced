package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    private static final int FIGURE_COUNT = 10;
    private final Random random = new Random();
    private final ColorSupplier colorSupplier = new ColorSupplier();

    public Figure getRandomFigure() {
        int number = random.nextInt(FIGURE_COUNT);
        switch (number) {
            case 0:
                Figure circle = new Circle(random.nextInt(FIGURE_COUNT));
                circle.setColor(colorSupplier.getRandomColor());
                return circle;
            case 1:
                Figure square = new Square(random.nextInt(FIGURE_COUNT));
                square.setColor(colorSupplier.getRandomColor());
                return square;
            case 2:
                Figure rectangle = new Rectangle(random.nextInt(FIGURE_COUNT),
                        random.nextInt(FIGURE_COUNT));
                rectangle.setColor(colorSupplier.getRandomColor());
                return rectangle;
            case 3:
                Figure rightTriangle = new RightTriangle(random.nextInt(FIGURE_COUNT),
                        random.nextInt(FIGURE_COUNT));
                rightTriangle.setColor(colorSupplier.getRandomColor());
                return rightTriangle;
            case 4:
                Figure isoscelesTrapezoid = new IsoscelesTrapezoid(random.nextInt(FIGURE_COUNT),
                        random.nextInt(FIGURE_COUNT));
                isoscelesTrapezoid.setColor(colorSupplier.getRandomColor());
                return isoscelesTrapezoid;
            default:
                return getDefaultFigure();
        }
    }

    public Figure getDefaultFigure() {
        Figure figure = new Circle(FIGURE_COUNT);
        figure.setColor(Color.WHITE);
        return figure;
    }
}
