package core.basesyntax.figures;

import core.basesyntax.figures.interfaces.AreaCalculator;
import core.basesyntax.figures.suppliers.RoundCalculator;

public abstract class Figure implements AreaCalculator {
    public static final int NEAREST_TENTH = 10;
    private RoundCalculator roundCalculator = new RoundCalculator();
    private String color;

    public double getRound(double area) {
        return roundCalculator.roundCalc(area);
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    public abstract void draw();
}
