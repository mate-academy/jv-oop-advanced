package core.basesyntax;

public class IsoscelesTrapezoid extends Figure implements Perimeter {
    protected int sideLengthA;
    protected int sideLengthB;
    private int equalSides;

    @Override
    public int getPerimeter() {
        return (sideLengthA + sideLengthB) * 2;
    }

    @Override
    public int getArea() {
        return (int) ((int) ((sideLengthA + sideLengthB) / 2) * Math.sqrt(Math.pow(equalSides, 2)
                - Math.pow(sideLengthA - sideLengthB, 2) / 4));
    }

    @Override
    public void printParameter() {
        System.out.println(" Figure: Isosceles Trapezoid, area: " + getArea()
                + " sq. units, perimeter: " + getPerimeter()
                + " units, equal sides: " + equalSides + " units, side length B: "
                + sideLengthB + " units, side length A: "
                + sideLengthA + " units, color: " + color);
    }

    public int getSideLengthB() {
        return sideLengthB;
    }

    public int getSideLengthA() {
        return sideLengthA;
    }

    public void setSideLengthA(int sideLengthA) {
        this.sideLengthA = sideLengthA;
    }

    public void setSideLengthB(int sideLengthB) {
        this.sideLengthA = sideLengthB;
    }

    public int getEqualSides() {
        return equalSides;
    }

    public void setEqualSides(int equalSides) {
        this.equalSides = equalSides;
    }

    public void setColor(Color color) {
        this.color = color;
    }
}
