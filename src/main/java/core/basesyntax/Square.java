package core.basesyntax;

public class Square extends Figure {
    private double leg;

    Square(String color) {
        super(color);
    }

    Square(String color, double leg) {
        super(color);
        this.setName("Square");
        this.leg = leg;
        this.setArea(calculateArea());
    }

    @Override
    void drawFigure() {
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

    @Override
    public double calculateArea() {
        return leg * leg;
    }
}
