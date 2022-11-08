package core.basesyntax.Model;

import core.basesyntax.Behaviour.Calculator;
import core.basesyntax.Behaviour.PrintInfo;

public abstract class Figures implements Calculator, PrintInfo {
    private String color;

    protected Figures(String color) {

        this.color = color;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public double getMeasure() {
        return 0;
    }
}

