package unit44;

public class JpgReaderFactory implements ImageReaderFactory {
    public ImageReader createImageReader(){
        ImageReader imageReader = new JpgReader();
        return imageReader;
    }

}
