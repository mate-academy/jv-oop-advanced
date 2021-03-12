package core.basesyntax;

public class RightTriangle extends Figure {
    private double legA;
    private double legB;

    protected RightTriangle() {
    }

    public RightTriangle(String color, double legA, double legB) {
        super(color);
        this.legA = legA;
        this.legB = legB;
    }

    protected double getLegA() {
        return legA;
    }

    protected void setLegA(double legA) {
        this.legA = legA;
    }

    protected double getLegB() {
        return legB;
    }

    protected void setLegB(double legB) {
        this.legB = legB;
    }

    @Override
    public void drawShape() {
        System.out.println(String.format("%s%.1f%s%.1f%s%s",
                "Figure: right triangle, area: ", this.getArea(), " sq. units, hypotenuse: ",
                getHypotenuse(this.legA, this.legB), " units, color: ", this.getColor()));
    }

    @Override
    public double getArea() {
        return (legA * legB) / 2;
    }

    @Override
    public Figure getRandomFigure() {
        return new RightTriangle(ColorSupplier.colorGenerator(),
                Math.random() * 100, Math.random() * 100);
    }

    private double getHypotenuse(double legA, double legB) {
        return Math.sqrt(Math.pow(legA, 2) + Math.pow(legB, 2));
    }
}
