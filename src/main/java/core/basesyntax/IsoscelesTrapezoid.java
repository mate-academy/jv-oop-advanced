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
        double area = height * side;
        return "Figure: rectangle, area: "
                + area
                + " sq. units, side: "
                + side
                + " units, height: "
                + height
                + " units, color: "
                + getColor();
    }
}
