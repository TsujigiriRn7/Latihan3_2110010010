
package geometri;

public class persegipanjang {
    private double panjang;
    private double lebar;
    
    public persegipanjang (double panjang,double lebar){
        this.panjang = panjang;
        this.lebar = lebar;
    }
    
    public double luas(){
        return panjang*lebar;
    }
   public double keliling(){
       return 2*(panjang+lebar);
   }
}
