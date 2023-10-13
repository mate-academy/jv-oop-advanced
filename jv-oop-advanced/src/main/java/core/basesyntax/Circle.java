package core.basesyntax;

public class Circle extends Figure {
    private final int radius;

    public Circle(Form randomForm, Color randomColor, int radius) {
        super(randomForm, randomColor);
        this.radius = radius;
    }

    @Override
    public void draw() {
        System.out.println("Figure: circle, radius :"
                + radius + ", color: "
                + this.getColors().name());
    }
}