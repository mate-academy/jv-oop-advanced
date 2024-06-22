package core.basesyntax;

public class Rectangle extends Figure {
    public static final String SHAPE_NAME = "rectangle";
    private double firstLeg;
    private double secondLeg;

    public Rectangle(String color, double firstLeg, double secondLeg) {
        super(color);
        this.firstLeg = firstLeg;
        this.secondLeg = secondLeg;
    }

    @Override
    public double getArea() {
        return this.firstLeg * this.secondLeg;
    }

    @Override
    public void draw() {
        System.out.println("Figure: " + SHAPE_NAME + ", area: "
                + getArea() + " sq. units, firstLeg : " + this.firstLeg + " units, "
                + " secondLeg: " + this.secondLeg + " units, color: " + getColor());
    }
}
