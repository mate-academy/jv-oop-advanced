package figure;

public class Rectangle extends Figure {
    private final Double firstSide;
    private final Double secondSide;

    public Rectangle(String color, Double firstSide, Double secondSide) {
        this.setType(FigureSupplier.getTypeName(1));
        this.setColor(color);
        this.firstSide = firstSide;
        this.secondSide = secondSide;
    }

    @Override
    public Double getArea() {
        return firstSide * secondSide;
    }

    @Override
    public void draw() {
        System.out.println("Figure : " + getType() + " color : " + getColor()
                + " area : " + getArea() + " sq.units"
                + " first side : " + this.firstSide + " units"
                + " second side : " + this.secondSide + " units");
    }
}
