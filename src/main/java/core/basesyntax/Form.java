package core.basesyntax;

public enum Form {
    CIRCLE("CIRCLE"),
    RECTANGLE("RECTANGLE"),
    SQUARE("SQUARE"),
    TRAPEZOID("TRAPEZOID"),
    TRIANGLE("TRIANGLE");
    private String nameForm;

    Form(String form) {
        this.nameForm = form;
    }

    public String getForm() {
        return nameForm;
    }
}
