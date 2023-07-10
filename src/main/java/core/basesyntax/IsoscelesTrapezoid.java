package core.basesyntax;

public class IsoscelesTrapezoid extends Figure{
    private int height;
    private int firstBase;
    private int secondBase;
    public IsoscelesTrapezoid(String color) {
        super(color);
        this.height = height;
        this.firstBase = firstBase;
        this.secondBase = secondBase;
    }

    @Override
    public double getArea() {
        return height * (firstBase + secondBase) / 2.0;
    }

    @Override
    public void draw() {

    }
}
