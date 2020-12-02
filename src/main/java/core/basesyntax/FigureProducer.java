package core.basesyntax;

import java.util.Random;

public class FigureProducer {

    public static final int COUNT_OF_FIGURE = 5;

    public Figure get() {
        int randomFigure = new Random().nextInt(COUNT_OF_FIGURE);
        ColourProducer colourProducer = new ColourProducer();
        switch (randomFigure) {
            case 0:
                return new Square(colourProducer.get(), new Random().nextInt(20));
            case 1:
                return new Rectangle(colourProducer.get(), new Random().nextInt(20),
                        new Random().nextInt(20));
            case 2:
                return new RightTriangle(colourProducer.get(), new Random().nextInt(20),
                        new Random().nextInt(20));
            case 3:
                return new Circle(colourProducer.get(), new Random().nextInt(20));
            case 4:
            default:
                return new IsoscelesTrapezoid(colourProducer.get(), new Random().nextInt(20),
                        new Random().nextInt(20), new Random().nextInt(20));
        }
    }

}
