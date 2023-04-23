package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    private static final int RADIUS = 10;
    private static final int MAX_NUM = 20;

    private final ColorSupplier colorSupplier = new ColorSupplier();
    private final Random random = new Random();
    private final Figure circle = new Circle(colorSupplier.getRandomColor(),
            random.nextInt(MAX_NUM));
    private final Figure defaultCircle = new Circle(Color.WHITE.toString(), RADIUS);
    private final Figure square = new Square(colorSupplier.getRandomColor(),
            random.nextInt(MAX_NUM));
    private final Figure rectangle = new Rectangle(colorSupplier.getRandomColor(),
            random.nextInt(MAX_NUM), random.nextInt(MAX_NUM));
    private final Figure rightTriangle = new RightTriangle(colorSupplier.getRandomColor(),
            random.nextInt(MAX_NUM), random.nextDouble());
    private final Figure isoscelesTrapezoid = new IsoscelesTrapezoid(colorSupplier.getRandomColor(),
            random.nextDouble(), random.nextDouble(), random.nextInt(MAX_NUM));

    public Figure getRandomFigure() {
        circle.draw();
        square.draw();
        isoscelesTrapezoid.draw();
        rightTriangle.draw();
        rectangle.draw();
        return new Figure(colorSupplier.getRandomColor());
    }

    public Figure getDefaultFigure() {
        defaultCircle.draw();
        return new Circle(Color.WHITE.toString(), RADIUS);
    }
}
