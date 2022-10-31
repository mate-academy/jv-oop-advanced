package core.basesyntax;

public class IsoscelesTrapezoid extends Figure {
    public static final String FIGURE_NAME = "Isosceles Trapezoid";
    private int baseSideA;
    private int baseSideB;
    private int height;

    public IsoscelesTrapezoid(String color, int baseSideA, int baseSideB, int height) {
        super(color);
        this.baseSideA = baseSideA;
        this.baseSideB = baseSideB;
        this.height = height;
    }

    @Override
    public double getArea() {
        return this.height * (this.baseSideA + this.baseSideB) / 2;
    }

    @Override
    public void draw() {
        StringBuilder str = new StringBuilder();
        str.append("Figure: ").append(this.FIGURE_NAME)
                .append(", area: ").append(this.getArea()).append(" sq.units, baseSide a: ")
                .append(this.baseSideA).append(" units,  baseSide b: ")
                .append(this.baseSideB).append(" units, height: ").append(this.height).append(" units, color: ").append(super.getColor()).toString();
        System.out.println(str);
    }
}
