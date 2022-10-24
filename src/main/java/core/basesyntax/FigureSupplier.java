package core.basesyntax;

import core.basesyntax.figures.Figure;
import core.basesyntax.figures.Circle;
import core.basesyntax.figures.IsoscelesTrapezoid;
import core.basesyntax.figures.Rectangle;
import core.basesyntax.figures.RightTriangle;
import core.basesyntax.figures.Square;
import java.util.Random;

public class FigureSupplier {
    private Random random = new Random();
    private double randomValue = Math.abs(random.nextInt());
    private ColorSupplier colorSupplier = new ColorSupplier();
    private Color randomColor = colorSupplier.getRandomColor();
    private Figure circle = new Circle(randomColor, randomValue);
    private Figure isoscelesTrapezoid = new IsoscelesTrapezoid(randomColor, randomValue, randomValue, randomValue);
    private Figure rectangle = new Rectangle(randomColor, randomValue, randomValue);
    private Figure rightTriangle = new RightTriangle(randomColor, randomValue, randomValue);
    private Figure square = new Square(randomColor, randomValue);
    private Figure [] figures = {circle, isoscelesTrapezoid, rectangle, rightTriangle, square, circle};

    public Figure getRandomFigure() {
        int index = random.nextInt(figures.length);

        if (figures[index] instanceof Circle) {
            return circle;
        }
        if (figures[index] instanceof IsoscelesTrapezoid) {
            return isoscelesTrapezoid;
        }
        if (figures[index] instanceof Rectangle) {
            return rectangle;
        }
        if (figures[index] instanceof RightTriangle) {
            return rightTriangle;
        }
        if (figures[index] instanceof Square) {
            return square;
        }
        return null;
    }

    public Figure getDefaultFigure() {
        Figure defaultFigure = new Circle(Color.WHITE, 10);
        return defaultFigure;
    }
}