package core.basesyntax.state;

import core.basesyntax.behavior.FigureProperties;

public abstract class Figure implements FigureProperties {
    protected String name;
    protected String color = "Black";

    public Figure() {

    }

    public void setColor(String color) {
        this.color = color;
    }

}
