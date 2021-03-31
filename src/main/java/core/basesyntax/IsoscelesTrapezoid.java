package core.basesyntax;

public class IsoscelesTrapezoid extends Figure {
    private int sideA;
    private int sideB;
    private int sideEqual;

    public IsoscelesTrapezoid(int sideA, int sideB, int sideEqual,
                              String color, String nameFigure) {
        super(color, nameFigure);
        this.sideA = sideA;
        this.sideB = sideB;
        this.sideEqual = sideEqual;
    }

    public int getSideA() {
        return sideA;
    }

    public void setSideA(int sideA) {
        this.sideA = sideA;
    }

    public int getSideB() {
        return sideB;
    }

    public void setSideB(int sideB) {
        this.sideB = sideB;
    }

    public int getSideEqual() {
        return sideEqual;
    }

    public void setSideEqual(int sideEqual) {
        this.sideEqual = sideEqual;
    }

    @Override
    public double getArea() {
        return (this.sideA + this.sideB) / (double) 2
                * Math.sqrt((this.sideEqual * this.sideEqual)
                - ((this.sideB - this.sideA) * (this.sideB - this.sideA))
                / (double) 4);
    }

    @Override
    public void draw() {
        System.out.println("Figure: " + getNameFigures() + ", area: "
                + getArea() + " sq. units, sideA length: " + getSideA()
                + " units, sideB length: " + getSideB()
                + " units, sideEqual length: " + getSideEqual()
                + " units, color: " + getColor());
    }
}
