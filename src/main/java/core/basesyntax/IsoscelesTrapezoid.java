package core.basesyntax;

public class IsoscelesTrapezoid extends Figure {
    private double firstLeg;
    private double secondLeg;
    private double height;

    public IsoscelesTrapezoid(String color, double firstLeg, double secondLeg, double height) {
        super(color);
        this.firstLeg = firstLeg;
        this.secondLeg = secondLeg;
        this.height = height;
    }

    @Override
    public double getArea() {
        return ((firstLeg + secondLeg) / 2) * height;
    }

    @Override
    public void draw() {
        System.out.println("Figure " + this.getClass().getSimpleName() + "\n"
                + "Color " + color + "\n"
                + "Area " + getArea() + "\n"
                + "First Leg " + firstLeg
                + "Second Leg " + secondLeg
                + "Height " + height);
    }
}
