package core.basesyntax;

public class Square extends Figure {
    private int length = 5;

    public Square() {
        this.setName("square");
        this.setColor(ColorSupplier.generateColor());
    }

    @Override
    public double getArea() {
        return length * length;
    }

    @Override
    public void draw() {
        super.draw();
        System.out.println(": " + getName() + ", area: " + getArea()
                + " sq. units, length: " + length + " units, color: "
                + getColor());
    }
}
