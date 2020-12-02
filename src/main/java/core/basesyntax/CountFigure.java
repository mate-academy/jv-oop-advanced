package core.basesyntax;

import java.util.Random;

public class CountFigure {
    public static final int CountFigure = 5;
    private ColorProducer colorProducer = new ColorProducer();

    public Figure get() {
        int randomFigureIndex = new Random().nextInt(CountFigure);
        switch (randomFigureIndex) {
            case 0:
                return new Square(random(), colorProducer.getColor());
            case 1:
                return new RightTriangle(random(), random(), colorProducer.getColor());
            case 2:
                return new Rectangle(random(), random(), colorProducer.getColor());
            case 3:
                return new Circle(random(), colorProducer.getColor());
            default:
                return new IsoscelesTrapezoid(random(),
                        random(), random(), colorProducer.getColor());
        }
    }

    public int random() {
        return new Random().nextInt(100);
    }
}
