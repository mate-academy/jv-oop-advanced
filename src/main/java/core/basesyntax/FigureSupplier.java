package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    public Figures getRandomFigure() {
        Random random = new Random();
        int index = random.nextInt(5);
        ColorSupplier colorSupplier = new ColorSupplier();
        switch (index) {
            case 0:
                Figures square = new Square();
                square.setColor(colorSupplier.getRandomColor());
                ((Square) square).setSide(random.nextInt(20));
                return square;
            case 1:
                Figures rectangle = new Rectangle();
                rectangle.setColor(colorSupplier.getRandomColor());
                ((Rectangle) rectangle).setSideFirst(random.nextInt(20));
                ((Rectangle) rectangle).setSideSecond(random.nextInt(20));
                return rectangle;
            case 2:
                Figures rightTriangle = new RightTriangle();
                rightTriangle.setColor(colorSupplier.getRandomColor());
                ((RightTriangle) rightTriangle).setSideBase(random.nextInt(20));
                ((RightTriangle) rightTriangle).setSideHeight(random.nextInt(20));
                return rightTriangle;
            case 3:
                Figures circle = new Circle();
                circle.setColor(colorSupplier.getRandomColor());
                ((Circle) circle).setRadius(random.nextInt(20));
                return circle;
            default:
                Figures isoscelesTrapezoid = new IsoscelesTrapezoid();
                isoscelesTrapezoid.setColor(colorSupplier.getRandomColor());
                ((IsoscelesTrapezoid) isoscelesTrapezoid).setHigh(random.nextInt(20));
                ((IsoscelesTrapezoid) isoscelesTrapezoid).setSideBot(random.nextInt(20));
                ((IsoscelesTrapezoid) isoscelesTrapezoid).setSideHigh(random.nextInt(20));
                return isoscelesTrapezoid;
        }
    }

    public Figures getDefaultFigure() {
        Figures circle = new Circle();
        circle.setColor(Colors.white.name());
        ((Circle) circle).setRadius(5);
        return circle;
    }
}
