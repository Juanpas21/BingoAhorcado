import java.util.ArrayList;

public class Marcador {

        private int numAciertos, numFallos, intentos, puntos;
        private ArrayList<Character> listaAciertos, listaFallos;

        public Marcador(int intentos) {
            this.numAciertos = 0;
            this.numFallos = 0;
            this.intentos = intentos;
            this.puntos = 0;
            listaAciertos = new ArrayList<Character>();
            listaFallos = new ArrayList<Character>();
        }

        private void actualizar() {
            // IMPLEMENTAR;
            this.numAciertos = this.numAciertos + 5;
            this.numFallos = this.numFallos - 1;
        }


        private void mostrarAciertoyFallos() {
            // IMPLEMENTAR
            if (!listaAciertos.isEmpty()) {
                System.out.print("LETRAS ACERTADAS--->");
                for (int i = 0; i < listaAciertos.size(); i++) {
                    System.out.print(listaAciertos.get(i) + " ");
                }
                System.out.println();
            }

            if (!listaFallos.isEmpty()) {
                System.out.print("LETRAS FALLADAS--->");
                for (int i = 0; i < listaFallos.size(); i++) {
                    System.out.print(listaFallos.get(i) + " ");
                }
                System.out.println();
            }

        }


        public void mostrarMarcador() {
            // IMPLEMENTAR

            int intentos_res = intentos - numFallos;
            mostrarAciertoyFallos();
            int marcador = numAciertos - numFallos;
            System.out.println("--->PUNTOS= " + marcador);
            System.out.println("--->Intentos= " + intentos_res);

        }

        public void acertar(char letra) {
            // IMPLEMENTAR

            numAciertos++;
            puntos++;
            listaAciertos.add(letra);

        }

        public void fallar(char letra) {
            // IMPLEMENTAR

            numAciertos--;
            intentos--;
            puntos = puntos;
            listaFallos.add(letra);

        }
        public boolean finJuego() {
            // IMPLEMENTAR
            boolean fin = false;
            if (intentos == 0) {
                fin = true;
            }

            return fin;
     }
}

