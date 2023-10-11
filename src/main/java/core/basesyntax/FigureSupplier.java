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
    private static Random random = new Random();
    private static ColorSupplier colorSupplier = new ColorSupplier();

    public Figure getRandomFigure() {
        int index = random.nextInt(Figures.values().length);
        return Figures.values()[index].equals(Figures.CIRCLE) ? returnCircle() :
                Figures.values()[index].equals(Figures.SQUARE) ? returnSquare() :
                        Figures.values()[index].equals(Figures.RECTANGLE) ? returnRectangle() :
                                Figures.values()[index].equals(Figures.ISOSCELES_TRAPEZOID)
                                        ? returnIsoscelesTrapezoid() :
                                        Figures.values()[index].equals(Figures.RIGHT_TRIANGLE)
                                                ? returnRightTriangle()
                                                : null;
    }

    public Figure getDefaultFigure() {
        Circle circle = new Circle();
        circle.setColor("WHITE");
        circle.setRadius(10);
        return circle;
    }

    public static Figure returnCircle() {
        Circle circle1 = new Circle();
        circle1.setColor(colorSupplier.getRandomColor());
        circle1.setRadius(random.nextInt(10));
        circle1.setArea(circle1.obtainArea());
        return circle1;

    }

    public static Figure returnSquare() {
        Square square1 = new Square();
        square1.setColor(colorSupplier.getRandomColor());
        square1.setSide(random.nextInt(10));
        square1.setArea(square1.obtainArea());
        return square1;
    }

    public static Figure returnRightTriangle() {
        RightTriangle rightTriangle1 = new RightTriangle();
        rightTriangle1.setColor(colorSupplier.getRandomColor());
        rightTriangle1.setFirstLeg(random.nextInt(10));
        rightTriangle1.setSecondLeg(random.nextInt(10));
        rightTriangle1.setArea(rightTriangle1.obtainArea());
        return rightTriangle1;
    }

    public static Figure returnIsoscelesTrapezoid() {
        IsoscelesTrapezoid isoscelesTrapezoid = new IsoscelesTrapezoid();
        isoscelesTrapezoid.setColor(colorSupplier.getRandomColor());
        isoscelesTrapezoid.setSideA(random.nextInt(10));
        isoscelesTrapezoid.setSideB(random.nextInt(10));
        isoscelesTrapezoid.setHeight(random.nextInt(10));
        isoscelesTrapezoid.setArea(isoscelesTrapezoid.obtainArea());
        return isoscelesTrapezoid;
    }

    public static Figure returnRectangle() {
        Rectangle rectangle = new Rectangle();
        rectangle.setColor(colorSupplier.getRandomColor());
        rectangle.setWidth(random.nextInt(10));
        rectangle.setHeight(random.nextInt(10));
        rectangle.setArea(rectangle.obtainArea());
        return rectangle;
    }

}
