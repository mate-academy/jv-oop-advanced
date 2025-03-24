package core.basesyntax;

import java.util.Random;

public abstract class Figures implements AreaCalculable, Drawable {
    private Random random = new Random();

    private String color;

    public Figures(String color) {
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    public String getRandomColor() {
        Colors[] colors = Colors.values();
        int index = new Random().nextInt(colors.length);
        return colors[index].name().toLowerCase();
    }

    public String getWhiteColor() {
        return Colors.WHITE.toString().toLowerCase();
    }

}
