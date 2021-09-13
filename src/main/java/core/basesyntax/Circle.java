package core.basesyntax;

import java.util.Random;

public class Circle extends Figure implements AreaCalculator, FigureDraw{
    private int radius;

    public Circle() {
        this.color = new ColorSupplier().getRandomColor();
        this.radius = new Random().nextInt(10) + 1;
    }

    @Override
    public double getArea() {
        return Math.PI * Math.pow(radius, 2);
    }

    @Override
    public void Draw() {
        System.out.println("Figure: circle, area: " + getArea() + " sq.units, radius: " + radius + " units, color: " + color);
    }
}
