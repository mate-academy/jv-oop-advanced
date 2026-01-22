package core.basesyntax;

public class Square implements Behavior {
    private String state =  "color";
    private int storona;

    public Square(String state,  int storona) {
        this.state = state;
        this.storona = storona;
    }

    @Override
    public void creatFigure() {
        int a = storona * storona;
        System.out.println("Figure: square, area: " + a + " sq. units, side: " + storona + " units, color: " + state);
    }
}
