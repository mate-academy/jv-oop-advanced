package core.basesyntax;

public class Circle extends Figure {
    private final int radius;
    public Circle(Form randomForm, Color randomColor, int radius) {
        super(randomColor,randomForm);
        this.radius = radius;
    }
    @Override
    public Figure draw() {
        System.out.println("Figure: circle, radius :" + radius  + ", color: "+ this.getColors().name());
        return null;
    }
}
