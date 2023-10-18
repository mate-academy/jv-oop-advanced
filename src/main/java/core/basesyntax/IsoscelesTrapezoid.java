package core.basesyntax;

public class IsoscelesTrapezoid extends Figure {
    private double edge = 0;
    private double sideA = 0;
    private double sideB = 0;

    IsoscelesTrapezoid() {
        super("isosceles trapezoid", Color.WHITE);
    }

    IsoscelesTrapezoid(Color color) {
        super("isosceles trapezoid", color);
    }

    public double getEdge() {
        return edge;
    }

    public void setEdge(double edge) {
        if (edge > 0) {
            this.edge = edge;
        } else {
            System.out.println("Trapezoid edge can't be negative or equal to zero!");
        }
    }

    public double getSideA() {
        return sideA;
    }

    public void setSideA(double sideA) {
        if (sideA > 0) {
            this.sideA = sideA;
        } else {
            System.out.println("Trapezoid side can't be negative or equal to zero!");
        }
    }

    public double getSideB() {
        return sideB;
    }

    public void setSideB(double sideB) {
        if (sideB > 0) {
            this.sideB = sideB;
        } else {
            System.out.println("Trapezoid side can't be negative or equal to zero!");
        }
    }

    public void setSides(double sideA, double sideB, double edge) {
        if (sideA > 0 && sideB > 0 && edge > 0) {
            this.sideA = sideA;
            this.sideB = sideB;
            this.edge = edge;
        } else {
            System.out.println("Trapezoid sides can't be negative or equal to zero!");
        }
    }

    @Override
    public double area() {
        double per = (sideA + sideB + 2 * edge) / 2;
        return Math.sqrt((per - sideA) * (per - sideB) * (per - edge) * (per - edge));
    }

    @Override
    public void draw() {
        String info = "Figure: " + getName();
        info += ", area: " + area();
        info += " sq.units, sideA: " + sideA;
        info += " units, sideB: " + sideB;
        info += " units, edge: " + edge;
        info += " units, color: " + getColor().name();
        System.out.println(info);
    }
}
