package core.basesyntax;

public abstract class Figure {
    private Colors basecolor;

    public Figure(Colors color) {
        this.basecolor = color;
    }

    public void setBasecolor(Colors basecolor) {
        this.basecolor = basecolor;
    }

    public Colors getBasecolor() {
        return basecolor;
    }

    public abstract double getArea();

    public abstract void draw();
}
