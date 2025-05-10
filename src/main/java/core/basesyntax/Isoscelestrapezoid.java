package core.basesyntax;

public class Isoscelestrapezoid extends Figure {
    private double upperside;
    private double lowerside;
    private double side;

    public double getUpper_side() {
        return upperside;
    }

    public void setUpper_side(double upperside) {
        this.upperside = upperside;
    }

    public double getLower_side() {
        return lowerside;
    }

    public void setLower_side(double lowerside) {
        this.lowerside = lowerside;
    }

    public double getSide() {
        return side;
    }

    public void setSide(double side) {
        this.side = side;
    }

    @Override
    public double getArea() {
        return Math.floor((lowerside + upperside) / 2 * Math.sqrt(Math.pow(side, 2)
                - Math.pow(((Math.pow((lowerside - upperside), 2))
                / (2 * (lowerside - upperside))), 2)));
    }

    @Override
    public String toDraw() {
        return "Figure: " + getFigureType() + ", area: " + getArea() + " sq.units, upper side: "
                + getUpper_side() + " units, lower side: " + getLower_side()
                + " units, side: " + getSide() + " units, color: " + getColor();
    }
}
