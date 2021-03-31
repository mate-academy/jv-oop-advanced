public class Square extends Figure {
    private double side;

    public Square(String color, double side) {
        super(color);
        this.side = side;
    }

    public double getSide() {
        return side;
    }

    public void setSide(double side) {
        this.side = side;
    }

    @Override
    public void draw() {
        System.out.println("Figure : Square, area: " + getArea() + ", side: "
                + Math.round(getSide()) + ", color: " + getColor());
    }

    @Override
    public double getArea() {
        return Math.round((side * side * 100) / 100.0);
    }
}
