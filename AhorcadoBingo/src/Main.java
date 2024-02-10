
public class Main {
    public static  void main(String[] args) {
        int intentos;
        char letra;
        Palabra miPalabra = new Palabra();
        intentos = miPalabra.letras_diferentes();
        Marcador miMarcador = new Marcador(intentos);
        Mensajes misMensajes = new Mensajes();

            // Se muestra el mensaje donde se indica el tema del juego
        misMensajes.mensaje_inicial();


        do {
            miMarcador.mostrarMarcador();
                miPalabra.mostrar_visible();
                // Se solicita una palabra
                letra = misMensajes.pedir_letra();
                // Se comprueba si es un acierto o un error, se actualiza el marcador y se
                // muestra el mensaje correspondiente
                if (miPalabra.buscar(letra) > 0) {
                    miMarcador.acertar(letra);


                    misMensajes.acierto();
                } else {
                    miMarcador.fallar(letra);


                    misMensajes.fallo();
                }
                System.out.println();
        } while (!miMarcador.finJuego() && !miPalabra.esta_adivinada());
            // Al terminar el juego, se muestra el mensaje de victoria o derrota
            if (miPalabra.esta_adivinada()) {
                misMensajes.ganar();
            } else
                misMensajes.perder();

            miPalabra.mostrar_visible();
    }
}