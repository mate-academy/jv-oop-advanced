package core.basesyntax;

public class Square extends Figure {
    private double leg;
    private double area;

    Square(Color color) {
        super(color);
    }

    Square(Color color, double leg) {
        super(color);
        this.setName(FigureName.SQUARE);
        this.leg = leg;
        this.area = calculateArea();
    }

    @Override
    public void draw() {
        String text = "Figure: " + getName() + ", area: "
                + getArea() + " sq.units, leg: " + getLeg()
                + " units, color: " + getColor();
        System.out.println(text);
    }

    public double getLeg() {
        return leg;
    }

    public void setLeg(double leg) {
        this.leg = leg;
    }

    public double getArea() {
        return area;
    }

    @Override
    public double calculateArea() {
        return leg * leg;
    }
}
