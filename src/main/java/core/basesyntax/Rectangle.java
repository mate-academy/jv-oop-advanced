package core.basesyntax;

import java.util.Random;

public class Rectangle extends Figure {
    private int sidea;
    private int sideb;
    private int area;
    private String color = new ColorSupplier().getRandomColor();

    public void setFigure() {
        this.sidea = new Random().nextInt(11);
        this.sideb = new Random().nextInt(11);
    }

    @Override
    public double area() {
        this.area = this.sidea * this.sideb;
        return area;
    }

    @Override
    public void draw() {
        System.out.println("Figure: Rectangle, area: " + area()
                + " sq. units, " + "side a: " + sidea
                + " side b: " + sideb + " units, color: " + color);
    }
}
