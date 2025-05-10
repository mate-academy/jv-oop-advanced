package core.basesyntax;

public class Rectangle extends Figure {
    private int sideARectangle;
    private int sideBRectangle;

    public Rectangle() {
    }

    public int getSideARectangle() {
        return sideARectangle;
    }

    public void setSideARectangle(int sideARectangle) {
        this.sideARectangle = sideARectangle;
    }

    public int getSideBRectangle() {
        return sideBRectangle;
    }

    public void setSideBRectangle(int sideBRectangle) {
        this.sideBRectangle = sideBRectangle;
    }

    @Override
    public String getName() {
        return "rectangle";
    }

    @Override
    public double getArea() {
        return sideARectangle * sideBRectangle;
    }

    @Override
    public void draw() {
        System.out.println("Figure: " + getName()
                + ", area: " + getArea() + " sq.units"
                + ", sideAOfSquare: " + getSideARectangle() + " units"
                + ", sideBOfSquare: " + getSideBRectangle() + " units"
                +
                ", color: " + super.getColor());
    }
}
