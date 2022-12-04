package core.basesyntax;

import java.util.Random;

public abstract class Figure implements IAreaCalculator{
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

    public void getDefaultDrawing() {
        System.out.println("Figure: " + getName() + " , "
                + "area: " + String.format("%.2f", getArea()) + " sq.units, "
                + "radius: 10 units, "
                + "color: white.");
    }
}
