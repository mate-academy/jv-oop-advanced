package figure;

public class IsoscelesTrapezoid extends Figure {
    private final Double firstBase;
    private final Double secondBase;
    private final Double height;

    public IsoscelesTrapezoid(String color, Double firstBase, Double secondBase, Double height) {
        this.setType(FigureSupplier.getTypeName(3));
        this.setColor(color);
        this.firstBase = firstBase;
        this.secondBase = secondBase;
        this.height = height;
    }

    @Override
    public Double getArea() {
        return 0.5 * (firstBase + secondBase) * height;
    }

    @Override
    public void draw() {
        System.out.println("Figure : " + getType() + " color : " + getColor()
                + " area : " + getArea()
                + " sq.units" + " first base : " + this.firstBase + " units"
                + " second base : " + this.secondBase + " units"
                + " height : " + this.height + " units");
    }
}
