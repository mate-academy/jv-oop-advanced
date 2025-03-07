package core.basesyntax;

public class IsoscelesTrapezoid extends Figure implements Area, Draw {
    private double bottom;
    private double top;
    private double hight;

    public IsoscelesTrapezoid(Color randomColor, double v, double v1, double v2) {
        super.setColor(randomColor);
        this.bottom = v;
        this.top = v1;
        this.hight = v2;
    }

    public double getBottom() {
        return this.bottom;
    }

    public void setBottom(double bottom) {
        if (bottom > 0) {
            this.bottom = bottom;
        } else {
            System.out.println("Bottom length cannot be less than 0");
        }
    }

    public double getTop() {
        return this.top;
    }

    public void setTop(double top) {
        if (top > 0) {
            this.top = top;
        } else {
            System.out.println("Top length cannot be less than 0");
        }
    }

    public double getHight() {
        return this.hight;
    }

    public void setHight(double hight) {
        if (hight > 0) {
            this.hight = hight;
        } else {
            System.out.println("The height of the trapezoid cannot be less than 0");
        }
    }

    @Override
    public double getArea() {
        return ((top + bottom) * hight) / 2;
    }

    @Override
    public void toDraw() {
        System.out.println("IsoscelesTrapezoid color: " + getColor() + " The top length is: " + getTop() + " The bottom length is: " + getBottom() + " The height of the trapezoid is: " + getHight());
    }
}
