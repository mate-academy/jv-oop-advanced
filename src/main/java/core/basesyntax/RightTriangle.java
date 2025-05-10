package core.basesyntax;

public class RightTriangle extends Figure {
    private double legA;
    private double legB;

    public RightTriangle(String color, double legA, double legB) {
        super(color);
        this.legA = legA;
        this.legB = legB;
    }

    public double getLegA() {
        return legA;
    }

    public void setLegA(double legA) {
        this.legA = legA;
    }

    public double getLegB() {
        return legB;
    }

    public void setLegB(double legB) {
        this.legB = legB;
    }

    @Override
    public void drawShape() {
        System.out.println(String.format("%s%.1f%s%.1f%s%s",
                "Figure: right triangle, area: ", this.calculateArea(), " sq. units, hypotenuse: ",
                getHypotenuse(this.legA, this.legB), " units, color: ", this.getColor()));
    }

    @Override
    public double calculateArea() {
        return (legA * legB) / 2;
    }

    private double getHypotenuse(double legA, double legB) {
        return Math.sqrt(Math.pow(legA, 2) + Math.pow(legB, 2));
    }
}
