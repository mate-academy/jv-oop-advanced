package core.basesyntax.random;

import core.basesyntax.figure.Figure;
import core.basesyntax.figuretype.Circle;
import core.basesyntax.figuretype.IsoscelesTrapezoid;
import core.basesyntax.figuretype.Rectangle;
import core.basesyntax.figuretype.RightTriangle;
import core.basesyntax.figuretype.Square;
import java.util.Random;

public class FigureSupplier {
    public static final int MAX_VALUE = 10;
    private Random random = new Random();

    public Figure getRandomFigure() {
        ColorSupplier randomColor = new ColorSupplier();
        String color = randomColor.getRandomColor();
        Figure resultFigure;
        switch (random.nextInt(MAX_VALUE)) {
            case 0:
                Circle circle = new Circle();
                circle.setRadius(getRandomValue(MAX_VALUE));
                circle.setColor(color);
                resultFigure = circle;
                break;
            case 1:
                IsoscelesTrapezoid isoscelesTrapezoid = new IsoscelesTrapezoid();
                isoscelesTrapezoid.setLeftSide(getRandomValue(MAX_VALUE));
                isoscelesTrapezoid.setRightSide(getRandomValue(MAX_VALUE));
                isoscelesTrapezoid.setHeight(getRandomValue(MAX_VALUE));
                isoscelesTrapezoid.setColor(color);
                resultFigure = isoscelesTrapezoid;
                break;
            case 2:
                Rectangle rectangle = new Rectangle();
                rectangle.setLength(getRandomValue(MAX_VALUE));
                rectangle.setWidth(getRandomValue(MAX_VALUE));
                rectangle.setColor(color);
                resultFigure = rectangle;
                break;
            case 3:
                RightTriangle rightTriangle = new RightTriangle();
                rightTriangle.setFirstLeg(getRandomValue(MAX_VALUE));
                rightTriangle.setSecondLeg(getRandomValue(MAX_VALUE));
                rightTriangle.setColor(color);
                resultFigure = rightTriangle;
                break;
            default:
                Square square = new Square();
                square.setSide(getRandomValue(MAX_VALUE));
                square.setColor(color);
                resultFigure = square;
                break;
        }
        return resultFigure;
    }

    public int getRandomValue(int maxValue) {
        return random.nextInt(maxValue);
    }
}
