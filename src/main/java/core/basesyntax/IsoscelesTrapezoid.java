package core.basesyntax;

public class IsoscelesTrapezoid extends Figure {
    private double side;
    private double side2;
    private double side3;

    public IsoscelesTrapezoid(String color, int side, int side2, int side3) {
        this.side = side;
        this.side2 = side2;
        this.side3 = side3;
        this.color = color;
    }

    @Override
    public double getArea() {
        return (side + side2) / 4 * Math.sqrt(4 * side3 * side3 - Math.pow((side - side2), 2));
    }

    @Override
    public String draw() {
        StringBuilder sb = new StringBuilder("Figure: Isosceles Trapezoid, area: ");
        sb.append(getArea())
                .append(" sq.units, side: ")
                .append(side)
                .append(" units, side2: ")
                .append(side2)
                .append(" units, side3: ")
                .append(side3)
                .append(" units, color: ")
                .append(color);
        return sb.toString();
    }
}
