import biblioteca.*;
import calculadora.Resta;


public class Main{

    public static void main(String[] args) {

        int x=0,y=0;
        
        x = LE.leerInt("ingrese un valor entero");
        y = LE.leerInt("ingrese un valor entero");
        
        int z = 0;

        Resta restaXY = new Resta();

        z = restaXY.resta(x, y);

        LE.mostrarInformacion(""+z);

    }
    
}