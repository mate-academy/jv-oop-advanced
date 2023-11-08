package core.basesyntax.figure;

public class Square extends Figure {
    private double side;

    public Square(String color, double side) {
        super(color);
        this.side = side;
    }

    public double getSide() {
        return side;
    }

    public void setSide(double side) {
        this.side = side;
    }

    @Override
    public double getArea() {
        double area = side * side;
        double scale = Math.pow(10, 3);
        return Math.ceil(area * scale) / scale;
    }

    @Override
    public String draw() {
        int index = this.getClass().getName().lastIndexOf(".");
        String name = this.getClass().getName().substring(index + 1);
        String figure = "Figure: " + name + ", area: " + this.getArea()
                + ", sq. units, side: " + this.side + ", color: " + this.getColor();
        return figure;
    }
}
