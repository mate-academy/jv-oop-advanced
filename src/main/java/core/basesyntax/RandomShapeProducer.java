package core.basesyntax;

import java.util.Random;

public class RandomShapeProducer {
    static final int NUMBER_OF_SHAPES = 5;

    public Shape getRandomShape() {
        int randomGeneratedIndex = new Random().nextInt(NUMBER_OF_SHAPES);
        switch (randomGeneratedIndex) {
            case 0:
                return getCircle();
            case 1:
                return getRectangle();
            case 2:
                return getSquare();
            case 3:
                return getRightTriangle();
            case 4:
                return getIsoscelesTrapezoid();
            default:
                return getSquare();
        }
    }

    private Colour getRandomColour() {
        int randomGeneratedIndex = new Random().nextInt(Colour.values().length);
        return Colour.values()[randomGeneratedIndex];
    }

    private Circle getCircle() {
        return new Circle(random(), getRandomColour());
    }

    private Rectangle getRectangle() {
        return new Rectangle(random(), random(), getRandomColour());
    }

    private Square getSquare() {
        return new Square(random(), getRandomColour());
    }

    private RightTriangle getRightTriangle() {
        return new RightTriangle(random(), random(), getRandomColour());
    }

    private IsoscelesTrapezoid getIsoscelesTrapezoid() {
        return new IsoscelesTrapezoid(random(), random(), random(), getRandomColour());
    }

    private int random() {
        return new Random().nextInt(10);
    }

}
