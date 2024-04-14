package core.basesyntax;

import java.util.Random;

public class Square extends Figure {
    private int side;
    private int area;
    private String color = new ColorSupplier().getRandomColor();

    public void setFigure() {
        this.side = new Random().nextInt(11);
    }

    @Override
    public double area() {
        this.area = this.side * this.side;
        return area;
    }

    @Override
    public void draw() {
        System.out.println("Figure: Square, area: " + area()
                + " sq. units, " + "side: " + side + " units, color: " + color);
    }
}
