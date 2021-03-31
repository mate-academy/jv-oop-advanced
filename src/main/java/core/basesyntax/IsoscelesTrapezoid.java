package core.basesyntax;

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
    public int getHide(){
        return hide;
    }

    public void setMiddleLine (int middleLine) {
        this.middleLine = middleLine;
    }
    public int getMiddleLine(){
        return middleLine;
    }

    public void draw() {
        System.out.println("Figure: circle, area: " + (hide*middleLine) + " sq. units, hide: " + hide
                + " middleLine: " + middleLine + " units, color: " + super.getColor());
    }

    public void area() {
        System.out.println("Area: " + hide*middleLine);
    }
}
