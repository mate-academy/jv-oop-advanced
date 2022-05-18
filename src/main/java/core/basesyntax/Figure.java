package core.basesyntax;

public abstract class Figure implements InformationObtainable {
    private final Colors color;
    private String info;

    public Figure(Colors color) {
        this.color = color;
    }

    public Colors getColor() {
        return color;
    }

    public String getInfo() {
        return info;
    }

    public void setInfo(String info) {
        this.info = info;
    }

    public abstract double getArea();
}
