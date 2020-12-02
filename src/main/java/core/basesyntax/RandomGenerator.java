package core.basesyntax;

import java.util.Random;

public class RandomGenerator {
    private static final int TOTAL_NUMBER = 5;
    private static final Random random = new Random();

    public static Figure getRandomFigure() {
        switch (random.nextInt(TOTAL_NUMBER)) {
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

    private static Color getColor() {
        return Color.values()[random.nextInt(Color.values().length)];
    }
}
