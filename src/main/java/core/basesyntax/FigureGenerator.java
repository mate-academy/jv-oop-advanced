package core.basesyntax;

import java.util.Random;

public class FigureGenerator {
    private static final int AVAILABLE_SHAPES_NUMBER = 5;

    public Figure getFigure() {
        Random random = new Random();
        ColorProducer colorProducer = new ColorProducer();
        switch (random.nextInt(AVAILABLE_SHAPES_NUMBER)) {
            case 0:
                Circle circle = new Circle(random.nextInt(10), colorProducer.getColor());
                return circle;

            case 1:
                IzoscelesTrapezoid trapezoid = new IzoscelesTrapezoid(random.nextInt(10) + 2,
                        random.nextInt(10), random.nextInt(10), colorProducer.getColor());
                return trapezoid;
            case 2:
                Rectangle rectangle = new Rectangle(random.nextInt(20), random.nextInt(10),
                        colorProducer.getColor());
                return rectangle;
            case 3:
                RightTriangle triangle = new RightTriangle(random.nextInt(10), random.nextInt(10),
                        colorProducer.getColor());
                return triangle;
            default:
                Square square = new Square(random.nextInt(10), colorProducer.getColor());
                return square;

        }
    }
}
