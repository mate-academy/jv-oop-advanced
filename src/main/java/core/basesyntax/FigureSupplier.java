package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    public static final int BORDER = 30;

    public Figures getRandomFigure() {
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
        Figures[] array = new Figures[]{triangle, rectangle, square, circle, trapezoid};
        int index = random.nextInt(array.length);
        return array[index];
    }

    public Figures getDefaultFigure() {
        return new Circle("circle", "WHITE",10);
    }
}
