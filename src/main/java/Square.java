public class Square extends Figure {
    private int side;

    public Square(String color, int side) {
        super(color);
        this.side = side;
    }

    public int getSide() {
        return side;
    }

    @Override
    public void draw() {
        System.out.println("Figure : Square, area: " + String.format("%.2f", getArea())
                + ", side: " + getSide() + ", color: " + getColor());
    }

    @Override
    public double getArea() {
        return side * side;
    }
}
