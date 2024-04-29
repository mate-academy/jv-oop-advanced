package core.basesyntax.figures;

public class Rectangle extends Figure {
    private int sidea;
    private int sideb;

    public Rectangle() {
        this.sidea = getRandomNum();
        this.sideb = getRandomNum();
    }

    @Override
    public double getArea() {
        return this.sidea * this.sideb;
    }

    @Override
    public void draw() {
        System.out.println("Figure: Rectangle, area: " + getArea()
                + " sq. units, " + "side a: " + sidea
                + " side b: " + sideb + " units, color: " + getColor());
    }
}
