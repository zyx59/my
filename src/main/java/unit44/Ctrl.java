package unit44;

public class Ctrl {
    public static void main(String args[]){
        ImageReaderFactory factory;
        ImageReader imageReader;
        factory = new GifReaderFactory();
        imageReader = factory.createImageReader();
        imageReader.show();

    }
}
