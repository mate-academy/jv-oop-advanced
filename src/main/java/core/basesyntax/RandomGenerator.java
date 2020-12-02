package core.basesyntax;

import java.util.Random;

public class RandomGenerator {
    private static final int TOTALNUMBER = 5;
    private static final Random random = new Random();

    public static Figure getRandomFigure() {
        switch (random.nextInt(TOTALNUMBER)) {
            case 0:
                return new Circle(random.nextInt(50),
                        getColor());
            case 1:
                return new Trapezoid(random.nextInt(50),
                        random.nextInt(50),
                        random.nextInt(50),
                        getColor());
            case 2:
                return new Triangle(random.nextDouble(),
                        random.nextDouble(),
                        getColor());
            case 3:
                return new Rectangle(random.nextInt(50),
                        random.nextInt(50),
                        getColor());
            case 4:
                return new Square(random.nextInt(50),
                        getColor());
            default:
                return new Circle(0,Color.AMETHYST);
        }
    }

    public static int getRandomLength() {
        return new Random().nextInt(50);
    }

    public static Color getColor() {
        Color[] hues = Color.values();
        return hues[random.nextInt(hues.length)];
    }
}
