package strategy;

public class PngCompressor implements Compressor{

    @Override
    public void compress(String filename) {
        System.out.println(("Compress with PNG"));
    }
    
}
