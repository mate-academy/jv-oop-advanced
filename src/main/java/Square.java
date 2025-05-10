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
    public double getArea() {
        return side * side;
    }

    @Override
    public String toString() {
        return "Square{"
                + "name='" + getName() + '\''
                + ", area=" + getArea() + ", color='" + getColor() + '\''
                + ", side=" + side
                + '}';
    }
}
