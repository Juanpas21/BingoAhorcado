import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Mensajes {
    private BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
    Scanner sc=new Scanner(System.in);
    public void mensaje_inicial(){
            System.out.println("---- PERSONAJE DE FICCI N ----");
        }
        public char pedir_letra(){
            //IMPLEMENTAR
            System.out.println("Introduce una letra: ");
            char c=sc.next().charAt(0);
            return c;
        }
        public void acierto(){
            System.out.println("ACIERTO!");
        }

        public void fallo(){
            System.out.println("FALLO!");
        }
        public void ganar(){
            System.out.println("GANASTE !!!!!!!");
        }
        public void perder(){
            System.out.println("PERDISTE !!!!!!!");
        }
    }

