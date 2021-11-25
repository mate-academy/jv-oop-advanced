public class Trapezoid extends Figure {
    private double height;
    private double baseUp;
    private double baseDown;

    public Trapezoid(String name, String color, double height, double baseUp, double baseDown) {
        super(name, color);
        this.height = height;
        this.baseUp = baseUp;
        this.baseDown = baseDown;
    }

    @Override
    public void draw() {
        System.out.println(toString());
    }

    @Override
    public double getArea() {
        return (baseDown + baseUp) * height / 2;
    }

    @Override
    public String toString() {
        return "Trapezoid{"
                + "name='" + getName() + '\''
                + ", area=" + getArea()
                + ", color='" + getColor() + '\''
                + ", height=" + height
                + ", baseUp=" + baseUp
                + ", baseDown=" + baseDown
                + '}';
    }
}
