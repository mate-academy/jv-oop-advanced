package core.basesyntax;

public class RightTriangle extends Figures {
    private int Firstleg;
    private int Secondleg;

    public RightTriangle(String color, int FirstLeg, int SecondLeg) {
        super(color);
        this.Firstleg = FirstLeg;
        this.Secondleg = SecondLeg;
    }

    @Override
    public double getArea() {
        return (Firstleg * Secondleg) / 2;
    }

    @Override
    public void draw() {
        System.out.println("Figure: RightTriangle, area: " + getArea() + " sq. units, "
                + "firstLeg: " + Firstleg + " units, "
                + "secondLeg: " + Secondleg + " units, "
                + "color: " + getColor());
    }
}
