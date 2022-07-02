package core.basesyntax;

import java.util.Random;

public abstract class Figure implements Draw, Area {
    private static final int MAX_NUMBER = 100;
    private final Random random = new Random();
    private String name;
    private Color color;

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public Random getRandom() {
        return random;
    }

    public int getMaxNumber() {
        return MAX_NUMBER;
    }
}
