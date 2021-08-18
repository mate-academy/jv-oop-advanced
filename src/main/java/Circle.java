public class Circle extends Figure implements FigureInterface {
    private double radius;

    public Circle(String name) {
        super(name);
        this.radius = Math.random();
        this.area = areaValue();
    }

    public void draw() {
        System.out.println(toString());
    }

    @Override
    public double areaValue() {
        return this.getRadius() * this.getRadius() * Math.PI;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    @Override
    public String toString() {
        return "Circle{"
                + "name='" + this.getName() + '\''
                + ", area=" + this.getArea() + '\''
                + ", radius=" + radius + '\''
                + ", color='" + this.getColor() + '\''
                + '}';
    }
}
