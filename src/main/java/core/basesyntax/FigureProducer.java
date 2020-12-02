package core.basesyntax;

import java.util.Random;

public class FigureProducer {
    public Figure get() {
        int randomGeneratedIndex = new Random().nextInt(4);
        switch (randomGeneratedIndex) {
            case 0:
                return getCircle();
            case 1:
                return getSquare();
            case 2:
                return getTrapezoid();
            default:
                return getTriangle();
        }
    }

    private Circle getCircle() {
        Circle circle = new Circle();
        circle.setRadius(new Random().nextInt(10));
        return circle;
    }

    private Triangle getTriangle() {
        Triangle triangle = new Triangle();
        triangle.setFirstSide(new Random().nextInt(10));
        triangle.setSecondSide(new Random().nextInt(10));
        triangle.setThirdSide(new Random().nextInt(10));
        return triangle;
    }

    private Square getSquare() {
        Square square = new Square();
        square.setSide(new Random().nextInt(10));
        return square;
    }

    private Trapezoid getTrapezoid() {
        Trapezoid trapezoid = new Trapezoid();
        trapezoid.setFirstBase(new Random().nextInt(10));
        trapezoid.setSecondBase(new Random().nextInt(10));
        trapezoid.setHeight(new Random().nextInt(10));
        return trapezoid;
    }
}
