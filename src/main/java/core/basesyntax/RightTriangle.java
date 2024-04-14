package core.basesyntax;

import java.util.Random;

public class RightTriangle extends Figure {
    private int kat;
    private int kat1;
    private int area;
    private String color = new ColorSupplier().getRandomColor();

    public void setFigure() {
        this.kat = new Random().nextInt(11);
        this.kat1 = new Random().nextInt(11);
    }

    @Override
    public double area() {
        this.area = this.kat * kat1 / 2;
        return area;
    }

    @Override
    public void draw() {
        System.out.println("Figure: Right Triangle, area: " + area()
                + " sq. units, " + " side a: " + kat
                + " side b: " + kat1 + " units, color: " + color);
    }
}
