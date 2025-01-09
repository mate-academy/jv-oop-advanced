package core.basesyntax;

import java.util.Random;

abstract class Figure implements DrawFigures, InitializingProperties {

    private String color;
    private String name;

    private final Random random = new Random();
    private final int randomSize = random.nextInt(10);

    public int getRandomSize() {
        return randomSize;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
