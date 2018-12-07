package Integration;
public class Square {
    
    private double base;
    
    public Square(double base) {
        this.base = base;
    }
    
    public Square() {
        
    }
    
    public double squared() {
        double x = base*base;
        return x;
    }
    
    public double squared(double base) {
        double x = base*base;
        return x;
    }
    
    public void setBase(double base) {
        this.base = base;
    }
    
    public double getBase() {
        return base;
    }

}
