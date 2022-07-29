package core.basesyntax;

import core.basesyntax.figures.Circle;
import core.basesyntax.figures.IsoscelesTrapezoid;
import core.basesyntax.figures.Rectangle;
import core.basesyntax.figures.RightTriangle;
import core.basesyntax.figures.Square;
import java.util.Random;

public class FigureSupplier {
    private static final int VALUE = 50;
    private static final int DEFAULT_VALUE = 10;
    private static final String DEFAULT_COLOR = String.valueOf(Color.WHITE);
    private Random random = new Random();

    public Figure getRandomFigure() {
        ColorSupplier color = new ColorSupplier();
        int index = new Random().nextInt(EnumFigure.values().length);
        switch (EnumFigure.values()[index]) {
            case CIRCLE:
                Circle circle = new Circle();
                circle.setRadius(new Random().nextInt());
                circle.setColor(color.getRandomColor().toString());
                return circle;
            case ISOSCELES_TRAPEZOID:
                IsoscelesTrapezoid isoscelesTrapezoid = new IsoscelesTrapezoid();
                isoscelesTrapezoid.setHeight(random.nextInt(VALUE));
                isoscelesTrapezoid.setFirstSide(random.nextInt(VALUE));
                isoscelesTrapezoid.setSecondSide(random.nextInt(VALUE));
                isoscelesTrapezoid.setColor(color.getRandomColor().toString());
                return isoscelesTrapezoid;
            case RECTANGLE:
                Rectangle rectangle = new Rectangle();
                rectangle.setFirstSide(random.nextInt(VALUE));
                rectangle.setSecondSide(random.nextInt(VALUE));
                rectangle.setColor(color.getRandomColor().toString());
                return rectangle;
            case RIGHT_TRIANGLE:
                RightTriangle rightTriangle = new RightTriangle();
                rightTriangle.setFirstLeg(random.nextInt(VALUE));
                rightTriangle.setRightLeg(random.nextInt(VALUE));
                rightTriangle.setColor(color.getRandomColor().toString());
                return rightTriangle;
            case SQUARE:
                Square square = new Square();
                square.setFirstSide(random.nextInt(VALUE));
                square.setColor(color.getRandomColor().toString());
                return square;
            default:
                return getDefaultFigure();
        }

    }

    public Figure getDefaultFigure() {
        Circle circle = new Circle();
        circle.setRadius(DEFAULT_VALUE);
        circle.setColor(DEFAULT_COLOR);
        return circle;
    }
}
