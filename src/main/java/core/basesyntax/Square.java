package core.basesyntax;

public class Square extends Figure {
    private double side;
    private double area;

    public Square(String color, double side) {
        super(color);
        this.side = side;
    }

    @Override
    public void findArea() {
        if (this.area == 0.0) {
            area = side * side;
        } else {
            System.out.println("The area has been already calculated");
        }
    }

    @Override
    public String draw() {
        return "Figure: Square, "
                + "side: " + side
                + " units, area: " + area
                + " sq.units, " + "color: " + getColor();
    }
}
