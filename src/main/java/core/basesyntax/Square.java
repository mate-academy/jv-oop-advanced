package core.basesyntax;

public class Square extends Figure {
    private double side;
    private String name;

    public Square(String color, int side, double area, String name) {
        super(color);
        this.side = side;
        this.name = name;
    }

    public double getArea() {
        return Math.round(getSide() * getSide());
    }

    public double getSide() {
        return side;
    }

    public String getName() {
        return name;
    }

    public String draw() {
        String returnLine = "Shape: " + getName() + ",area: " + getArea()
                + " sq. units, side: " + getSide()
                + " units, color: " + getColor();
        return returnLine;
    }
}
