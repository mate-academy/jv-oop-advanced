package core.basesyntax.generator;

public abstract class Generator {
    private static final int NUMBER_OF_FIGURES = 5;
    private static final int NUMBER_OF_COLORS = 5;

    public static int getNumberOfColors() {
        return NUMBER_OF_COLORS;
    }

    public static int getNumberOfFigures() {
        return NUMBER_OF_FIGURES;
    }
}
