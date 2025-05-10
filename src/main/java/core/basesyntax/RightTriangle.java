package core.basesyntax;

public class RightTriangle extends Figure {
    private int firstLeg = 5;
    private int secondLeg = 8;

    public RightTriangle() {
        this.setName("right triangle");
        this.setColor(ColorSupplier.generateColor());
    }

    @Override
    public double getArea() {
        return firstLeg * secondLeg / 2.0;
    }

    @Override
    public void draw() {
        super.draw();
        System.out.println(": " + getName() + ", area: " + getArea()
                + " sq. units, firstLeg: " + firstLeg + " units, secondLeg: "
                + secondLeg + " units, color: " + getColor());
    }
}
