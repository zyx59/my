package unit44;

public class GifReaderFactory implements ImageReaderFactory {
    public ImageReader createImageReader(){
        ImageReader imageReader = new GifReader();
        return imageReader;
    }

}
