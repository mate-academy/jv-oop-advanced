package core.basesyntax;

public class Rectangle extends Figure implements Perimeter {
    protected int sideLengthA;
    protected int sideLengthB;

    @Override
    public int getPerimeter() {
        return sideLengthB * 2 + sideLengthA * 2;
    }

    @Override
    public int getArea() {
        return sideLengthA * sideLengthB;
    }

    @Override
    public void printParameter() {
        System.out.println(" Figure: Rectangle, area: " + getArea()
                + " sq. units, perimeter: " + getPerimeter()
                + " units, side length B: " + sideLengthB + " units, side length A: "
                + sideLengthA + " units, color: " + color);
    }

    public int getSideLengthA() {
        return sideLengthA;
    }

    public int getSideLengthB() {
        return sideLengthB;
    }

    public void setSideLengthA(int sideLengthA) {
        this.sideLengthA = sideLengthA;
    }

    public void setSideLengthB(int sideLengthB) {
        this.sideLengthA = sideLengthB;
    }

    public void setColor(Color color) {
        this.color = color;
    }
}
