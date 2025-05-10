package core.basesyntax;

import java.util.Random;

public class FigureSupplier {

    public Figure getRandomFigure() {
        int index = new Random().nextInt(5);
        switch (index) {
            case 0:
                int radiusA = new Random().nextInt(1,10);
                Circle circle = new Circle();
                circle.setRadius(radiusA);
                circle.setColor(new ColorSupplier().getRandomColor());
                return circle;
            case 1:
                int sideB = new Random().nextInt(1,10);
                Square square = new Square();
                square.setSide(sideB);
                square.setColor(new ColorSupplier().getRandomColor());
                return square;
            case 2:
                int lengthC = new Random().nextInt(1,10);
                int heigthC = new Random().nextInt(1,10);
                Rectangle rectangle = new Rectangle();
                rectangle.setLength(lengthC);
                rectangle.setHeight(heigthC);
                rectangle.setColor(new ColorSupplier().getRandomColor());
                return rectangle;
            case 3:
                int sideD = new Random().nextInt(1,10);
                int heigthD = new Random().nextInt(1,10);
                IsoscelesTrapezoid isoscelesTrapezoid = new IsoscelesTrapezoid();
                isoscelesTrapezoid.setSide(sideD);
                isoscelesTrapezoid.setHeight(heigthD);
                isoscelesTrapezoid.setColor(new ColorSupplier().getRandomColor());
                return isoscelesTrapezoid;
            case 4:
                int firstLegE = new Random().nextInt(1,10);
                int secondLegE = new Random().nextInt(1,10);
                RightTriangle rightTriangle = new RightTriangle();
                rightTriangle.setFirstLeg(firstLegE);
                rightTriangle.setSecondLeg(secondLegE);
                rightTriangle.setColor(new ColorSupplier().getRandomColor());
                return rightTriangle;
            default:
                break;
        }

        return null;
    }

    public Figure getDefaultFigure() {
        Circle circle = new Circle();
        circle.setRadius(10);
        circle.setColor("WHITE");
        return circle;
    }
}

