package core.basesyntax;

public class Square extends Figure {
    public static final String FIGURE_NAME = "Square";
    private int side;

    public Square(String color, int side) {
        super(color);
        this.side = side;
    }

    @Override
    public double getArea() {
        return Math.pow(this.side, 2);
    }

    @Override
    public void draw() {
        StringBuilder str = new StringBuilder();
        str.append("Figure: ").append(this.FIGURE_NAME)
                .append(", area: ").append(this.getArea()).append(" sq.units, side: ")
                .append(this.side).append(" units, color: ").append(super.getColor()).toString();
        System.out.println(str);
    }
}
