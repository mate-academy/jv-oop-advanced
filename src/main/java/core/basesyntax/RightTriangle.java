package core.basesyntax;

public class RightTriangle extends Figure {
    private static final String FIGURE_NAME = "right triangle";
    private int firstLeg;
    private int secondLeg;

    public RightTriangle(String color, int firstLeg, int secondLeg) {
        super(color);
        this.firstLeg = firstLeg;
        this.secondLeg = secondLeg;
    }

    @Override
    public double getArea() {
        double area = (firstLeg * secondLeg) / 2.0;
        return area;
    }

    @Override
    public void draw() {
        System.out.println("Figure: " + FIGURE_NAME + ", area: "
                + getArea() + " sq. units, first leg: " + firstLeg
                + " units, second leg: " + secondLeg + " units, color: " + getColor());
    }
}
