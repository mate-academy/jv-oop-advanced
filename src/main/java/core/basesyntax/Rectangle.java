package core.basesyntax;

public class Rectangle extends Figure implements Area, Perimeter {

    @Override
    public int perimeterFigure() {
        return sideLengthB * 2 + sideLengthA * 2;
    }

    @Override
    public int areaFigure() {
        return sideLengthA * sideLengthB;
    }

    @Override
    public void printParameter() {
        System.out.println(" Figure: Rectangle, area: " + areaFigure()
                + " sq. units, perimeter: " + perimeterFigure()
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

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }
}
