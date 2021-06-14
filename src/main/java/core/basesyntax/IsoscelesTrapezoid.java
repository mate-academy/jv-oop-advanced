package core.basesyntax;

public class IsoscelesTrapezoid extends Figure implements AreaCalculator {
    private int side;
    private int top;
    private int basement;

    public IsoscelesTrapezoid (String color, int top, int side, int basement) {
        this.setName("isosceles trapezoid");
        this.setColor(color);
        this.side = side;
        this.top = top;
        this.basement = basement;
    }

    public double getArea() {
        return (double) (top + basement) / 2 * Math.sqrt(side * side - (basement - top) * (double) (basement - top) / 4);
    }

    public void draw() {
        System.out.println("Figure: " + getName() +", area: " + getArea() + " sq. units, top: " + top +
                " units, basement: " + basement + " units, side: " + side + " units, color: " + getColor());
    }
}
