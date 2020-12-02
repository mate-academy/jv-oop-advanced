package core.basesyntax;

import java.util.Random;

public class FigureProducer {
    public static final int MAGIC_NUMBER = 5;

    public Figure insertRandomFigure() {
        Random random = new Random();

        switch (random.nextInt(MAGIC_NUMBER)) {
            case 0:
                return new Square(random.nextInt(6));
            case 1:
                return new Rectangle(random.nextInt(7), random.nextInt(3));
            case 2:
                return new Triangle(random.nextInt(5), random.nextInt(8));
            case 3:
                return new Circle(random.nextInt(4));
            case 4:
            default:
                return new Trapezoid(random.nextInt(8), random.nextInt(9),
                        random.nextInt(8));
        }
    }
}
