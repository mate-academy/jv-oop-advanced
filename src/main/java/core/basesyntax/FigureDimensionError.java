package core.basesyntax;

public class FigureDimensionError extends RuntimeException {
    private static final String message = "'s dimensions should be more than "
            + FigureDimensionsValidator.MINIMUM_DIMENSION + " units"
            + " or less than " + FigureDimensionsValidator.MAXIMUM_DIMENSION
            + " units";

    public FigureDimensionError(String clazz) {
        super(clazz + message);
    }
}
