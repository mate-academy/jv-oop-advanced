package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    public Figure getRandomFigure() {
        Random random = new Random();
        int index = random.nextInt(AllFigure.values().length);
        AllFigure figure = AllFigure.values()[index];
        switch (figure) {
            case Circle:
                Circle circle = new Circle();
                circle.setRadius(random.nextInt(100));
                circle.setColor(ColorSupplier.getRandomColor());
                return circle;
            case IsoscelesTrapezoid:
                IsoscelesTrapezoid isoscelesTrapezoid = new IsoscelesTrapezoid();
                isoscelesTrapezoid.setBaseSide1(random.nextInt(100));
                isoscelesTrapezoid.setBaseSide2(random.nextInt(100));
                isoscelesTrapezoid.setHeight(random.nextInt(100));
                isoscelesTrapezoid.setColor(ColorSupplier.getRandomColor());
                return isoscelesTrapezoid;
            case Rectangle:
                Rectangle rectangle = new Rectangle();
                rectangle.setFirstLeg(random.nextInt(100));
                rectangle.setSecondLeg(random.nextInt(100));
                rectangle.setColor(ColorSupplier.getRandomColor());
                return rectangle;
            case RightTriangle:
                RightTriangle rightTriangle = new RightTriangle();
                rightTriangle.setFirstLeg(random.nextInt(100));
                rightTriangle.setSecondLeg(random.nextInt(100));
                rightTriangle.setColor(ColorSupplier.getRandomColor());
                return rightTriangle;
            default:
                Square square = new Square();
                square.setSide(random.nextInt(100));
                square.setColor(ColorSupplier.getRandomColor());
                return square;
        }

    }

    public Figure getDefaultFigure() {
        Circle circle = new Circle();
        circle.setRadius(10);
        circle.setColor(String.valueOf(Colors.WHITE));
        return circle;
    }
}
