package figure;

public class Square extends Figure {
    private Double side;

    public Square(String color, Double side) {
        this.setType(FigureSupplier.getTypeName(4));
        this.setColor(color);
        this.setType("square");
        this.side = side;
    }

    public Double getSide(Double side) {
        return side;
    }

    public void setSide(Double side) {
        this.side = side;
    }

    @Override
    public Double getArea() {
        return side * side;
    }

    @Override
    public void draw() {
        System.out.println(new StringBuilder().append("Figure : ").append(getType())
                .append(" color : ").append(getColor())
                .append(" area : ").append(getArea()).append(" sq.units")
                .append(" side : ").append(this.side).append(" units"));
    }
}
