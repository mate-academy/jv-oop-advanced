package core.basesyntax;

public class Square extends Figure {
    private double sideA;

    public double getSide_a() {
        return sideA;
    }

    public void setSide_a(double sideA) {
        this.sideA = sideA;
    }

    @Override
    public String toDraw() {
        return "Figure: " + getFigureType() + ", area: " + getArea() + " sq.units, side: "
                + getSide_a() + " units, color: " + getColor();
    }

    @Override
    public double getArea() {
        return sideA * sideA;
    }
}
