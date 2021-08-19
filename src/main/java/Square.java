public class Square extends Figure {
    private double side;

    public Square(String name, String color, double side) {
        super(name, color);
        this.side = side;
    }

    @Override
    public void draw() {
        System.out.println(toString());
    }

    @Override
    public double areaValue() {
        return side * side;
    }

    @Override
    public String toString() {
        return "Square{"
                + "name='" + getName() + '\''
                + ", area=" + areaValue() + ", color='" + getColor() + '\''
                + ", side=" + side
                + '}';
    }
}
