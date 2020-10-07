package directorios;

import javax.swing.*;
import java.io.File;
import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.*;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.*;

public class ejercicio1 {

    public static void main(String[] args) {


        JFrame marco = new JFrame("ejemplo AccDat");
        JPanel panel1 = new JPanel();
        JFileChooser eleccion= new JFileChooser();
        eleccion.setFileSelectionMode(JFileChooser.FILES_AND_DIRECTORIES);
        JTextArea texto =new JTextArea();


        int seleccion = eleccion.showOpenDialog(panel1);


        if (seleccion == JFileChooser.APPROVE_OPTION)
        {
            String pattern = "dd-MM-yyyy hh:mm";
            SimpleDateFormat simpleDateFormat = new SimpleDateFormat(pattern);
            File fichero = eleccion.getSelectedFile();
            Date lastModifiedDate = new Date( fichero.lastModified());
            String nombre=fichero.getName();
            String ruta= fichero.getAbsolutePath();
            long  tamaño= fichero.length()/1024;

            texto.setText("Nombre del fichero   "+nombre+"\nRuta del fichero  "+ruta+"\ntamaño del fichero  " +tamaño+"KB"+"\n fecha "+simpleDateFormat.format( lastModifiedDate ));

        }


        panel1.add(texto);
        marco.add(panel1);
        marco.setSize(500,200);
        marco.setVisible(true);
    }
}
