package figure;

public class Square extends Figure {
    private Double side;

    public Square(String color, Double side) {
        setColor(color);
        this.side = side;
    }

    @Override
    public Double getArea() {
        return side * side;
    }

    @Override
    public void draw() {
        System.out.println("Figure : Square color : " + getColor()
                + " area : " + getArea() + " sq.units"
                + " side : " + this.side + " units");
    }
}
