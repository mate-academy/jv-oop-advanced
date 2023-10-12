package core.basesyntax;

import core.basesyntax.enums.Figures;
import core.basesyntax.models.Circle;
import core.basesyntax.models.Figure;
import core.basesyntax.models.IsoscelesTrapezoid;
import core.basesyntax.models.Rectangle;
import core.basesyntax.models.RightTriangle;
import core.basesyntax.models.Square;
import java.util.Random;

public class FigureSupplier {
    public static final int MAX_COUNT = 10;
    private Random random = new Random();
    private ColorSupplier colorSupplier = new ColorSupplier();

    public Figure getRandomFigure() {
        int index = random.nextInt(Figures.values().length);
        switch (Figures.values()[index]) {
            case CIRCLE:
                Circle circle1 = new Circle();
                circle1.setColor(colorSupplier.getRandomColor());
                circle1.setRadius(random.nextInt(MAX_COUNT));
                circle1.setArea(circle1.obtainArea());
                return circle1;
            case ISOSCELES_TRAPEZOID:
                IsoscelesTrapezoid isoscelesTrapezoid = new IsoscelesTrapezoid();
                isoscelesTrapezoid.setColor(colorSupplier.getRandomColor());
                isoscelesTrapezoid.setSideA(random.nextInt(MAX_COUNT));
                isoscelesTrapezoid.setSideB(random.nextInt(MAX_COUNT));
                isoscelesTrapezoid.setHeight(random.nextInt(MAX_COUNT));
                isoscelesTrapezoid.setArea(isoscelesTrapezoid.obtainArea());
                return isoscelesTrapezoid;
            case SQUARE:
                Square square1 = new Square();
                square1.setColor(colorSupplier.getRandomColor());
                square1.setSide(random.nextInt(MAX_COUNT));
                square1.setArea(square1.obtainArea());
                return square1;
            case RIGHT_TRIANGLE:
                RightTriangle rightTriangle1 = new RightTriangle();
                rightTriangle1.setColor(colorSupplier.getRandomColor());
                rightTriangle1.setFirstLeg(random.nextInt(MAX_COUNT));
                rightTriangle1.setSecondLeg(random.nextInt(MAX_COUNT));
                rightTriangle1.setArea(rightTriangle1.obtainArea());
                return rightTriangle1;
            default:
                Rectangle rectangle = new Rectangle();
                rectangle.setColor(colorSupplier.getRandomColor());
                rectangle.setWidth(random.nextInt(MAX_COUNT));
                rectangle.setHeight(random.nextInt(MAX_COUNT));
                rectangle.setArea(rectangle.obtainArea());
                return rectangle;
        }
    }

    public Figure getDefaultFigure() {
        Circle circle = new Circle();
        circle.setColor("WHITE");
        circle.setRadius(MAX_COUNT);
        return circle;
    }
}
