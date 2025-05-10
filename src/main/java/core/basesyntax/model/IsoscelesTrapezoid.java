package core.basesyntax.model;

public class IsoscelesTrapezoid extends Figure {
    private int baseUpSide;
    private int baseDownSide;
    private int altitude;

    public IsoscelesTrapezoid(String figureColor, int baseDownSide, int baseUpSide, int altitude) {
        super(figureColor);
        this.altitude = altitude;
        this.baseDownSide = baseDownSide;
        this.baseUpSide = baseUpSide;
    }

    public int getBaseUpSide() {
        return baseUpSide;
    }

    public void setBaseUpSide(int baseUpSide) {
        this.baseUpSide = baseUpSide;
    }

    public int getBaseDownSide() {
        return baseDownSide;
    }

    public void setBaseDownSide(int baseDownSide) {
        this.baseDownSide = baseDownSide;
    }

    public int getAltitude() {
        return altitude;
    }

    public void setAltitude(int altitude) {
        this.altitude = altitude;
    }

    @Override
    public double getArea() {
        return (baseDownSide + baseUpSide) / 2 * altitude;
    }

    @Override
    public void draw() {
        System.out.println("Figure: " + getClass().getSimpleName()
                + ", area: " + getArea() + " sq.units," + " baseUpSide: "
                + baseUpSide + " units," + " baseDownSide: " + baseDownSide + " units,"
                + " altitude: " + baseUpSide + " units," + " color: " + getColor());
    }
}
