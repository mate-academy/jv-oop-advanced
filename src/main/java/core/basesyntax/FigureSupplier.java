package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    public static final int BORDER = 30;
    public static final String COLOR_Default = "WHITE";
    public static final double RADIUS_Default = 10;
    public static final String CIRCLE_Default = "circle";

    public Figure getRandomFigure() {
        Random random = new Random();
        ColorSupplier supplier = new ColorSupplier();
        RightTriangle triangle = new RightTriangle("right triangle",
                supplier.getRandomColor(),
                random.nextInt(BORDER), random.nextInt(BORDER));
        Rectangle rectangle = new Rectangle("rectangle",
                supplier.getRandomColor(),
                 random.nextInt(BORDER), random.nextInt(BORDER));
        Square square = new Square("square",
                supplier.getRandomColor(), random.nextInt(BORDER));
        Circle circle = new Circle("circle",
                supplier.getRandomColor(), random.nextInt(BORDER));
        Trapezoid trapezoid = new Trapezoid("isosceles trapezoid",
                supplier.getRandomColor(), random.nextInt(BORDER),
                random.nextInt(BORDER), random.nextInt(BORDER));
        Figure[] array = new Figure[]{triangle, rectangle, square, circle, trapezoid};
        int index = random.nextInt(array.length);
        return array[index];
    }

    public Figure getDefaultFigure() {
        return new Circle(CIRCLE_Default, COLOR_Default,RADIUS_Default);
    }
}
