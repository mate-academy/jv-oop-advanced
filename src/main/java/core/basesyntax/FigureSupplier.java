package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    public static final int FIGURE_COUNT = 5;
    public static final int SIZE_COUNT = 10;
    ColorSupplier colorSupplier = new ColorSupplier();
    Random random = new Random();
    Figure circle = new Circle("circle", random.nextInt(SIZE_COUNT),
            colorSupplier.getRandomColor());
    Figure square = new Square("square", random.nextInt(SIZE_COUNT),
            colorSupplier.getRandomColor());
    Figure rectangle = new Rectangle("rectangle", random.nextInt(SIZE_COUNT),
            random.nextInt(SIZE_COUNT), colorSupplier.getRandomColor());
    Figure right_triangle= new RightTriangle("right triangle", random.nextInt(SIZE_COUNT),
            random.nextInt(SIZE_COUNT), colorSupplier.getRandomColor());
    Figure isosceles_trapezoid = new IsoscelesTrapezoid("isosceles trapezoid", random.nextInt(SIZE_COUNT),
            random.nextInt(SIZE_COUNT), random.nextInt(SIZE_COUNT), colorSupplier.getRandomColor());
    Figure[] figures = new Figure[]{circle, square, rectangle, right_triangle, isosceles_trapezoid};

    public Figure getRandomFigure() {
        return figures[new Random().nextInt(FIGURE_COUNT)];
    }

    public Figure getDefaultFigure() {
        Figure circleDefault = new Circle("circle", 10, Color.WHITE);
        return circleDefault;
    }
}
