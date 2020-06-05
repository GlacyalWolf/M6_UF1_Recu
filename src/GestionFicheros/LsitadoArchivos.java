package GestionFicheros;

import java.io.File;
import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.Scanner;

public class LsitadoArchivos {
    public static void main (String[] args) {
        Scanner s= new Scanner(System.in);
        System.out.println("Escriba la ruta que quiere consultar");
        String directorio= s.nextLine();
        File f= new File(directorio);

        if(f.exists()) {
            File[] listaf = f.listFiles();

            for (File file : listaf) {
                System.out.println(file.getName()+"\t"+file.getPath()+"\t"+file.getAbsolutePath()+"\t"+
                        file.length()+"\tLectura:"+file.canRead()+"\tExcritura:"+file.canWrite());
            }
        }
        else {
            System.out.println("El directorio no esiste");
        }

    }
}
