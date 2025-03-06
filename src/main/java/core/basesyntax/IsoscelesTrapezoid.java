package core.basesyntax;

public class IsoscelesTrapezoid extends Figure implements Area {
    private double bottom;
    private double top;
    private double hight;

    public IsoscelesTrapezoid(Color randomColor, double v, double v1, double v2) {
        super.setColor(randomColor);
        this.bottom = v;
        this.top = v1;
        this.hight = v1;
    }

    public double getBottom() {
        return this.bottom;
    }

    public void setBottom(double bottom) {
        if (bottom > 0) {
            this.bottom = bottom;
        }
        else {
            System.out.println("Dolna długość nie może być mniejsza od 0");
        }
    }

    public double getTop() {
        return this.top;
    }

    public void setTop(double top) {
        if (top > 0) {
            this.top = top;
        }
        else {
            System.out.println("Górna długość nie może być mniejsza od 0");
        }
    }

    public double getHight() {
        return this.hight;
    }

    public void setHight(double hight) {
        if (hight > 0) {
            this.hight = hight;
        }
        else {
            System.out.println("Wysokość trapezu nie może być mniejsza od 0");
        }
    }

    @Override
    public double getArea() {  // metoda statyczna
        return ((top + bottom) * hight) / 2;
    }

    @Override
    public String toString() {
        System.out.println("IsoscelesTrapezoid color: " + getColor() + " Górna długość wynosi: " + getTop() + " Dolna długość wynosi: " + getBottom() + " Wysokość trapezu wynosi: " + getHight());
        return super.toString();
    }
}
