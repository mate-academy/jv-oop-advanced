package core.basesyntax;

public class Square extends Figure {
    private final double sideA;

    public Square(double sideA, String color) {
        super(color);
        this.sideA = sideA;
        this.setName("Square");
    }

    @Override
    public double getArea() {
        return sideA * sideA;
    }

    @Override
    public void draw() {
        System.out.println("Figure: " + getName() + ", area: "
                + String.format("%.2f",this.getArea()) + " sq.units, side: "
                + String.format("%.2f",sideA) + " units, color: " + getColor());
    }
}
