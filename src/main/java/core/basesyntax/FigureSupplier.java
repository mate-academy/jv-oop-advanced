package core.basesyntax;

import java.util.Random;

public class FigureSupplier {

    private static final int maxNumber = 30;
    private final Random random = new Random();

    private final ColorSupplier colorSupplier = new ColorSupplier();

    public Figure getRandomFigure() {
        int randomNumber = random.nextInt(maxNumber);
        int nameOfFigureIndex = random.nextInt(NameOfFigure.values().length);
        return new Figure(NameOfFigure.values()[nameOfFigureIndex],
                colorSupplier.getRandomColor(), randomNumber);
    }

    public Figure getDefaultFigure() {
        return new Figure(NameOfFigure.Circle, Color.White, 10);
    }
}
