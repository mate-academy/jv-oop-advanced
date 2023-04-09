package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    private static final Random RANDOM = new Random();

    public static Enum_Figures getRandomColor() {
        Enum_Figures[] figures = Enum_Figures.values();
        int index = RANDOM.nextInt(figures.length);
        return figures[index];
    }
}