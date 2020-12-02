package core.basesyntax;

public class Square extends Figure {

    private double side;

    public void setSide(double side) {
        if (side <= 0) {
            side = 1;
        }
        this.side = side;
    }

    public double getSide() {
        return side;
    }

    @Override
    public void setArea() {
        this.area = side * side;
    }

    @Override
    public void getInfo() {
        System.out.println("Figure: square, area: " + area + " sq. units, side: "
                + getSide() + " units, color: " + getColor());
    }
}
