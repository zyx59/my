package unit54;

public class WindowsSystemFactory implements SystemFactory {
    public Text createText() {

        return new WindowsText();
    }
    public Button createButton() {

        return new WindowsButton();
    }
}

