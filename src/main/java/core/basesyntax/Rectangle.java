package core.basesyntax;

public class Rectangle extends Figure {
    private double wigth;
    private double height;

    public Rectangle(double wigth, double height, Color color) {
        super(Color.valueOf(color.toString()));
        this.wigth = wigth;
        this.height = height;
    }

    @Override
    public double getArea() {
        return wigth * height;
    }

    @Override
    public String draw() {
        return "Figure: rectangle, "
                + "area: " + getArea() + " sq.units, "
                + "width: " + wigth + " units, "
                + "height: " + height + " units, "
                + "color: " + getColor();
    }

}
