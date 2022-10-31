package core.basesyntax;

public class Rectangle extends Figure {
    public static final String FIGURE_NAME = "Rectangle";
    private int sideA;
    private int sideB;

    public Rectangle(String color, int sideA, int sideB) {
        super(color);
        this.sideA = sideA;
        this.sideB = sideB;
    }

    @Override
    public double getArea() {
        return this.sideA * this.sideB;
    }

    @Override
    public void draw() {
        StringBuilder str = new StringBuilder();
        str.append("Figure: ").append(this.FIGURE_NAME)
                .append(", area: ").append(this.getArea()).append(" sq.units, side a: ")
                .append(this.sideA).append(" units,  side b: ")
                .append(this.sideB).append(" units, color: ").append(super.getColor()).toString();
        System.out.println(str);
    }
}
