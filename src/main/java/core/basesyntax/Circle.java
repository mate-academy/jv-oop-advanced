package core.basesyntax;

public class Circle extends Figure {
    private double rad;
    private Colors color;

    public Circle() {
        this.rad = getRandom().nextInt(1,11);
        this.color = getColorSupplier().getRandomColor();
    }

    public void setColor(Colors color) {
        this.color = color;
    }

    @Override
    public double getArea() {
        return Math.PI * this.rad * this.rad;
    }

    @Override
    public void draw() {
        System.out.println("Figure: Circle, area: " + getArea()
                + " sq. units, " + "radius: " + rad + " units, color: " + color);
    }
}
