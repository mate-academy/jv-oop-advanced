package core.basesyntax.producers;

import core.basesyntax.Figure;
import core.basesyntax.shape.Circle;
import core.basesyntax.shape.IsoscelesTrapezoid;
import core.basesyntax.shape.Rectangle;
import core.basesyntax.shape.RightTriangle;
import core.basesyntax.shape.Square;
import java.util.Random;

public class FigureProducer {
    public static final int COUNT_OF_FIGURE = 5;

    public static Figure get() {
        int randomGeneratedIndex = new Random().nextInt(COUNT_OF_FIGURE);
        switch (randomGeneratedIndex) {
            case 0:
                return new Square(NumberProducer.getNumber());
            case 1:
                return new Circle(NumberProducer.getNumber());
            case 2:
                return new RightTriangle(NumberProducer.getNumber(), NumberProducer.getNumber());
            case 3:
                return new IsoscelesTrapezoid(NumberProducer.getNumber(),
                        NumberProducer.getNumber(), NumberProducer.getNumber());
            case 4:
            default:
                return new Rectangle(NumberProducer.getNumber(), NumberProducer.getNumber());
        }
    }
}
