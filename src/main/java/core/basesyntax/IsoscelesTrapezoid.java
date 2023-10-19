package core.basesyntax;

public class IsoscelesTrapezoid extends Figure {
    private double edge;
    private double sideA;
    private double sideB;

    public IsoscelesTrapezoid() {

    }

    public IsoscelesTrapezoid(double edge, double sideA, double sideB) {
        this.edge = edge;
        this.sideA = sideA;
        this.sideB = sideB;
    }

    public double getEdge() {
        return edge;
    }

    public void setEdge(double edge) {
        this.edge = edge;
    }

    public double getSideA() {
        return sideA;
    }

    public void setSideA(double sideA) {
        this.sideA = sideA;
    }

    public double getSideB() {
        return sideB;
    }

    public void setSideB(double sideB) {
        this.sideB = sideB;
    }

    public void setSides(double sideA, double sideB, double edge) {
        this.sideA = sideA;
        this.sideB = sideB;
        this.edge = edge;
    }

    @Override
    public double getArea() {
        double per = (sideA + sideB + 2 * edge) / 2;
        return Math.sqrt((per - sideA) * (per - sideB) * (per - edge) * (per - edge));
    }

    @Override
    public void draw() {
        String info = "Figure: isosceles trapezoid";
        info += ", area: " + getArea();
        info += " sq.units, sideA: " + sideA;
        info += " units, sideB: " + sideB;
        info += " units, edge: " + edge;
        info += " units, color: " + getColor().name();
        System.out.println(info);
    }
}
