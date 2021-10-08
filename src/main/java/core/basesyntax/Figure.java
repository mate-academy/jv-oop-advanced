package core.basesyntax;

import java.awt.*;

public abstract class Figure {
    private String type;
    private final String color;
    public Figure() {
        this.type = "Figure";
        this.color = ColorSupplier.getRandomColor();
    }
    public void setType(String type) {
        this.type = type;
    }
    public String getType() {
        return type;
    }
    public String getColor() {
        return color;
    }
    public abstract double getArea();
    public abstract void draw();

}
