package core.basesyntax;

public class IsoscelesTrapezoid extends Figure {
    private int side;
    private int height;

    public void setSide(int side) {
        this.side = side;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    @Override
    public String info() {
        return "Figure: isoscelesTrapezoid, area: "
                + getArea()
                + " sq. units, side: "
                + side
                + " units, height: "
                + height
                + " units, color: "
                + getColor();
    }

    @Override
    public double getArea() {
        return height * side;
    }
}
