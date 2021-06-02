package figure;

public class Circle extends Figure {
    private Double radius;

    public Circle(String color, Double radius) {
        this.setType(FigureSupplier.getTypeName(0));
        this.setColor(color);
        this.radius = radius;
    }

    public Double getRadius(Double radius) {
        return radius;
    }

    public void setRadius(Double radius) {
        this.radius = radius;
    }

    @Override
    public Double getArea() {
        return Math.PI * radius * radius;
    }

    @Override
    public void draw() {
        System.out.println(new StringBuilder().append("Figure : ").append(getType())
                .append(" color : ").append(getColor())
                .append(" area : ").append(getArea()).append(" sq.units")
                .append(" radius : ").append(this.radius).append(" units"));
    }
}
