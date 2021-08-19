package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    private Figure circle() {
        Circle circle = new Circle();
        circle.draw();
        return null;
    }

    private Figure square() {
        Square square = new Square();
        square.draw();
        return null;
    }

    private Figure rectangle() {
        Rectangle rectangle = new Rectangle();
        rectangle.draw();
        return null;
    }

    private Figure rightTriangle() {
        RightTriangle rightTriangle = new RightTriangle();
        rightTriangle.draw();
        return null;
    }

    private Figure isoscelesTrapezoid() {
        IsoscelesTrapezoid isoscelesTrapezoid = new IsoscelesTrapezoid();
        isoscelesTrapezoid.draw();
        return null;
    }

    public Figure getRandomFigure() {
        Random random = new Random();
        int randomFigure = random.nextInt(5) + 1;
        switch (randomFigure) {
            case 1:
                return circle();
            case 2:
                return square();
            case 3:
                return rectangle();
            case 4:
                return rightTriangle();
            case 5:
                return isoscelesTrapezoid();
            default:
                break;
        }
        return null;
    }
}
