package core.basesyntax;

public class Square extends Figure {

    private double site;

    public Square() {
    }

    public Square(String color, int site) {
        super(color);
        this.site = site;
    }

    @Override
    public double getArea() {
        return this.site * this.site;
    }

    @Override
    public void draw() {
        System.out.println("Figure: square, area: "
                + getArea() + " sq. units, side: "
                + this.site + " units, color: " + this.color);
    }
}
