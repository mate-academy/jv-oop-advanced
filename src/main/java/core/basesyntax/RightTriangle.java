package core.basesyntax;

public class RightTriangle extends Figures {
    private final int firstLeg;
    private final int secondLeg;
    private final int hypotenuse;

    public RightTriangle(String color, int firstLeg, int secondLeg, int hypotenuse) {
        super(color);
        this.firstLeg = firstLeg;
        this.secondLeg = secondLeg;
        this.hypotenuse = hypotenuse;
    }

    @Override
    public double getArea() {
        return 0.5 * firstLeg * secondLeg;
    }

    @Override
    public void getDraw() {
        String name = "rightTriangle";
        System.out.println("Figure: " + name + ","
                + " area:" + getArea() + " sq. units, side length: "
                + firstLeg + " units, " + secondLeg + " units, "
                + hypotenuse + " units, color: " + getColor());

    }

    @Override
    public String toString() {
        return "RightTriangle{"
                + "firstLeg" + firstLeg
                + ", secondLeg=" + secondLeg
                + ", hypotenuse=" + hypotenuse
                + ", color='" + getColor() + '\''
                + '}';
    }
}
