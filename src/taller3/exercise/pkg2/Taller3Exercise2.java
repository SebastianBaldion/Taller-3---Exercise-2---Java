
package taller3.exercise.pkg2;

/**
 *
 * @author Sebastian Baldion
 */
public class Taller3Exercise2 {
    int direccion = 0; 
    Integer[][] matriz;
    int numeroActual = 25;
    int posicionX = 0, posicionY = 0;
    
    public static void main(String[] args) {
        int numero = 5;
        Taller3Exercise2 obj = new Taller3Exercise2();
        obj.matriz = new Integer[numero][numero];
        obj.rellenar(numero, obj.direccion);
        numero--;
        while (numero > 0) {
            obj.rellenar(numero, obj.direccion);
            obj.rellenar(numero, obj.direccion);
            numero--;
        }
        System.out.println(obj.toString());
    }
    public void rellenar(int num, int direccion) {
        if ((posicionX == 0) && (posicionY == 0)) {
            this.matriz[posicionX][posicionY] = numeroActual;
            this.numeroActual--;
            num--;
        }
        for(int i = 0; i < num; i++) {
            switch (direccion) {
            case 0:
                posicionX++;
                break;
            case 1:
                posicionY++;
                break;
            case 2:
                posicionX--;
                break;
            case 3:
                posicionY--;
                break;
            //0 Derecha, 1 Abajo, 2 Izquierda, 3-Arriba
            }
            this.matriz[posicionY][posicionX] = numeroActual;
            this.numeroActual--;
        }
        this.direccion = (this.direccion != 3) ? this.direccion + 1 : 0;
    }
    public String toString() {
        String res = "";
        for (int i = 0; i < matriz.length; i++) {
            res = res + " ";
            for (int j = 0; j < matriz.length; j++) {
                res = res + matriz[i][j] + "\t ";
            }
            res = res.substring(0, res.length() - 2) + " \n";
        }
    return res;
    }
}
