package core.basesyntax;

public class Square extends Figure {
    private double leg;

    Square(String color) {
        super(color);
    }

    Square(String color, double leg) {
        super(color);
        this.setName(Name.SQUARE.name());
        this.leg = leg;
        this.setArea(calculateArea());
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

    @Override
    public double calculateArea() {
        return leg * leg;
    }
}
