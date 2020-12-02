package core.basesyntax;

import java.util.Random;

public abstract class Figure implements HasArea {
    private String name;
    private double area;
    private Color color;

    public void setColor() {
        int numberOfColor = new Random().nextInt(Color.values().length);
        this.color = Color.values()[numberOfColor];
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setArea(int area) {
        this.area = area;
    }

    public abstract String uniqueFunction();

    public void print() {
        System.out.println("Figure = " + this.name + "| area = " + this.area
                + "| unique function = " + uniqueFunction() + "| color = " + this.color);
    }
}
