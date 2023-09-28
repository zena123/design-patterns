package strategy;

public class BlackWhiteFilter implements Filter {

    @Override
    public void apply(String fileName) {
        System.out.println("Apply black and white filter");
    }
    
}
