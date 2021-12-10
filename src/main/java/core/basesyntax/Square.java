package core.basesyntax;

public class Square extends Figure {
    private int sideOfSquare;

    public Square() {
    }

    public int getSideOfSquare() {
        return sideOfSquare;
    }

    public void setSideOfSquare(int sideOfSquare) {
        this.sideOfSquare = sideOfSquare;
    }

    @Override
    public String getName() {
        return "square";
    }

    @Override
    public double getArea() {
        return sideOfSquare * sideOfSquare;
    }

    @Override
    public void draw() {
        System.out.println("Figure: " + getName()
                +
                ", area: " + getArea() + " sq.units"
                +
                ", sideOfSquare: " + getSideOfSquare() + " units"
                +
                ", color: " + super.getColor());
    }
}
