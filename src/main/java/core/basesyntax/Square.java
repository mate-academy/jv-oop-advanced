package core.basesyntax;

public class Square extends Figure implements Area, Perimeter {

    @Override
    public int areaFigure() {
        return sideLengthA * sideLengthA;
    }

    @Override
    public int perimeterFigure() {
        return sideLengthA * 4;
    }

    @Override
    public void printParameter() {
        System.out.println(" Figure: Square, area: " + areaFigure() + " sq. units, side length: "
                + sideLengthA + " units, color: " + color);
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public Color getColor() {
        return color;
    }

    public int getSideLengthA() {
        return sideLengthA;
    }

    public void setSideLengthA(int sideLengthA) {
        this.sideLengthA = sideLengthA;
    }
}
