package FicherosBinarios;

import java.io.*;

public class prueba {
    static DataOutputStream salida;



    public prueba() throws FileNotFoundException {

    }


    public static void main(String[] args) throws IOException {


        salida = new DataOutputStream(new FileOutputStream("pedido.txt"));
        int[] edad={12, 71, 15, 58, 30};
        String[] nombre={"pepito", "antonio", "fernando", "jose", "eustaqio"};


        for (int i=0; i<edad.length; i ++) {

            escribirNom(nombre[i]);
            escribirEdad(edad[i]);


        }
        salida.close();



        int unidad;
        String descripcion;


        DataInputStream entrada=new DataInputStream(new FileInputStream("pedido.txt"));
        try {
            while ((descripcion=entrada.readLine())!=null) {
                unidad=entrada.readInt();
                entrada.readChar();
                System.out.println(unidad+" "+descripcion);

            }
        }catch (EOFException e) {}

        entrada.close();



    }
    public static void escribirNom(String s) throws IOException {
        salida.writeChars(s);
        salida.writeChar('\n');
    }
    public static void escribirEdad(int i) throws IOException {
        salida.writeInt(i);
        salida.writeChar('\t');
    }



}
