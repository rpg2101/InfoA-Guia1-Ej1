
public class Linea
{
    Coordenada coordenadaPunto1;
    Coordenada coordenadaPunto2;
    
    public Linea()
    {
        coordenadaPunto1 = new Coordenada();
        coordenadaPunto2 = new Coordenada();
    }

    public Linea(double x1 , double y1 , double x2 , double y2 ){
        coordenadaPunto1 = new Coordenada(x1,y1);
        coordenadaPunto2 = new Coordenada(x2,y2);
    }
    
    public void mueveDerecha (double distancia) {
        coordenadaPunto1.setX (coordenadaPunto1.getX() + distancia);
        coordenadaPunto2.setX (coordenadaPunto2.getX() + distancia);
    }

}
