package core.basesyntax;

public class IsoscelesTrapezoid extends Figure {
    private int sideZ;

    public IsoscelesTrapezoid(int sideX, int sideY, int sideZ, String color) {
        super(sideX, sideY, color);
        this.sideZ = sideZ;
    }

    public double area() {
        return Math.round((Math.sqrt(Math.pow((sideX + sideY), 2)
                * (sideX - sideY + 2 * sideZ)
                * (sideY - sideX + 2 * sideZ)) / 4) * 10) / 10.0;
    }

    public String draw() {
        return "Figure: isosceles trapezoid, area: " + area()
                + " sq. units, first side: " + sideX
                + " units, second side: " + sideY
                + " units, third side: " + sideZ
                + " units, color: " + color;
    }
}
