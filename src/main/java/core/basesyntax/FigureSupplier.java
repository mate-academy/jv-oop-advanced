package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    private static final int MAX_VALUE = 11;
    private final ColorSupplier randomColor = new ColorSupplier();
    private final Random random = new Random();
    private final double randomDouble = (double) random.nextInt(MAX_VALUE);
    private final Figure square = new Square(randomColor.getRandomColor(), randomDouble);
    private final Figure circle = new Circle(randomColor.getRandomColor(), randomDouble);
    private final Figure rectangle = new Rectangle(randomColor.getRandomColor(), randomDouble, randomDouble);
    private final Figure rightTriangle = new RightTriangle(randomColor.getRandomColor(), randomDouble, randomDouble);
    private final Figure isoscelesTrapezoid = new IsoscelesTrapezoid(randomColor.getRandomColor(), randomDouble,
            randomDouble, randomDouble);
    private final Figure[] FIGURES = new Figure[]{square, circle, rectangle, rightTriangle, isoscelesTrapezoid};
    public Figure getRandomFigure() {
        int figureInt = random.nextInt(FIGURES.length);
        return FIGURES[figureInt];
    }
    public Figure getDefaultFigure() {
        return new Circle("WHITE", 10);
    }

}
