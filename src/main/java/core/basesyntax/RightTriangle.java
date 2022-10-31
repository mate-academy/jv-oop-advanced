package core.basesyntax;

public class RightTriangle extends Figure {
    public static final String FIGURE_NAME = "Right Triangle";
    private int firstLeg;
    private int secondLeg;

    public RightTriangle(String color, int firstLeg, int secondLeg) {
        super(color);
        this.firstLeg = firstLeg;
        this.secondLeg = secondLeg;
    }

    @Override
    public double getArea() {
        return this.firstLeg * this.secondLeg / 2;
    }

    @Override
    public void draw() {
        StringBuilder str = new StringBuilder();
        str.append("Figure: ").append(this.FIGURE_NAME)
                .append(", area: ").append(this.getArea()).append(" sq.units, firstLeg: ")
                .append(this.firstLeg).append(" units,  secondLeg: ")
                .append(this.secondLeg).append(" units, color: ")
                .append(super.getColor()).toString();
        System.out.println(str);
    }

}