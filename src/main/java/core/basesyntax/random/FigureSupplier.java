package core.basesyntax.random;

import core.basesyntax.figure.Figure;
import core.basesyntax.figuretype.Circle;
import core.basesyntax.figuretype.IsoscelesTrapezoid;
import core.basesyntax.figuretype.Rectangle;
import core.basesyntax.figuretype.RightTriangle;
import core.basesyntax.figuretype.Square;
import java.util.Random;

public class FigureSupplier {
    private static final int AMOUNT_OF_FIGURE = 5;
    private static final int MAX_RANDOM_VALUE = 10;
    private Random random = new Random();

    public Figure getRandomFigure() {
        ColorSupplier randomColor = new ColorSupplier();
        String color = randomColor.getRandomColor();
        Figure resultFigure = new Figure();
        switch (random.nextInt(AMOUNT_OF_FIGURE)) {
            case 0:
                Circle circle = new Circle();
                circle.setName("circle");
                circle.setRadius(getRandomValue());
                circle.setColor(color);
                resultFigure = circle;
                break;
            case 1:
                IsoscelesTrapezoid isoscelesTrapezoid = new IsoscelesTrapezoid();
                isoscelesTrapezoid.setName("isosceles trapezoid");
                isoscelesTrapezoid.setLeftSide(getRandomValue());
                isoscelesTrapezoid.setRightSide(getRandomValue());
                isoscelesTrapezoid.setHeight(getRandomValue());
                isoscelesTrapezoid.setColor(color);
                resultFigure = isoscelesTrapezoid;
                break;
            case 2:
                Rectangle rectangle = new Rectangle();
                rectangle.setName("rectangle");
                rectangle.setLength(getRandomValue());
                rectangle.setWidth(getRandomValue());
                resultFigure = rectangle;
                break;
            case 3:
                RightTriangle rightTriangle = new RightTriangle();
                rightTriangle.setName("right triangle");
                rightTriangle.setFirstLeg(getRandomValue());
                rightTriangle.setSecondLeg(getRandomValue());
                rightTriangle.setColor(color);
                resultFigure = rightTriangle;
                break;
            default:
                Square square = new Square();
                square.setName("square");
                square.setSide(getRandomValue());
                square.setColor(color);
                resultFigure = square;
                break;
        }
        return resultFigure;
    }

    private int getRandomValue() {
        return random.nextInt(MAX_RANDOM_VALUE);
    }
}
