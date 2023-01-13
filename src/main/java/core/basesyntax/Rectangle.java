package core.basesyntax;

import java.awt.*;

public class Rectangle extends Figure implements Drawable {
    private double width;
    private double length;

    public Rectangle(Color color, double length, double width) {
        super(color);
        this.width = width;
        this.length = length;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    @Override
    public double getArea() {
        return this.width * this.length;
    }

    @Override
    public String draw() {
        return null;
    }
}
