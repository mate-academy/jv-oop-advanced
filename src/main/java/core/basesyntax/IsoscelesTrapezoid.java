package core.basesyntax;

public class IsoscelesTrapezoid extends Figure implements FigureMethods {
    private final float firstBase;
    private final float secondBase;
    private final float height;

    public IsoscelesTrapezoid(Colors color, float firstBase, float secondBase, float height) {
        super(color, "IsoscelesTrapezoid");
        this.firstBase = firstBase;
        this.secondBase = secondBase;
        this.height = height;
    }

    @Override
    public double area() {
        return (firstBase + secondBase) * height;
    }

    @Override
    public void draw() {

    }
}
