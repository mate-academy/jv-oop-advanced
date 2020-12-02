package core.basesyntax;

import java.util.Random;

public class FigureProducer {

    private static final int COUNT_OF_FIGURE = 4;
    Random random = new Random();
    ColorProducer colorProducer = new ColorProducer();

    public Figure get() {
        int randomGeneratedIndex = random.nextInt(COUNT_OF_FIGURE);
        switch (randomGeneratedIndex) {
            case 0:
                return getRectangle();
            case 2:
                return getSquare();
            case 3:
                return getTrapezoidIsosceles();
            case 4:
                return getTriangleRight();
            default:
                return getCircle();
        }

    }

    private Figure getCircle() {
        Figure circle = new Circle(generateNumber(), colorProducer.get());
        return circle;
    }

    private Figure getRectangle() {
        Figure rectangle = new Rectangle(generateNumber(),
                generateNumber(), colorProducer.get());
        return rectangle;
    }

    private Figure getSquare() {
        Figure square = new Square(generateNumber(), colorProducer.get());
        return square;
    }

    private Figure getTrapezoidIsosceles() {
        Figure trapezoidIsosceles = new TrapezoidIsosceles(generateNumber(),
                generateNumber(),
                generateNumber(),
                colorProducer.get());
        return trapezoidIsosceles;
    }

    private Figure getTriangleRight() {
        Figure triangleRight = new TriangleRight(random.nextDouble(),
                generateNumber(),
                colorProducer.get());
        return triangleRight;
    }

    private double generateNumber() {
        int randoms = -1;
        while (randoms < 0) {
            randoms = random.nextInt();
        }
        return randoms + random.nextDouble();
    }

}
