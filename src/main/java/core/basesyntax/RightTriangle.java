package core.basesyntax;

public class RightTriangle extends Figure {
    private final int side;

    public RightTriangle(Form form, Color randomColor, int side) {
        super(form, randomColor);
        this.side = side;
    }

    @Override
    public Figure draw() {
        System.out.println("Figure: right rectangle, area: " + side * side / 2
                + "sq.units, firstLeg: "
                + side + " units, secondLeg: " + side
                + "units, color: " + this.getColors());
        return null;
    }
}
