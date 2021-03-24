import java.util.Locale;

public class Coordenada
{
    private double x;
    private double y;
    
    public Coordenada()
    {
        x = 0;
        y = 0;
    }

    public Coordenada(double x , double y ){
        this.x = x ;
        this.y = y ;
    }
    
    public void mostrarCoordenada()
    {
        //System.out.printf (Locale.US,"(%.1f,%.1f)",x,y);
        //System.out.printf ("(%.1f,%.1f)",x,y);
        System.out.println("(" + x + "," + y + ")" );
    }
    
    public void setX(double x){
        this.x = x;
    }
    
    public void setY(double y){
        this.y = y;
    }
    
    public double getX (){
        return x;
    }
    
    public double getY (){
        return y;
    }
}
