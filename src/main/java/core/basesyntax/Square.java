package core.basesyntax;

public class Square extends Figure {
    private double leg;

    private String color;

    public Square(String color, double leg) {
        this.leg = leg;
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double getLeg() {
        return leg;
    }

    public void setLeg(double leg) {
        this.leg = leg;
    }

    @Override
    public double getArea() {
        return Math.pow(getLeg(), 2);
    }

    @Override
    public void draw() {
        System.out.println("Figure: " + FigureName.Square.name() + ", area: "
                + Math.round(getArea() * 10.0) / 10.0 + " sq. units, leg: "
                + Math.round(getLeg() * 10.0) / 10.0 + " units, color: "
                + getColor() + ".");
    }
}
