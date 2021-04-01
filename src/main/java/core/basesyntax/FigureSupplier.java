package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    public static Figure getRandomFigure() {
        Random randomN = new Random();
        Random value = new Random();
        final int upperValueBound = 1000;
        final int amountOfShapes = 4;
        int a = randomN.nextInt(amountOfShapes) + 1;
        int v = value.nextInt(upperValueBound) + 1;
        switch (a) {
            case 1:
                Square square = new Square();
                square.setSide(v);
                square.setColor(ColorSupplier.getRandomColor());
                return square;
            case 2:
                Rectangle rectangle = new Rectangle();
                rectangle.setHeight(v);
                rectangle.setWidth(v);
                rectangle.setColor(ColorSupplier.getRandomColor());
                return rectangle;
            case 3:
                RightTriangle rightTriangle = new RightTriangle();
                rightTriangle.setBase(v);
                rightTriangle.setHeight(v);
                rightTriangle.setColor(ColorSupplier.getRandomColor());
                return rightTriangle;
            case 4:
                Circle circle = new Circle();
                circle.setRadius(v);
                circle.setColor(ColorSupplier.getRandomColor());
                return circle;
            case 5:
                IsoscelesTrapezoid trapezoid = new IsoscelesTrapezoid();
                trapezoid.setUpBase(v);
                trapezoid.setDownBase(v);
                trapezoid.setTrapezoidHeight(v);
                trapezoid.setColor(ColorSupplier.getRandomColor());
                return trapezoid;
            default:
                break;
        }
        return null;
    }
}
