package core.basesyntax;

public class Square extends Figure {
    private int leg;

    public Square(String color, int leg) {
        super(color);
        this.leg = leg;
    }

    @Override
    public double getArea() {
        return Math.pow(leg, 2);
    }

    @Override
    public void draw() {
        System.out.println("Figure: rectangle, area: " + getArea() + "sq.units ,leg: "
                  + leg + " units, color: " + getColor());
    }
}
