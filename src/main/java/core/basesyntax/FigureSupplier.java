package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    public static final int FIGURE_COUNT = 5;
    private Random random = new Random();

    public Figure getRandomFigure() {
        int figureNumber = random.nextInt(FIGURE_COUNT);
        int a = random.nextInt(10 + 1);
        int b = random.nextInt(10 + 1);
        int h = random.nextInt(10 + 1);
        ColorSupplier color = new ColorSupplier();
        String randomColor = color.getRandomColor();
        Circle circle = new Circle(a, randomColor);
        Square square = new Square(a, randomColor);
        Rectangle rectangle = new Rectangle(a, b, randomColor);
        RightTriangle rightTriangle = new RightTriangle(a, b, randomColor);
        IsoscelesTrapezoid isoscelesTrap = new IsoscelesTrapezoid(a, b, h, randomColor);
        Figure[] figures = new Figure[]{circle, square, rectangle, rightTriangle, isoscelesTrap};
        int i = new Random().nextInt(figures.length);
        return figures[i];
    }

    public Figure getDefaultFigure() {
        Circle circle = new Circle(10);
        circle.setColor("WHITE");
        return circle;
    }
}
