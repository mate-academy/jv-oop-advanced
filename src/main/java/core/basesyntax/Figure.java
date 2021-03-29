package core.basesyntax;

import core.basesyntax.model.behavior.Shape;
import core.basesyntax.model.state.ColorSupplier;

public abstract class Figure implements Shape {
    private String identification;
    private String color;

    public Figure () {
        generateColor();
    }

    protected void generateColor() {
        color = ColorSupplier.generateColor();
    }

    protected void setIdentification(String identification) {
        this.identification = identification;
    }

    public String getColor() {
        return color;
    }

    public String getIdentification() {
        return identification;
    }
}
