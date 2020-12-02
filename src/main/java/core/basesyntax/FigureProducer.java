package core.basesyntax;

import java.util.Random;

public class FigureProducer {
    static final int FIGURES_VALUE = 4;

    public Figure get() {
        int randomGeneratedIndex = new Random().nextInt(FIGURES_VALUE);
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

    public int getRandom() {
        return new Random().nextInt(10);
    }

    private Circle getCircle() {
        Circle circle = new Circle();
        circle.setRadius(getRandom());
        return circle;
    }

    private Triangle getTriangle() {
        Triangle triangle = new Triangle();
        triangle.setFirstSide(getRandom());
        triangle.setSecondSide(getRandom());
        triangle.setThirdSide(getRandom());
        return triangle;
    }

    private Square getSquare() {
        Square square = new Square();
        square.setSide(new Random().nextInt(10));
        return square;
    }

    private Trapezoid getTrapezoid() {
        Trapezoid trapezoid = new Trapezoid();
        trapezoid.setFirstBase(getRandom());
        trapezoid.setSecondBase(getRandom());
        trapezoid.setHeight(getRandom());
        return trapezoid;
    }
}
