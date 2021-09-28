package unit54;

public class UNIXSystemFactory implements SystemFactory {
    public Text createText() {

        return new UNIXText();
    }
    public Button createButton() {

        return new UNIXButton();
    }
}
