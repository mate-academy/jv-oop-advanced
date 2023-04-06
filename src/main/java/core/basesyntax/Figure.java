package core.basesyntax;

import java.util.Random;

public abstract class Figure implements FigureArea, FigureData {
    protected String color;

    public Figure() {
        setColor(new Random());
        color = getColor();
    }

    public Figure(String color) {
        this.color = color;
    }

    public String color(Color color) {
        this.color = color.name();
        return this.color;
    }

    public void setColor(Random random) {
        this.color = Color.values()[random.nextInt(Color.values().length)].name();
    }

    public String getColor() {
        return color;
    }
}
