import biblioteca.*;
import calculadora.*;


public class Main{

    public static void main(String[] args) {

        int x=0,y=0;
        
        x = LE.leerInt("ingrese un valor entero");
        y = LE.leerInt("ingrese un valor entero");
        
        suma sumaXY = new suma();



        LE.mostrarInformacion(""+sumaXY.resultado(x, y));

    }


}