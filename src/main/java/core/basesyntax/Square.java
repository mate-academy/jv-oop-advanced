package core.basesyntax;

public class Square extends Figure {
    private double area;
    private double side;
    private Color color;

    public Square(double side, Color color) {
        this.side = side;
        this.color = color;

        area = side * side;

        super.setColor(color);

    }

    public void setArea() {

    }

    @Override
    public double getArea(double area) {
        return area;
    }

    @Override
    public void draw() {
        System.out.println(" Square : Area : " + getArea(area) + " sq.units ,"
                             + " Side : " + getSide() + " units, "
                             + "Color = " + super.getColor());
    }

    public double getSide() {
        return side;
    }
}
