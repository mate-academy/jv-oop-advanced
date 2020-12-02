package core.basesyntax;

import java.util.Random;

public class CreateFigure {
    public static final int COUNT_FIGURE = 5;
    private ColorProducer colorProducer = new ColorProducer();

    public Figure get() {
        int randomFigureIndex = new Random().nextInt(COUNT_FIGURE);
        switch (randomFigureIndex) {
            case 0:
                return new Square(getRandomSize(), colorProducer.getColor());
            case 1:
                return new RightTriangle(getRandomSize(),
                        getRandomSize(), colorProducer.getColor());
            case 2:
                return new Rectangle(getRandomSize(), getRandomSize(), colorProducer.getColor());
            case 3:
                return new Circle(getRandomSize(), colorProducer.getColor());
            default:
                return new IsoscelesTrapezoid(getRandomSize(),
                        getRandomSize(), getRandomSize(), colorProducer.getColor());
        }
    }

    private int getRandomSize() {
        return new Random().nextInt(100);
    }
}
