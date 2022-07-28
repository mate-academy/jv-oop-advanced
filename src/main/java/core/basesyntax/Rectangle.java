package core.basesyntax;

public class Rectangle extends Figure {
    private int lrSide;
    private int tpSide;

    public Rectangle(String color, int lrSide, int tpSide) {
        this.lrSide = lrSide;
        this.tpSide = tpSide;
    }

    public int getLrSide() {
        return lrSide;
    }

    public void setLrSide(int lrSide) {
        this.lrSide = lrSide;
    }

    public int getTpSide() {
        return tpSide;
    }

    public void setTpSide(int tpSide) {
        this.tpSide = tpSide;
    }

    @Override
    public double getArea() {
        return lrSide * tpSide;
    }

    @Override
    public String draw() {
        return "Rectangle Color: " + getColor() + " - Radius: " + getArea();
    }

}
