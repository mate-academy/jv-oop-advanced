package core.basesyntax;

public class RightTriangle extends Figure {
    private double sideone;
    private double sidetwo;

    public RightTriangle(String color, double sideone, double sidetwo) {
        super.setColor(color);
        this.sideone = sideone;
        this.sidetwo = sidetwo;
    }

    public double getSideone() {
        return sideone;
    }

    public void setSideone(double sideone) {
        this.sideone = sideone;
    }

    public double getSidetwo() {
        return sidetwo;
    }

    public void setSidetwo(double sidetwo) {
        this.sidetwo = sidetwo;
    }

    @Override
    public double calculateArea() {
        return (sideone * sidetwo) / 2;
    }

    @Override
    public void draw() {
        System.out.println("Figure: RightTriangle, "
                + "area: "
                + calculateArea()
                + " sq.units, side: "
                + sideone
                + " units, side: "
                + sidetwo
                + " units, color: " + getColor());
    }
}
