package core.basesyntax;

import java.util.Random;

public class FigureProducer {
    public static final int NUMBER_OF_FIGURES = 5;

    public Figure getFigure() {
        int randomNumberFigure = new Random().nextInt(NUMBER_OF_FIGURES);
        switch (randomNumberFigure) {
            case 0:
                return new IsoscelesTrapezoid(ColorProducer.getColor(), new Random().nextInt(50),
                        new Random().nextInt(50), new Random().nextInt(50));
            case 1:
                return new Square(ColorProducer.getColor(), new Random().nextInt(100));
            case 2:
                return new Rectangle(ColorProducer.getColor(), new Random().nextInt(25),
                        new Random().nextInt(20));
            case 3:
                return new Circle(ColorProducer.getColor(), new Random().nextInt(60));
            case 4:
            default:
                return new RightTriangle(ColorProducer.getColor(), new Random().nextInt(100));
        }
    }
}

