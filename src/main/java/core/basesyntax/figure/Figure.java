package core.basesyntax.figure;

import core.basesyntax.AreaCalculable;
import core.basesyntax.Printable;

public abstract class Figure implements AreaCalculable, Printable {

    private String color;

    public Figure(String color) {
        this.color = color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    @Override
    public void print() {
    }
}
