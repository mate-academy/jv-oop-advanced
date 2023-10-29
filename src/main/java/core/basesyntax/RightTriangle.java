package core.basesyntax;

import java.text.DecimalFormat;

public class RightTriangle extends Figure {
    private static final DecimalFormat decimalFormat = new DecimalFormat("#.##");
    private static final double HALF_DIVIDE = 0.5;
    private int firstLeg;
    private int secondLeg;

    public RightTriangle(String color, int firstLeg, int secondLeg) {
        super(color);
        this.firstLeg = firstLeg;
        this.secondLeg = secondLeg;
    }

    @Override
    public double getArea() {
        return HALF_DIVIDE * firstLeg * secondLeg;
    }

    @Override
    public void draw() {
        String formattedArea = decimalFormat.format(getArea());
        System.out.println("Figure: " + this.getClass().getSimpleName() + ", Area: "
                + formattedArea + " sq.units, firstLeg:"
                + firstLeg + " Units, secondLeg: "
                + secondLeg + " Units, Color: " + super.getColor());
    }
}
