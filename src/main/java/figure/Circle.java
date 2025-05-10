package figure;

public class Circle extends Figure {
    private Double radius;

    public Circle(String color, Double radius) {
        setColor(color);
        this.radius = radius;
    }

    @Override
    public Double getArea() {
        return Math.PI * radius * radius;
    }

    @Override
    public void draw() {
        System.out.println("Figure : Circle color : " + getColor()
                + " area : " + getArea() + " sq.units"
                + " radius : " + this.radius + " units");
    }
}
