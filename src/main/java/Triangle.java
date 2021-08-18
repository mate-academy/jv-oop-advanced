public class Triangle extends Figure implements FigureInterface {
    private double firstSide;
    private double secondSide;

    public Triangle(String name) {
        super(name);
        this.firstSide = Math.random();
        this.secondSide = Math.random();
        areaValue();
    }

    @Override
    public void draw() {
        System.out.println(toString());
    }

    @Override
    public double areaValue() {
        return (this.firstSide * this.secondSide) / 2;
    }

    @Override
    public String toString() {
        return "Triangle{"
                + "name='" + this.getName() + '\''
                + ", area=" + this.getArea()
                + ", color='" + this.getColor() + '\''
                + ", firstSide=" + firstSide
                + ", secondSide=" + secondSide
                + '}';
    }
}
