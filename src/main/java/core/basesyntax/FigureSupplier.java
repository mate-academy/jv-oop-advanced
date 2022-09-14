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
        IsoscelesTrapezoid isoscelesTrapezoid = new IsoscelesTrapezoid(
                String.valueOf(supplier.getRandomColor()), random.nextInt(SIDE_A),
                random.nextInt(SIDE_B), random.nextInt(SIDE_C));
        Circle circle = new Circle(String.valueOf(supplier.getRandomColor()),
                random.nextInt(SIDE_A));
        RightTriangle rightTriangle = new RightTriangle(String.valueOf(supplier.getRandomColor()),
                random.nextInt(SIDE_A), random.nextInt(SIDE_B));
        Rectangle rectangle = new Rectangle(String.valueOf(supplier.getRandomColor()),
                random.nextInt(SIDE_A), random.nextInt(SIDE_B));
        Square square = new Square(String.valueOf(supplier.getRandomColor()),
                random.nextInt(SIDE_A));
        Figure[] figures = {isoscelesTrapezoid, circle, rightTriangle, rectangle, square};
        return figures[random.nextInt(FIGURE_COUNT)];
    }

    public Figure getDefaultFigure() {
        return new Circle(String.valueOf(Color.WHITE),10);
    }
}
