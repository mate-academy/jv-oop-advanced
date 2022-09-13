package core.basesyntax;

import java.util.Random;

public class FigureSupplier {

    private static final int SIDE_A = 15;
    private static final int SIDE_B = 10;
    private static final int SIDE_C = 8;
    private static final int FIGURE_COUNT = 5;
    private Random random = new Random();

    public Figure getRandomFigure() {
        ColorSupplier supplier = new ColorSupplier();
        IsoscelesTrapezoid isoscelesTrapezoid = new IsoscelesTrapezoid(random.nextInt(SIDE_A),
                random.nextInt(SIDE_B), random.nextInt(SIDE_C));
        isoscelesTrapezoid.setColor(String.valueOf(supplier.getRandomColor()));
        Circle circle = new Circle(random.nextInt(SIDE_A));
        RightTriangle rightTriangle = new RightTriangle(random.nextInt(SIDE_A),
                random.nextInt(SIDE_B));
        Rectangle rectangle = new Rectangle(random.nextInt(SIDE_A), random.nextInt(SIDE_B));
        Square square = new Square(random.nextInt(SIDE_A));
        Figure [] figures = {isoscelesTrapezoid, circle, rightTriangle,rectangle,square};
        return figures[random.nextInt(FIGURE_COUNT)];
    }

    public Figure getDefaultFigure() {
        Circle circle = new Circle(10);
        circle.setColor(String.valueOf(Color.WHITE));
        return circle;
    }
}
