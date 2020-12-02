package core.basesyntax;

import java.util.Random;

public class FigureProducer {
    public final int figure = 5;

    public Figure getFigure() {
        int randomNumberFigure = new Random().nextInt(figure);
        // I don't know, maybe I must write a method for random size selection
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

