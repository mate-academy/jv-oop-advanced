package figure;

public class RightTriangle extends Figure {
    private Double firstLeg;
    private Double secondLeg;

    public RightTriangle(String color, Double firstLeg, Double secondLeg) {
        setColor(color);
        this.firstLeg = firstLeg;
        this.secondLeg = secondLeg;
    }

    @Override
    public Double getArea() {
        return 0.5 * firstLeg * secondLeg;
    }

    @Override
    public void draw() {
        System.out.println("Figure : Right Triangle color : " + getColor()
                + " area : " + getArea() + " sq.units"
                + " first leg : " + this.firstLeg + " units"
                + " second leg : " + this.secondLeg + " units");
    }

}
