package core.basesyntax;

public class Square extends Figure {
    private double sideA;

    Square() {
        setName("Square");
        setColor(new ColorSupplier().getRandomColor());
        this.sideA = getRandom().nextInt(getMaxNumber());
    }

    Square(double sideA, Color color) {
        setName("Square");
        setColor(color);
        this.sideA = sideA;
    }

    @Override
    public double area() {
        return Math.pow(sideA, 2);
    }

    @Override
    public void draw() {
        System.out.println("Figure: " + getName() + ", area: " + area()
                + " sq.units, side: " + sideA + " units, color: " + getColor());
    }
}
