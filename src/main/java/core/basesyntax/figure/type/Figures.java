package core.basesyntax.figure.type;

import core.basesyntax.behaviour.Calculator;
import core.basesyntax.behaviour.PrintInfo;

public abstract class Figure implements Calculator, PrintInfo {
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

}
