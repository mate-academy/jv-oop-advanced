package core.basesyntax;

import java.util.stream.DoubleStream;

public final class FigureDimensionsValidator {
    public static final double MINIMUM_DIMENSION = 0.1;
    public static final double MAXIMUM_DIMENSION = 1000.0;

    private FigureDimensionsValidator() {
        // Pure utility class, do NOT instantiate.
    }

    public static boolean isValidDimensions(double...dimensions) {
        return DoubleStream.of(dimensions)
                .noneMatch(x -> x < MINIMUM_DIMENSION || x > MAXIMUM_DIMENSION);
    }
}
