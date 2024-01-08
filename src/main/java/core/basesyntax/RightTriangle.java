package core.basesyntax;

public class RightTriangle extends Figures {
    private int FirstLeg;
    private int SecondLeg;

    public RightTriangle(String color, int FirstLeg, int SecondLeg) {
        super(color);
        this.FirstLeg = FirstLeg;
        this.SecondLeg = SecondLeg;
    }

    @Override
    public double getArea() {
        return  (FirstLeg * SecondLeg) / 2;
    }

    @Override
    public void draw() {
        System.out.println("Figure: RightTriangle, area: " + getArea() + " sq. units, "
                + "firstLeg: " + FirstLeg + " units, "
                + "secondLeg: " + SecondLeg + " units, "
                + "color: " + getColor());
    }


}
