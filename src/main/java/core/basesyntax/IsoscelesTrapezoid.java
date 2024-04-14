package core.basesyntax;

import java.util.Random;

public class IsoscelesTrapezoid extends Figure {
    private int heigh;
    private int lowSide;
    private int hightSide;
    private double area;
    private String color = new ColorSupplier().getRandomColor();

    public void setFigure() {
        this.heigh = new Random().nextInt(11);
        this.lowSide = new Random().nextInt(11);
        this.hightSide = new Random().nextInt(11);
    }

    @Override
    public double area() {
        this.area = this.heigh / 2 * (this.lowSide + this.hightSide);
        return area;
    }

    @Override
    public void draw() {
        System.out.println("Figure: Isosceles Trapezoid, area: " + area()
                + " sq. units, " + "height: " + heigh
                + " low Side: " + lowSide + " units, hight Side: "
                + hightSide + " units, color: " + color);
    }
}
