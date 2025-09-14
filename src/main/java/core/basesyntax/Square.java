package core.basesyntax;

public class Square extends Figure {
    private double side;

    public Square(Color color, double side) {
        super(color);
        if (side <= 0) {
            throw new IllegalArgumentException("Side must be > 0");
        }
        setSide(side);
    }

    public double getSide() {
        return side;
    }

    public void setSide(double side) {
        this.side = side;
    }

    @Override
    public double getArea() {
        return side * side;
    }

    @Override
    public void draw() {
        StringBuilder builder = new StringBuilder("Figure: square, ");
        builder.append("area: ").append(String.format("%.1f",getArea())).append(" sq. units, ");
        builder.append("side: ").append(getSide()).append(" units, ");
        builder.append("color: ").append(getColor().name());
        System.out.println(builder.toString());
    }
}
