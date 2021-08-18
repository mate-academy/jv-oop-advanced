public class Trapezoid extends Figure implements FigureInterface {
    private double height;
    private double baseUp;
    private double baseDown;

    public Trapezoid(String name) {
        super(name);
        this.height = Math.random();
        this.baseUp = Math.random();
        this.baseDown = Math.random();
        this.area = areaValue();
    }

    @Override
    public void draw() {
        System.out.println(toString());
    }

    @Override
    public double areaValue() {
        return (baseDown + baseUp) * height / 2;
    }

    @Override
    public String toString() {
        return "Trapezoid{"
                + "name='" + this.getName() + '\''
                + ", area=" + this.getArea()
                + ", color='" + this.getColor() + '\''
                + ", height=" + height
                + ", baseUp=" + baseUp
                + ", baseDown=" + baseDown
                + '}';
    }
}
