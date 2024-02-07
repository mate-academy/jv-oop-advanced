package core.basesyntax.figure;

public class IsoscelesTrapezoid extends Figure {
    private final int bottomSide;
    private final int topSide;
    private final int lateralSide;

    public IsoscelesTrapezoid(String color, int bottomSide, int topSide, int lateralSide) {
        super(color);
        this.bottomSide = bottomSide;
        this.topSide = topSide;
        this.lateralSide = lateralSide;
    }
    
    @Override
    public double getArea() {
        double aplusBdividebyfour = (bottomSide + topSide) / 4.0;
        double powCSide = lateralSide * lateralSide;
        double powAMinusB = (bottomSide - topSide) * (bottomSide - topSide);
        return (aplusBdividebyfour) * (Math.sqrt(4 * powCSide - powAMinusB));
    }

    @Override
    public void draw() {
        String figureName = "isosceles trapezoid";
        String message = "Figure: " + figureName + ", area: " + getArea() + " sq.units,"
                + " top side: " + topSide + " units, bottomSide: " + bottomSide
                + " units , lateral side: " + lateralSide
                + " units, color: " + getColor();
        System.out.println(message);
    }
}
