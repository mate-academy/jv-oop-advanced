package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    private static final int MAX_VALUE = 11;
    private ColorSupplier randomColor = new ColorSupplier();
    private Random random = new Random();
    private Figure square = new Square(randomColor.getRandomColor(),
            (double) random.nextInt(MAX_VALUE));
    private Figure circle = new Circle(randomColor.getRandomColor(),
            (double) random.nextInt(MAX_VALUE));
    private Figure rectangle = new Rectangle(randomColor.getRandomColor(),
            (double) random.nextInt(MAX_VALUE), (double) random.nextInt(MAX_VALUE));
    private Figure rightTriangle = new RightTriangle(randomColor.getRandomColor(),
            (double) random.nextInt(MAX_VALUE), (double) random.nextInt(MAX_VALUE));
    private Figure isoscelesTrapezoid
            = new IsoscelesTrapezoid(randomColor.getRandomColor(),
            (double) random.nextInt(MAX_VALUE), (double) random.nextInt(MAX_VALUE),
            (double) random.nextInt(MAX_VALUE));

    public Figure getRandomFigure() {
        Figure[] figures = new Figure[]{square, circle, rectangle,
                rightTriangle, isoscelesTrapezoid};
        int randomIndex = random.nextInt(figures.length);
        return figures[randomIndex];
    }

    public Figure getDefaultFigure() {
        return new Circle("WHITE", 10);
    }

}
