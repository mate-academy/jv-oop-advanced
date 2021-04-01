package core.basesyntax.figures;

public class IsoscelesTrapezoid extends Figure {
    private int hide;
    private int middleLine;

    public IsoscelesTrapezoid(int hide, int middleLine, String color) {
        super(color);
        this.hide = hide;
        this.middleLine = middleLine;
    }

    public void setHide(int hide) {
        this.hide = hide;
    }

    public int getHide() {
        return hide;
    }

    public void setMiddleLine(int middleLine) {
        this.middleLine = middleLine;
    }

    public int getMiddleLine() {
        return middleLine;
    }

    @Override
    public void draw() {
        System.out.println("Figure: circle, area: " + (hide * middleLine)
                + " sq. units, hide: " + hide
                + " units, middleLine: " + middleLine + " units, color: " + super.getColor());
    }

    @Override
    public double calculateArea() {
        return hide * middleLine;
    }
}
