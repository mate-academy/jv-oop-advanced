package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    private static final Random random = new Random();

    public static Figure getRandomFigure() {
        System.out.println(
                FigureType.values()[random.nextInt(FigureType.values().length)]);

        return null;
    }

    public static Figure getDefaultFigure() {
        return new Circle(Color.WHITE, 10);
    }
}
