package core.basesyntax;

public class RightTriangle extends Figures {
    private double firstLeg;
    private double secondLeg;
    private String color;

    public RightTriangle(double firstLeg, double secondLeg, String color) {
        this.color = color;
        this.secondLeg = secondLeg;
        this.firstLeg = firstLeg;
    }

    @Override
    public String getColor() {
        return color;
    }

    @Override
    public double getArea() {
        return (secondLeg * firstLeg) / 2;
    }

    @Override
    public void getDraw() {
        System.out.println("Figure " + "right triangle "
                + "area: " + getArea()
                + " sq.units,  firstLeg: "
                + firstLeg + ",secondLeg: "
                + secondLeg + " units,"
                + " color: " + getColor().toLowerCase());
    }
}
