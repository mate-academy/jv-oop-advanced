package figure;

public class RightTriangle extends Figure {
    private final Double firstLeg;
    private final Double secondLeg;

    public RightTriangle(String color, Double firstLeg, Double secondLeg) {
        this.setType(FigureSupplier.getTypeName(2));
        this.setColor(color);
        this.firstLeg = firstLeg;
        this.secondLeg = secondLeg;
    }

    @Override
    public Double getArea() {
        return 0.5 * firstLeg * secondLeg;
    }

    @Override
    public void draw() {
        System.out.println("Figure : " + getType() + " color : " + getColor() + " area : "
                + getArea() + " sq.units" + " first leg : " + this.firstLeg
                + " units" + " second leg : " + this.secondLeg + " units");
    }

}
