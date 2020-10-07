package lectura;

import java.io.*;
import java.util.Scanner;

public class Ejemplo_lectura {

    public static void main(String[] args) {
        //Leer_Fichero lectura = new Leer_Fichero();
        //escribir_fichero escritura=new escribir_fichero();
       // escritura.escri();
        //escribir_Buffer escribuf= new escribir_Buffer();
        //escribuf.escribuff();
        //leer_buffer buff=new leer_buffer();
        //buff.leeconBuff();
        //binario_leer leerbin = new binario_leer();
        //leerbin.binleer();
        varias_Lineas varia = new varias_Lineas();
        varia.lineas();
        refranes_interc refranes =new refranes_interc();
        refranes.refranes();


        //lectura.lee();
    }
}

class Leer_Fichero{
    public void lee(){
        try{
            FileReader lector= new FileReader("C:\\Users\\User-01\\IdeaProjects\\ejem.txt");

            int codigo;

            while(( codigo=lector.read())!=-1) {

                char i =(char)codigo;
                System.out.println(i);

            }

            lector.close();

        }catch(IOException e) {
            System.out.println("la has liado");
            e.printStackTrace();

        }

    }
}
class escribir_fichero {
    public void escri() {
        try {
            FileWriter escritor = new FileWriter("C:\\Users\\User-01\\IdeaProjects\\ejem.txt"); //para reeescritura poner un true

            escritor.write("Escribo un poco");
            escritor.close();

        } catch (IOException e) {
            System.out.println("la has liado");
            e.printStackTrace();

        }

    }
}
    class leer_buffer{
        public void leeconBuff(){
            try{
                FileReader lectura= new FileReader("C:\\Users\\User-01\\IdeaProjects\\ejem.txt");
                BufferedReader buffer= new BufferedReader(lectura);

                String codigo;

                while(( codigo=buffer.readLine())!=null) {

                    System.out.print(codigo);

                }

                lectura .close();
                buffer.close();

            }catch(IOException e) {
                System.out.println("la has liado");
                e.printStackTrace();

            }

        }
}

class escribir_Buffer {
    public void escribuff() {
        try {
            FileWriter escritor = new FileWriter("C:\\Users\\User-01\\IdeaProjects\\ejem.txt");
            BufferedWriter buff = new BufferedWriter(escritor);

            buff.write("Escribe el buffer");

            buff.close();
            escritor.close();

        } catch (IOException e) {
            System.out.println("la has liado");
            e.printStackTrace();

        }

    }
}

class binario_leer {
    public void binleer() {
        try {
            FileInputStream leer = new FileInputStream("C:\\Users\\User-01\\IdeaProjects\\logo.jpg");
            FileOutputStream copia = new FileOutputStream("C:\\Users\\User-01\\IdeaProjects\\logo_copia.jpg");
            BufferedInputStream bufferleer = new BufferedInputStream(leer);
            BufferedOutputStream buffercopia = new BufferedOutputStream(copia);

            int codigo;
            while((codigo=bufferleer.read())!=-1){
                buffercopia.write(codigo);
            }
            bufferleer.close();
            buffercopia.close();
            leer.close();
            copia.close();


        } catch (IOException e) {
            System.out.println("la has liado");
            e.printStackTrace();

        }

    }


}

class varias_Lineas{
    public void lineas() {
        try {
            FileReader lectura = new FileReader("C:\\Users\\User-01\\IdeaProjects\\ejem.txt");
            BufferedReader buffer = new BufferedReader(lectura);

            String codigo;
            int i = 0;

            while ((codigo = buffer.readLine()) != null) {

                for (int n = 0; n <codigo.length (); n ++)
                {
                    char c = codigo.charAt (n);
                    //System.out.println (c);
                    if (c==' '){
                       i= i+1;
                    }
                }

                 i=i+1;
                if (codigo.equals("")){
                    i=i-1;
                }

            }
            System.out.println(i);

            lectura.close();
            buffer.close();

        } catch (IOException e) {
            System.out.println("la has liado");
            e.printStackTrace();

        }
    }

}
class refranes_interc{

    public void refranes(){
        try {
            FileReader lectura = new FileReader("C:\\Users\\User-01\\IdeaProjects\\refranes.txt");
            BufferedReader buffer = new BufferedReader(lectura);

            System.out.println("introduce una vocal");
            Scanner sc = new Scanner(System.in);
            String a=sc.next();

           while(!a.equals("a")&&(!a.equals("e"))&&(!a.equals("i"))&&(!a.equals("o"))&&(!a.equals("u"))&&(!a.equals("A"))&&(!a.equals("E"))&&(!a.equals("I"))&&(!a.equals("O"))&&(!a.equals("U"))){
               System.out.println("introduce una vocal");
              a=sc.next();
           }
            FileWriter escritor = new FileWriter("C:\\Users\\User-01\\IdeaProjects\\refranes_CON_"+a+".txt");
            BufferedWriter buff = new BufferedWriter(escritor);

            String linea;


            while(( linea=buffer.readLine())!=null) {
                linea=(linea.replace("a",a));
                linea=(linea.replace("e",a));
                linea=(linea.replace("i",a));
                linea=(linea.replace("o",a));
                linea=(linea.replace("u",a));
                linea=(linea.replace("á",a));
                linea=(linea.replace("é",a));
                linea=(linea.replace("í",a));
                linea=(linea.replace("ó",a));
                linea=(linea.replace("ú",a));
                linea=(linea.replace("A",a));
                linea=(linea.replace("E",a));
                linea=(linea.replace("I",a));
                linea=(linea.replace("O",a));
                linea=(linea.replace("U",a));
                linea=(linea.replace("Á",a));
                linea=(linea.replace("É",a));
                linea=(linea.replace("Í",a));
                linea=(linea.replace("Ó",a));
                linea=(linea.replace("Ú",a));
                System.out.println(linea);
                buff.write(linea);
                buff.newLine();


            }
            buff.flush();
            buffer.close();
            buff.close();
            lectura .close();
            escritor.close();






            lectura.close();
            buffer.close();

        } catch (IOException e) {
            System.out.println("la has liado");
            e.printStackTrace();

        }



    }
}

