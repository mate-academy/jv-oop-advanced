package core.basesyntax;

import java.util.Random;

public class FigureProduce {

    public static final int COUNT_OF_MACHINE_IMPLEMENTATIONS = 4;
    Random random = new Random();
    ColorProducer colorProducer = new ColorProducer();

    public Figure get() {
        int randomGeneratedIndex = random.nextInt(COUNT_OF_MACHINE_IMPLEMENTATIONS);
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
        Figure circle = new Circle(random.nextDouble(), colorProducer.get());
        return circle;
    }

    private Figure getRectangle() {
        Figure rectangle = new Rectangle(random.nextDouble(),
                random.nextDouble(), colorProducer.get());
        return rectangle;
    }

    private Figure getSquare() {
        Figure square = new Square(random.nextDouble(), colorProducer.get());
        return square;
    }

    private Figure getTrapezoidIsosceles() {
        Figure trapezoidIsosceles = new TrapezoidIsosceles(random.nextDouble(),
                random.nextDouble(),
                random.nextDouble(),
                colorProducer.get());
        return trapezoidIsosceles;
    }

    private Figure getTriangleRight() {
        Figure triangleRight = new TriangleRight(random.nextDouble(),
                random.nextDouble(),
                colorProducer.get());
        return triangleRight;
    }

}
