package core.basesyntax.random;

import core.basesyntax.figure.Figure;
import core.basesyntax.figuretype.Circle;
import core.basesyntax.figuretype.IsoscelesTrapezoid;
import core.basesyntax.figuretype.Rectangle;
import core.basesyntax.figuretype.RightTriangle;
import core.basesyntax.figuretype.Square;
import java.util.Random;

public class FigureSupplier {
    private int maxValue = 10;
    private Random random = new Random();

    public Figure getRandomFigure() {
        ColorSupplier randomColor = new ColorSupplier();
        String color = randomColor.getRandomColor();
        Figure resultFigure = new Figure();
        switch (random.nextInt(maxValue)) {
            case 0:
                Circle circle = new Circle();
                circle.setRadius(getRandomValue(maxValue));
                circle.setColor(color);
                resultFigure = circle;
                break;
            case 1:
                IsoscelesTrapezoid isoscelesTrapezoid = new IsoscelesTrapezoid();
                isoscelesTrapezoid.setLeftSide(getRandomValue(maxValue));
                isoscelesTrapezoid.setRightSide(getRandomValue(maxValue));
                isoscelesTrapezoid.setHeight(getRandomValue(maxValue));
                isoscelesTrapezoid.setColor(color);
                resultFigure = isoscelesTrapezoid;
                break;
            case 2:
                Rectangle rectangle = new Rectangle();
                rectangle.setLength(getRandomValue(maxValue));
                rectangle.setWidth(getRandomValue(maxValue));
                rectangle.setColor(color);
                resultFigure = rectangle;
                break;
            case 3:
                RightTriangle rightTriangle = new RightTriangle();
                rightTriangle.setFirstLeg(getRandomValue(maxValue));
                rightTriangle.setSecondLeg(getRandomValue(maxValue));
                rightTriangle.setColor(color);
                resultFigure = rightTriangle;
                break;
            default:
                Square square = new Square();
                square.setSide(getRandomValue(maxValue));
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
