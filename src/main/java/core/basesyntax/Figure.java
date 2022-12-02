package core.basesyntax;

import java.util.Random;

public abstract class Figure {
    public String name;
    public String color;

    public Figure(String name, String color) {
        this.name = name;
        this.color = color;
    }

    public Figure() {
    }

    public String getName() {
        return name;
    }

    public String getColor() {
        String randomColor = new ColorSupplier().getRandomColor();
        return randomColor;
    }

    public void getDrawing() {
        System.out.println("Figure: " + getName() + " , "
                + "color: " + getColor() + ".");
    }
}
