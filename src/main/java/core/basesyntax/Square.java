package core.basesyntax;

public class Square extends Figure implements DrawIt, AreaCalculator {
    private double sideA;

    public String getFig() {
        return "square";
    }

    public double getSide_a() {
        return sideA;
    }

    public void setSide_a(double sideA) {
        this.sideA = sideA;
    }

    @Override
    public String toDraw() {
        return "Figure: " + getFig() + ", area: " + getArea() + " sq.units, side: " + getSide_a()
                + " units, color: " + getColor();
    }

    @Override
    public double getArea() {
        return sideA * sideA;
    }
}
