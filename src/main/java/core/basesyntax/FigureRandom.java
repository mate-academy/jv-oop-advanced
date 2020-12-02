package core.basesyntax;

import java.util.Random;

public class FigureRandom {
    public static final int NUMBER = 5;

    public Figure get() {
        int randomFigure = new Random().nextInt(NUMBER);
        RandomColour randomColour = new RandomColour();
        switch (randomFigure) {
            case 0:
                return new Square((int) (Math.random() * 10), randomColour.get());
            case 1:
                return new Rectangle((int) (Math.random() * 10), (int) (Math.random() * 10),
                        randomColour.get());
            case 2:
                return new RightTriangle((int) (Math.random() * 10), (int) (Math.random() * 10),
                        randomColour.get());
            case 3:
                return new Circle((int) (Math.random() * 10), randomColour.get());
            case 4:
            default:
                return new IsoscelesTrapezoid((int) (Math.random() * 10),
                        (int) (Math.random() * 10), (int) (Math.random() * 10), randomColour.get());
        }
    }
}
