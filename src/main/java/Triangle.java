public class Triangle extends Figure {
    private double firstSide;
    private double secondSide;

    public Triangle(String name, String color, double firstSide, double secondSide) {
        super(name, color);
        this.firstSide = firstSide;
        this.secondSide = secondSide;
    }

    @Override
    public void draw() {
        System.out.println(toString());
    }

    @Override
    public double getArea() {
        return (firstSide * secondSide) / 2;
    }

    @Override
    public String toString() {
        return "Triangle{"
                + "name='" + getName() + '\''
                + ", area=" + getArea()
                + ", color='" + getColor() + '\''
                + ", firstSide=" + firstSide
                + ", secondSide=" + secondSide
                + '}';
    }
}
