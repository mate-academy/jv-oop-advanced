package core.basesyntax.figures.suppliers;

import core.basesyntax.figures.Figure;

public class RoundCalculator {
    public double roundCalc(double number) {
        int nearestTenth = Figure.NEAREST_TENTH;
        return (double) Math.round(number * nearestTenth) / nearestTenth;
    }
}
