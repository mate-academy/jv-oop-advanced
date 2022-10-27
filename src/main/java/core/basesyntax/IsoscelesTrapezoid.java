package core.basesyntax;

public class IsoscelesTrapezoid extends Figure {
    private int height;
    private int Up;
    private int Down;

    public IsoscelesTrapezoid(String color, int height, int up, int down) {
        super(color);
        this.height = height;
        this.Up = up;
        this.Down = down;
    }
    public double getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public int getUp() {
        return Up;
    }

    public void setUp(int up) {
        this.Up = up;
    }

    public int getDown() {
        return Down;
    }

    public void setDown(int down) {
        this.Down = down;
    }

    @Override
    public Figure draw() {
        System.out.println("Figure: " + getClass().getSimpleName() + ", volume: "
                + getVolume() + " sq.units, color: " + getColor() + ", height: " + getHeight()
                + ", Up: " + getUp() + ", Down: " + getDown());
        return null;
    }
    @Override
    public double getVolume() {
        return ((Up * Down) * 0.5) * height;
    }
}
