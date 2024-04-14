package core.basesyntax;

import java.util.Random;

public class Circle extends Figure {
    private double rad;
    private double area;
    private String color = new ColorSupplier().getRandomColor();

    public void setFigure() {
        this.rad = new Random().nextInt(11);
    }

    public void defCircle(int r) {
        this.rad = r;
    }

    public void setColor(Colors color) {
        this.color = color.toString();
    }

    @Override
    public double area() {
        this.area = Math.PI * this.rad * this.rad;
        return area;
    }

    @Override
    public void draw() {
        System.out.println("Figure: Circle, area: " + area()
                + " sq. units, " + "radius: " + rad + " units, color: " + color);
    }
}
