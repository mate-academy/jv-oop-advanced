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
    private final Random random = new Random();
    private final Circle circle = new Circle();
    private final IsoscelesTrapezoid isoscelesTrapezoid = new IsoscelesTrapezoid();
    private final Rectangle rectangle = new Rectangle();
    private final RightTriangle rightTriangle = new RightTriangle();
    private final Square square = new Square();
    private final String circleName = "circle";
    private final int circleRadius = 10;
    private final String circleColor = String.valueOf(Color.WHITE);
    private final ColorSupplier colorSupplier = new ColorSupplier();
    private Figure figure;

    public Figure getRandomFigure() {
        int index = random.nextInt(FIGURE_COUNT);
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
        circle.setFigureName(circleName);
        circle.setRadius(circleRadius);
        circle.setColor(circleColor);
        return circle;
    }

    public Figure setRandomCircle() {
        circle.setFigureName("circle");
        circle.setRadius(random.nextDouble() + 1);
        circle.setColor(colorSupplier.getRandomColor());
        return circle;
    }

    public Figure setRandomIsoscelesTrapezoid() {
        isoscelesTrapezoid.setFigureName("isosceles trapezoid");
        isoscelesTrapezoid.setLongBase(random.nextDouble() + 1);
        isoscelesTrapezoid.setShortBase(random.nextDouble() + 1);
        isoscelesTrapezoid.setHigh(random.nextDouble() + 1);
        isoscelesTrapezoid.setColor(colorSupplier.getRandomColor());
        return isoscelesTrapezoid;
    }

    public Figure setRandomRectangle() {
        rectangle.setFigureName("rectangle");
        rectangle.setLength(random.nextDouble() + 1);
        rectangle.setWidth(random.nextDouble() + 1);
        rectangle.setColor(colorSupplier.getRandomColor());
        return rectangle;
    }

    public Figure setRandomRightTriangle() {
        rightTriangle.setFigureName("rectangle");
        rightTriangle.setBase(random.nextDouble() + 1);
        rightTriangle.setLeg(random.nextDouble() + 1);
        rightTriangle.setColor(colorSupplier.getRandomColor());
        return rightTriangle;
    }

    public Figure setRandomSquare() {
        square.setFigureName("square");
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
