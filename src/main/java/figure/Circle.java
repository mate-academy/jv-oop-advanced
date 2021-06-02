package figure;

public class Circle extends Figure {
    private final Double radius;

    public Circle(String color, Double radius) {
        this.setType(FigureSupplier.getTypeName(0));
        this.setColor(color);
        this.radius = radius;
    }

    @Override
    public Double getArea() {
        return Math.PI * radius * radius;
    }

    @Override
    public void draw() {
        System.out.println("Figure : " + getType()
                + " color : " + getColor() + " area : " + getArea() + " sq.units"
                + " radius : " + this.radius + " units");
    }
}
