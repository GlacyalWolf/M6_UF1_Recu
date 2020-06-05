package GestionFicheros;

import java.io.File;
import java.util.Scanner;

public class borrarDirecorio {
    public static void main(String[] args) {

        File f= new File("C:\\Users\\ismael\\IdeaProjects\\getionDeFicheros\\ NuevoDir");


        if(f.exists()) {
            File[] listaf = f.listFiles();

            for (File file : listaf) {
                file.delete();
            }
        }
        f.delete();



    }
}
