package figure;

public class Square extends Figure {
    private final Double side;

    public Square(String color, Double side) {
        this.setType(FigureSupplier.getTypeName(4));
        this.setColor(color);
        this.setType("square");
        this.side = side;
    }

    @Override
    public Double getArea() {
        return side * side;
    }

    @Override
    public void draw() {
        System.out.println("Figure : " + getType()
                + " color : " + getColor()
                + " area : " + getArea() + " sq.units"
                + " side : " + this.side + " units");
    }
}
