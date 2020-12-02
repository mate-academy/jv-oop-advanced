package core.basesyntax;

import java.util.Random;

public class FigureProducer {
    public Figure get() {
        int index = new Random().nextInt(5);
        ColorProducer colorProducer = new ColorProducer();

        switch (index) {
            case 0:
                return new Circle(colorProducer.get(), new Random().nextInt(10) + 1);
            case 1:
                return new IsoscelesTrapezoid(colorProducer.get(), new Random().nextInt(10) + 1,
                        new Random().nextInt(10) + 1, new Random().nextInt(10) + 1);
            case 2:
                return new Rectangle(colorProducer.get(), new Random().nextInt(10) + 1,
                        new Random().nextInt(10) + 1);
            case 3:
                return new RightTriangle(colorProducer.get(), new Random().nextInt(10) + 1);
            default:
                return new Square(colorProducer.get(), new Random().nextInt(10) + 1);
        }
    }
}
