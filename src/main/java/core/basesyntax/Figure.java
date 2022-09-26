package core.basesyntax;

import core.basesyntax.interfaces.FigureInterface;
import java.util.Random;

public abstract class Figure implements FigureInterface {
    protected Random random = new Random();
    private String color;

    public void setRandomProperties() {
        this.color = new ColorSupplier().getRandomColor();
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getColor() {
        return color;
    }
}

