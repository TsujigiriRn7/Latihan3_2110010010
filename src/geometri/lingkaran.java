
package geometri;

public class lingkaran {
    double radius;
    
    public lingkaran (double radius){
        this.radius = radius;
    }
    
    public double luas(){
        return Math.PI * radius * radius;
     }
    public double keliling(){
        return 2 * Math.PI * radius;
    }
          
}
