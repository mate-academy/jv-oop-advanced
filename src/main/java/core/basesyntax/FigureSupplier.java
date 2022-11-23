package core.basesyntax;

import core.basesyntax.figures.Circle;
import core.basesyntax.figures.IsoscelesTrapezoid;
import core.basesyntax.figures.Rectangle;
import core.basesyntax.figures.RightTriangle;
import core.basesyntax.figures.Square;
import java.util.Random;

public class FigureSupplier {
    private static final int FIGURE_COUNT = 5;
    private static final int DEFAULT_RADIUS = 10;
    private static final int MAX_VALUE = 10;
    private ColorSupplier colorSupplier = new ColorSupplier();
    private Random random = new Random();

    public Figure getRandomFigure() {
        int randomIndex = random.nextInt(FIGURE_COUNT);
        switch (randomIndex) {
            case 0:
                return getRandomCircle();
            case 1:
                return getRandomIsoscelesTrapezoid();
            case 2:
                return getRandomRectangle();
            case 3:
                return getRandomRightTriangle();
            default:
                return getRandomSquare();
        }
    }

    public Figure getDefaultFigure() {
        Circle defaultFigure = new Circle();
        defaultFigure.setColor(Color.WHITE.name());
        defaultFigure.setRadius(DEFAULT_RADIUS);
        return defaultFigure;
    }

    private Circle getRandomCircle() {
        Circle circle = new Circle();
        circle.setRadius(random.nextInt(MAX_VALUE));
        circle.setColor(colorSupplier.getRandomColor());
        return circle;
    }

    private IsoscelesTrapezoid getRandomIsoscelesTrapezoid() {
        IsoscelesTrapezoid isoscelesTrapezoid = new IsoscelesTrapezoid();
        isoscelesTrapezoid.setHeight(random.nextInt(MAX_VALUE));
        isoscelesTrapezoid.setFirstSide(random.nextInt(MAX_VALUE));
        isoscelesTrapezoid.setSecondSide(random.nextInt(MAX_VALUE));
        isoscelesTrapezoid.setColor(colorSupplier.getRandomColor());
        return isoscelesTrapezoid;
    }

    private Rectangle getRandomRectangle() {
        Rectangle rectangle = new Rectangle();
        rectangle.setFirstSide(random.nextInt(MAX_VALUE));
        rectangle.setSecondSide(random.nextInt(MAX_VALUE));
        rectangle.setColor(colorSupplier.getRandomColor());
        return rectangle;
    }

    private RightTriangle getRandomRightTriangle() {
        RightTriangle rightTriangle = new RightTriangle();
        rightTriangle.setSecondSide(random.nextInt(MAX_VALUE));
        rightTriangle.setFirstSide(random.nextInt(MAX_VALUE));
        rightTriangle.setColor(colorSupplier.getRandomColor());
        return rightTriangle;
    }

    private Square getRandomSquare() {
        Square square = new Square();
        square.setSide(random.nextInt(MAX_VALUE));
        square.setColor(colorSupplier.getRandomColor());
        return square;
    }
}
