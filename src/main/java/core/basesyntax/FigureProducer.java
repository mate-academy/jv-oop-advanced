package core.basesyntax;

import java.util.Random;

public class FigureProducer {
    private static final int COUNT_OF_FIGURES_IMPLEMENTATION = 5;
    private ColorProducer colorProducer = new ColorProducer();

    public Figures get() {
        int randomGeneratedNumber = new Random().nextInt(COUNT_OF_FIGURES_IMPLEMENTATION);
        switch (randomGeneratedNumber) {
            case 0:
                return new Circle(colorProducer.getColor(), getRandomNumber());
            case 1:
                return new Square(colorProducer.getColor(), getRandomNumber());
            case 2:
                return new Rectangle(colorProducer.getColor(), getRandomNumber(),
                        getRandomNumber());
            case 3:
                return new RightTriangle(colorProducer.getColor(), getRandomNumber(),
                        getRandomNumber());
            case 4:
            default:
                return new IsoscelesTrapezoid(colorProducer.getColor(),
                        getRandomNumber(), getRandomNumber(), getRandomNumber());
        }
    }

    private int getRandomNumber() {
        return new Random().nextInt(50);
    }
}
