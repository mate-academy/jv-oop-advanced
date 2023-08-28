package core.basesyntax.figures;

public class IsoscelesTrapezoid extends Figure {
    private int bottomBase;
    private int upperBase;
    private int lateralSide;

    public IsoscelesTrapezoid(String color, int bottomBase, int upperBase, int lateralSide) {
        super(color);
        this.bottomBase = bottomBase;
        this.upperBase = upperBase;
        this.lateralSide = lateralSide;
    }

    public int getBottomBase() {
        return bottomBase;
    }

    public void setBottomBase(int bottomBase) {
        this.bottomBase = bottomBase;
    }

    public int getUpperBase() {
        return upperBase;
    }

    public void setUpperBse(int upperBase) {
        this.upperBase = upperBase;
    }

    public int getLateralSide() {
        return lateralSide;
    }

    public void setLateralSide(int lateralSide) {
        this.lateralSide = lateralSide;
    }

    @Override
    public void draw() {
        System.out.println("Figure: isosceles trapezoid. Color: " + getColor() + ". Area: "
                + calculateArea() + ". Bottom base: " + bottomBase + ". Upper base: "
                + upperBase + ". Lateral side: " + lateralSide + '.');
    }

    @Override
    double calculateArea() {
        return (((bottomBase + upperBase) / 2) * Math.sqrt((lateralSide * lateralSide)
                - (((bottomBase - upperBase) * (bottomBase - upperBase)) / 4)));
    }
}
