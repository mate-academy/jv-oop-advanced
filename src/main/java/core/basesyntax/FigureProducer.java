package core.basesyntax;

import java.util.Random;

public class FigureProducer {
    static final int FIGURES_VALUE = 4;

    public Figure get() {
        int randomGeneratedIndex = new Random().nextInt(FIGURES_VALUE);
        switch (randomGeneratedIndex) {
            case 0:
                Circle circle = new Circle(getRandom(),ColorProducer.getColor());
                return circle;
            case 1:
                Triangle triangle = new Triangle(getRandom(),getRandom(),ColorProducer.getColor());
                return triangle;
            case 2:
                Square square = new Square(getRandom(),ColorProducer.getColor());
                return square;
            default:
                Trapezoid trapezoid = new Trapezoid(getRandom(),getRandom(),
                        getRandom(),ColorProducer.getColor());
                return trapezoid;
        }
    }

    public int getRandom() {
        return new Random().nextInt(15);
    }

}
