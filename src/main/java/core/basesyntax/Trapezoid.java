package core.basesyntax;

public class Trapezoid extends Figure {
    private int firstBase;
    private int secondBase;
    private int height;

    protected Trapezoid(int firstBase,int secondBase,int height, Color color) {
        super((firstBase + secondBase) / 2 * height, color);
        this.firstBase = firstBase;
        this.secondBase = secondBase;
        this.height = height;
    }

    private int getHeight() {
        return height;
    }

    @Override
    public double getArea() {
        return (firstBase + secondBase) / 2 * height;
    }

    @Override
    void draw() {
        System.out.println("Trapezoid was drew");
    }

    @Override
    public Color getColor() {
        return ColorProducer.getColor();
    }

    @Override
    public String displayInfo() {
        return String.format("Figure:Trapezoid,Color:%s,Area:%s,Height:%d", getColor(),
                getArea(), getHeight());
    }

}
