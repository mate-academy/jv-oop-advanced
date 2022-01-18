public class Square extends Figure {
    private double side;
    private double area = getArea();

    public void setSide(double side) {
        this.side = side;
    }

    public double getSide() {
        return side;
    }

    @Override
    public double getArea() {
        return side * side;
    }

    @Override
    public void draw() {
        System.out.println("Figure: square, area: " + getArea()
                 + " sg.units, color" + "side: " + getSide()
                 + " units " + getColor());
    }
}
