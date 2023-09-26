package strategy;

public class JpegCompress implements Compressor{

    @Override
    public void compress(String filename) {
        System.out.println(("Compress with JPEG"));
    }
    
}
