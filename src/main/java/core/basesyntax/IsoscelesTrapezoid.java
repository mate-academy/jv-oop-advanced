package core.basesyntax;

public class IsoscelesTrapezoid extends Figure {
    private double height;
    private double sideA;
    private double sideC;

    public IsoscelesTrapezoid(double height, double sideA, double sideC, String color) {
        this.setColor(color);
        this.height = height;
        this.sideA = sideA;
        this.sideC = sideC;
        this.setFigure("isoscelesTrapezoid");
    }

    @Override
    public double countArea() {
        return Math.ceil((this.sideC + this.sideA) * this.height / 2 * 10) / 10;
    }

    @Override
    public void draw() {
        System.out.println(" Figure: " + this.getFigure()
                + ", area: " + this.countArea()
                + " sq.units, sideA: " + this.sideA
                + " units, sideC: " + this.sideC
                + " units, height: " + this.height
                + " units, color: " + this.getColor());
    }

}
