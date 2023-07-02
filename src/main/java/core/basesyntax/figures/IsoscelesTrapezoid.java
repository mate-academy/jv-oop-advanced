package core.basesyntax.figures;

public class IsoscelesTrapezoid extends Figure {
    private int ceil;
    private int floor;
    private int side;
    public IsoscelesTrapezoid(String color, int ceil, int floor, int side) {
        super(color);
        this.ceil = ceil;
        this.floor = floor;
        this.side = side;
    }
}
