package core.basesyntax;

public class IsoscelesTrapezoid extends Figure {
    private double smallBase;
    private double bigBase;
    private double side;

    public IsoscelesTrapezoid() {
    }

    public IsoscelesTrapezoid(String color, double firstBase, double secondBase, double side) {
        this.setColor(color);
        this.smallBase = Math.min(firstBase, secondBase);
        this.bigBase = Math.max(firstBase, secondBase);
        this.side = side;
    }

    @Override
    public double getArea() {
        double height = Math.sqrt(side * side - Math.pow((bigBase - smallBase) / 2, 2));
        return (smallBase + bigBase) * height / 2;
    }

    @Override
    public void draw() {
        StringBuilder info = new StringBuilder();
        info.append("Figure: isosceles trapezoid, area: ")
                .append(getArea()).append(" sq.units, small base: ")
                .append(smallBase).append(" units, big base: ")
                .append(bigBase).append(" units, side: ")
                .append(side).append(" units, color: ")
                .append(getColor());
        System.out.println(info);
    }
}
