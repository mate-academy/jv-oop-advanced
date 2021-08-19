package core.basesyntax;

import java.util.Random;

public class Circle extends Figure {
    private int radius;

    public Circle() {
        super();
        this.radius = new Random().nextInt(10);
    }

    @Override
    public void draw() {
        System.out.println("circle, area: " + this.getArea()
                + " sq.units, radius: " + this.radius + " units, color: "
                + super.getColor());
    }

    @Override
    public double getArea() {
        return Math.PI * this.radius * this.radius;
    }
}
