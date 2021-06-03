package figure;

public class Rectangle extends Figure {
    private Double firstSide;
    private Double secondSide;

    public Rectangle(String color, Double firstSide, Double secondSide) {
        setColor(color);
        this.firstSide = firstSide;
        this.secondSide = secondSide;
    }

    @Override
    public Double getArea() {
        return firstSide * secondSide;
    }

    @Override
    public void draw() {
        System.out.println("Figure : Rectangle  color : " + getColor()
                + " area : " + getArea() + " sq.units"
                + " first side : " + this.firstSide + " units"
                + " second side : " + this.secondSide + " units");
    }
}
