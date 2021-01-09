package core.basesyntax;

public class Circle extends Figure {
    private int radius = 5;

    public Circle() {
        this.setName("circle");
        this.setColor(ColorSupplier.generateColor());
    }

    @Override
    public double getArea() {
        return Math.PI * radius * radius;
    }

    @Override
    public void draw() {
        super.draw();
        System.out.println(": " + getName() + ", area: " + getArea()
                + " sq. units, radius: " + radius + " units, color: "
                + getColor());
    }
}
