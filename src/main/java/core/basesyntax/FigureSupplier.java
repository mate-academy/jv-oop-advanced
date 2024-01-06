package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    public Figure getRandomFigure() {
        Random random = new Random();
        int index = random.nextInt(5);
        ColorSupplier colorSupplier = new ColorSupplier();

        Circle circle = new Circle();
        IsoscelesTrapezoid trapezoid = new IsoscelesTrapezoid();
        Rectangle rectangle = new Rectangle();
        RightTriangle rightTriangle = new RightTriangle();
        Square square = new Square();

        switch (index) {
            case 0: {
                circle.setRadius(random.nextDouble(100.0));
                circle.setColor(colorSupplier.getRandomColor());
                return circle;
            }
            case 1: {
                trapezoid.setHeight(random.nextDouble(10.0,20.0));
                trapezoid.setFirstBase(random.nextDouble(10.0,20.0));
                trapezoid.setSecondBase(random.nextDouble(15.0, 30.0));
                trapezoid.setColor(colorSupplier.getRandomColor());
                return trapezoid;
            }
            case 2: {
                rectangle.setASide(random.nextDouble(50.0));
                rectangle.setBSide(random.nextDouble(50.0));
                rectangle.setColor(colorSupplier.getRandomColor());
                return rectangle;
            }
            case 3: {
                rightTriangle.setASide(random.nextDouble(30.0));
                rightTriangle.setColor(colorSupplier.getRandomColor());
                return rightTriangle;
            }
            case 4: {
                square.setASide(random.nextDouble(30.0));
                square.setColor(colorSupplier.getRandomColor());
                return square;
            }
            default: System.out.println("something is wrong!!!");
        }

        return getDefaultFigure();
    }

    public Figure getDefaultFigure() {
        Circle defCircle = new Circle();
        defCircle.setRadius(10.0);
        defCircle.setColor(Color.WHITE);
        return defCircle;
    }
}
