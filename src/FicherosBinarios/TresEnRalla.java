package FicherosBinarios;

import GestionFicheros.Creacion_Eliminacion;

import java.io.*;
import java.util.Scanner;


public class TresEnRalla {
    static final String NOMBRE_FICHERO="tresenralla";
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        Scanner scanner = new Scanner(System.in);
        File fichero = new File(NOMBRE_FICHERO);
        fichero.createNewFile();
        String[][] matriz = {{"*","*","*"},{"*","*","*"},{"*","*","*"}};
        setMatrix(matriz);


        while(true) {



            imprimirMatriz(matriz);
            System.out.println("turno jugador1 X:");
            System.out.print("posicion eje y: ");
            String y = scanner.nextLine();
            System.out.print("posicion eje x: ");
            String x = scanner.nextLine();
            int iy = Integer.parseInt(y);
            int ix = Integer.parseInt(x);

            matriz=getMatrix();
            matriz=turno(matriz,iy,ix,"X");
            setMatrix(matriz);


            imprimirMatriz(matriz);
            System.out.println("turno jugador1 O:");
            System.out.print("posicion eje y: ");
            String y2 = scanner.nextLine();
            System.out.print("posicion eje x: ");
            String x2 = scanner.nextLine();
            int iy2 = Integer.parseInt(y2);
            int ix2 = Integer.parseInt(x2);

            matriz=getMatrix();
            matriz=turno(matriz,iy2,ix2,"O");
            setMatrix(matriz);
        }




    }
    public static void comprobarGanador(int[][] matriz){

    }
    public static String[][] turno(String[][] matriz,int x,int y,String valor){


        matriz [x][y]=valor;

        return matriz;
    }

    public static String[][] getMatrix() throws IOException, ClassNotFoundException {
        File fichero = new File(NOMBRE_FICHERO);
        ObjectInputStream ois= new ObjectInputStream(new FileInputStream(fichero));
        String[][] matrix;
        matrix=(String[][]) ois.readObject();
        ois.close();

        return matrix;
    }

    public static void setMatrix(String [][] matriz) throws IOException {
        File fichero = new File(NOMBRE_FICHERO);
        ObjectOutputStream oos= new ObjectOutputStream(new FileOutputStream(fichero));
        oos.writeObject(matriz);
        oos.flush();
        oos.close();



    }

    public static void imprimirMatriz(String[][] matrix){
        for (int i=0;i<matrix.length;i++){
            for (int x=0;x<matrix.length;x++){
                System.out.print(matrix[i][x]);
                System.out.print("\t");
            }
            System.out.println();
        }

    }





}
