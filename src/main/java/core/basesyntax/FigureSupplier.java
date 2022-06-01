package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    public static final int FIGURE_COUNT = 5;
    public static final int RADIUS = 10;
    private final Random random = new Random();
    private final double parameter = random.nextDouble();
    private final ColorSupplier colorSupplier = new ColorSupplier();
    private final Figure circle = new Circle(parameter, colorSupplier.getRandomColor());
    private final Figure square = new Square(parameter, colorSupplier.getRandomColor());
    private final Figure rectangle = new Rectangle(parameter, parameter,
            colorSupplier.getRandomColor());
    private final Figure rightTriangle = new RightTriangle(parameter, parameter,
            colorSupplier.getRandomColor());
    private final Figure isoscelesTrapezoid = new IsoscelesTrapezoid(parameter,
            parameter, parameter, colorSupplier.getRandomColor());
    private final Figure[] figures = {circle, square, rectangle, rightTriangle, isoscelesTrapezoid};

    public Figure getRandomFigure() {
        int figureNumber = random.nextInt(FIGURE_COUNT);
        return figures[figureNumber];
    }

    public Figure getDefaultFigure() {
        return new Circle(RADIUS, colorSupplier.getRandomColor());
    }
}
