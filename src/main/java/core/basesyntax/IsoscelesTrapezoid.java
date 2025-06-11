package core.basesyntax;

public class IsoscelesTrapezoid extends Figure {
    private double firstLeg;
    private double secondLeg;
    private double heigh;

    public IsoscelesTrapezoid(String color, double firstLeg, double secondLeg, double heigh){
        super(color);
        this.firstLeg = firstLeg;
        this.secondLeg = secondLeg;
        this.heigh = heigh;
    }
    @Override
    public double getArea() {
        return ((firstLeg + secondLeg) * heigh) / 2.0;
    }

    @Override
    public void draw() {
        System.out.println("Figure: Rectangle, color: " + getColor() + " , first leg: "
                + firstLeg + "second led: " + secondLeg + " ,heigh" + heigh
                + " , area: " + getArea());
    }
}
