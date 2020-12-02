package core.basesyntax;

import java.util.Random;

public class FigureProducer {
    static final int MAGIC_NUMBER = 5;

    public Figure get() {
        int index = new Random().nextInt(MAGIC_NUMBER);
        ColorProducer colorProducer = new ColorProducer();

        switch (index) {
            case 0:
                return new Circle(colorProducer.get(), getMagicNumber());
            case 1:
                return new IsoscelesTrapezoid(colorProducer.get(), getMagicNumber(),
                        getMagicNumber(), getMagicNumber());
            case 2:
                return new Rectangle(colorProducer.get(), getMagicNumber(),
                        getMagicNumber());
            case 3:
                return new RightTriangle(colorProducer.get(), getMagicNumber());
            default:
                return new Square(colorProducer.get(), getMagicNumber());
        }
    }

    public int getMagicNumber() {
        return new Random().nextInt(10) + 1;
    }
}
