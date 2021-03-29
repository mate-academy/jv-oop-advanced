package core.basesyntax;

import core.basesyntax.model.behavior.Areable;
import core.basesyntax.model.behavior.Drawable;
import core.basesyntax.model.state.ColorSupplier;

public abstract class Figure implements Areable, Drawable {
    private String identification;
    private String color;

    public Figure() {
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
