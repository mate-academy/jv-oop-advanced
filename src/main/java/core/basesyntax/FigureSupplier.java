package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    Figure getRandomFigureName() {
        final int maxSize = 20;
        final int minSize = 5;
        Figure figure = new Figure();
        figure.setColor(new ColorSupplier().getRandomColor());
        int index = new Random().nextInt(Forms.values().length);
        String value = Forms.values()[index].toString();
        figure.setName(value);
        switch (figure.getName()) {
            case "CIRCLE":
                int radius = new Random().nextInt(maxSize) + minSize;
                Figure circle = new Circle(radius);
                circle.setColor(figure.getColor());
                circle.getArea();
                circle.getDraw();
                return figure;
            case "RECTANGLE":
                int widht = new Random().nextInt(maxSize) + minSize;
                int height = new Random().nextInt(maxSize) + minSize;
                Figure rectangle = new Rectangle(widht, height);
                rectangle.setColor(figure.getColor());
                rectangle.getArea();
                rectangle.getDraw();
                return rectangle;
            case "SQUARE":
                int side = new Random().nextInt(maxSize) + minSize;
                Figure square = new Square(side);
                square.setColor(figure.getColor());
                square.getArea();
                square.getDraw();
                return square;
            case "TRIANGLE":
                int firstLeg = new Random().nextInt(maxSize) + minSize;
                int secondLeg = new Random().nextInt(maxSize) + minSize;
                Figure rightTriangle = new RightTriangle(firstLeg, secondLeg);
                rightTriangle.setColor(figure.getColor());
                rightTriangle.getArea();
                rightTriangle.getDraw();
                return rightTriangle;
            case "TRAPEZOID" :
                int basisDown = new Random().nextInt(maxSize) + minSize;
                int basisUp = new Random().nextInt(basisDown - 1) + basisDown - 2;
                int height1 = new Random().nextInt(maxSize) + minSize;
                Figure isoscelesTrapezoid = new IsoscelesTrapezoid(basisDown, basisUp, height1);
                isoscelesTrapezoid.setColor(figure.getColor());
                isoscelesTrapezoid.getArea();
                isoscelesTrapezoid.getDraw();
                return isoscelesTrapezoid;
            default:
                return null;
        }

    }

    Figure getDefaultFigure() {
        Figure figure = new Figure();
        Figure circle = new Circle(10);
        circle.setColor("WHITE");
        circle.getArea();
        circle.getDraw();
        return circle;
    }
}













