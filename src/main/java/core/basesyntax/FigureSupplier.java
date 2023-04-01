package core.basesyntax;

public class FigureSupplier {
    private static final double RADIUS_CONSTANT = 10;

    public Figure getDefaultFigure() {
        return new Сircle(PossibleColors.WHITE.name(), RADIUS_CONSTANT);
    }
}
