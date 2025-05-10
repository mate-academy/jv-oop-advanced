package core.basesyntax;

public class Rectangle extends Figure {
    private int length = 10;
    private int width = 5;

    public Rectangle() {
        this.setName("rectangle");
        this.setColor(ColorSupplier.generateColor());
    }

    @Override
    public double getArea() {
        return length * width;
    }

    @Override
    public void draw() {
        super.draw();
        System.out.println(": " + getName() + ", area: " + getArea()
                + " sq. units, length: " + length + " units, width: " + width + " units, color: "
                + getColor());
    }
}
