package core.basesyntax;

public class IsoscelesTrapezoid extends Figure {
    private double baseA;
    private double baseB;
    private double side;

    public IsoscelesTrapezoid(String color, double baseA, double baseB, double side) {
        super(color);
        this.baseA = baseA;
        this.baseB = baseB;
        this.side = side;
    }

    public double getBaseA() {
        return baseA;
    }

    public void setBaseA(double baseA) {
        this.baseA = baseA;
    }

    public double getBaseB() {
        return baseB;
    }

    public void setBaseB(double baseB) {
        this.baseB = baseB;
    }

    public double getSide() {
        return side;
    }

    public void setSide(double side) {
        this.side = side;
    }

    @Override
    public void drawShape() {
        System.out.println(String.format("%s%.1f%s%.1f%s%.1f%s%.1f%s%s",
                "Figure: isosceles trapezoid, area: ",
                this.calculateArea(), " sq. units, base a length: ",
                this.getBaseA(), " units, base b length: ", this.getBaseB(),
                " units, sides length: ", this.getSide(), " units, color: ", this.getColor()));
    }

    @Override
    public double calculateArea() {
        return ((baseA + baseB) / 2)
                * Math.sqrt((side * side) - Math.pow((baseA - baseB), 2) / 4);
    }
}
