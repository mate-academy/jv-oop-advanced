package core.basesyntax;

public class Rectangle extends Figure {
    private int topSide;
    private int rightSide;

    public Rectangle(String color, int topSide, int rightSide) {
        super(color);

        this.topSide = topSide;
        this.rightSide = rightSide;
    }

    @Override
    public double obtainArea() {
        return topSide * rightSide;
    }

    @Override
    public void draw() {
        System.out.println(this);
    }

    @Override
    public String toString() {
        return "Figure: rectangle"
                + ", area: " + obtainArea() + " sq.units"
                + ", topSide: " + topSide + " units"
                + ", rightSide: " + rightSide + " units"
                + ", color: " + super.getColor().toLowerCase();
    }
}
