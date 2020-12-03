package core.basesyntax;

public class Square extends Figure implements Perimeter {
    protected int sideLengthA;

    @Override
    public int getArea() {
        return sideLengthA * sideLengthA;
    }

    @Override
    public int getPerimeter() {
        return sideLengthA * 4;
    }

    @Override
    public void printParameter() {
        System.out.println(" Figure: Square, area: " + getArea() + " sq. units, side length: "
                + sideLengthA + " units, color: " + color);
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public int getSideLengthA() {
        return sideLengthA;
    }

    public void setSideLengthA(int sideLengthA) {
        this.sideLengthA = sideLengthA;
    }
}
