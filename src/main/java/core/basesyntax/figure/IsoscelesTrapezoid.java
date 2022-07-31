package core.basesyntax.figure;

public class IsoscelesTrapezoid extends Figure {
    private double upSide;
    private double downSide;
    private double height;

    public IsoscelesTrapezoid(String figureType, String color, double upSide,
                              double downSide,double height) {
        super(figureType, color);
        this.upSide = upSide;
        this.downSide = downSide;
        this.height = height;
    }

    public double getUpSide() {
        return upSide;
    }

    public void setUpSide(double upSide) {
        this.upSide = upSide;
    }

    public double getDownSide() {
        return downSide;
    }

    public void setDownSide(double downSide) {
        this.downSide = downSide;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    @Override
    public String draw() {
        return "Figure: " + getFigureType()
                + ", area: " + getArea() + " sq.units,"
                + " upSide: " + upSide
                + " units, downSide: " + downSide
                + " units, height: " + height
                + " units, color: " + getColor();
    }

    @Override
    public double getArea() {
        final double factor = 0.5;
        double sumOfSide = upSide + downSide;
        return upSide != downSide ? (factor * sumOfSide) * height : 0.0;
    }

}
