package unit54;

public class LinuxSystemFactory implements SystemFactory {
    public Text createText() {

        return new LinuxText();
    }
    public Button createButton() {

        return new LinuxButton();
    }
}