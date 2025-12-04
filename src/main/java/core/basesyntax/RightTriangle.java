package core.basesyntax;

public class RightTriangle extends AbstractFigure {
    private double firstLeg;
    private double secondLeg;

    public RightTriangle(String color, double firstLeg, double secondLeg) {
        super(color);
        this.firstLeg = firstLeg;
        this.secondLeg = secondLeg;
    }

    @Override
    public double getArea() {
        return firstLeg * secondLeg / 2;
    }

    @Override
    protected String getParametersString() {
        return "firstLeg: " + String.format("%.2f", firstLeg)
                + " units, secondLeg: " + String.format("%.2f", secondLeg) + " units";
    }

    @Override
    public void draw() {
        String name = this.getClass().getSimpleName().toLowerCase();
        String areaStr = String.format("%.2f", getArea()) + " sq. units";
        String params = getParametersString();
        System.out.println("Figure: " + name + ", area: "
                + areaStr + ", " + params + ", color: " + getColor());

    }
}

