package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
private final Random random = new Random();
    Circle circle = new Circle();
    Rectangle rectangle = new Rectangle();
    Square square = new Square();
    IsoscelesTrapezoid isoscelesTrapezoid = new IsoscelesTrapezoid();
    RightTriangle rightTriangle = new RightTriangle();
    public Figure getRandomFigure() {
        int index = random.nextInt(4);
        if(index == 0) {
            circle.setRadius(random.nextInt(10));
            return circle;
        }
        if(index == 1) {
            rectangle.setWidth(random.nextInt(10));
            rectangle.setHeight(random.nextInt(10));
            return rectangle;
        }
        if(index == 2) {
            square.setSide(random.nextInt(10));
            return square;
        }
        if(index == 3) {
            isoscelesTrapezoid.setHeight(random.nextInt(10));
            isoscelesTrapezoid.setLowerBase(random.nextInt(20));
            isoscelesTrapezoid.setUpperBase(random.nextInt(10));
            return isoscelesTrapezoid;
        }
        if(index == 4) {
            rightTriangle.setFirstLeg(random.nextInt(10));
            rightTriangle.setSecondLeg(random.nextInt(10));
            return rightTriangle;
        }
        else return null;

    }
}
