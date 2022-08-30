package core.basesyntax.suppliers;

import core.basesyntax.Color;
import core.basesyntax.figures.Circle;
import core.basesyntax.figures.Figure;
import core.basesyntax.figures.IsoscelesTrapezoid;
import core.basesyntax.figures.Rectangle;
import core.basesyntax.figures.RightTriangle;
import core.basesyntax.figures.Square;
import java.util.Random;

public class FigureSupplier {
    public static final int FIGURE_COUNT = 5;
    private static final int CIRCLE_RADIUS = 10;
    private static final Color CIRCLE_COLOR = Color.WHITE;
    private final Random random = new Random();
    private final Circle circle = new Circle();
    private final ColorSupplier colorSupplier = new ColorSupplier();

    public Figure getRandomFigure() {
        int index = random.nextInt(FIGURE_COUNT);
        Figure figure;
        switch (index) {
            case 1 :
                figure = getRandomCircle();
                break;
            case 2 :
                figure = getRandomIsoscelesTrapezoid();
                break;
            case 3 :
                figure = getRandomRectangle();
                break;
            case 4 :
                figure = getRandomRightTriangle();
                break;
            default:
                figure = getRandomSquare();
        }
        return figure;
    }

    public Figure getDefaultFigure() {
        circle.setRadius(CIRCLE_RADIUS);
        circle.setColor(CIRCLE_COLOR);
        return circle;
    }

    private Figure setRandomCircle() {
        circle.setRadius(random.nextDouble() + 1);
        circle.setColor(colorSupplier.getRandomColor());
        return circle;
    }

    private Figure setRandomIsoscelesTrapezoid() {
        IsoscelesTrapezoid isoscelesTrapezoid = new IsoscelesTrapezoid();
        isoscelesTrapezoid.setLongBase(random.nextDouble() + 1);
        isoscelesTrapezoid.setShortBase(random.nextDouble() + 1);
        isoscelesTrapezoid.setHigh(random.nextDouble() + 1);
        isoscelesTrapezoid.setColor(colorSupplier.getRandomColor());
        return isoscelesTrapezoid;
    }

    private Figure setRandomRectangle() {
        Rectangle rectangle = new Rectangle();
        rectangle.setLength(random.nextDouble() + 1);
        rectangle.setWidth(random.nextDouble() + 1);
        rectangle.setColor(colorSupplier.getRandomColor());
        return rectangle;
    }

    private Figure setRandomRightTriangle() {
        RightTriangle rightTriangle = new RightTriangle();
        rightTriangle.setBase(random.nextDouble() + 1);
        rightTriangle.setLeg(random.nextDouble() + 1);
        rightTriangle.setColor(colorSupplier.getRandomColor());
        return rightTriangle;
    }

    private Figure setRandomSquare() {
        Square square = new Square();
        square.setSide(random.nextDouble() + 1);
        square.setColor(colorSupplier.getRandomColor());
        return square;
    }

    private Figure getRandomCircle() {
        return setRandomCircle();
    }

    private Figure getRandomIsoscelesTrapezoid() {
        return setRandomIsoscelesTrapezoid();
    }

    private Figure getRandomRectangle() {
        return setRandomRectangle();
    }

    private Figure getRandomRightTriangle() {
        return setRandomRightTriangle();
    }

    private Figure getRandomSquare() {
        return setRandomSquare();
    }
}
