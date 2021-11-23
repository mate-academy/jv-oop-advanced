package core.basesyntax;

public class IsoscelesTrapezoid extends Figures {
    private double firstLeg;
    private double secondLeg;
    private double height;
    private String color;

    public IsoscelesTrapezoid(double firstLeg, double secondLeg, String color, double height) {
        this.color = color;
        this.secondLeg = secondLeg;
        this.firstLeg = firstLeg;
        this.height = height;
    }

    @Override
    public String getColor() {
        return color;
    }

    @Override
    public double getArea() {
        return ((secondLeg * firstLeg) / 2) * height;
    }

    @Override
    public void getDraw() {
        System.out.println("Figure "
                + "isosceles trapezoid "
                + "area: " + getArea()
                + " sq.units,  firstLeg: "
                + firstLeg + ",secondLeg: "
                + secondLeg + " height: "
                + height + " units,"
                + " color: " + getColor().toLowerCase());
    }
}
