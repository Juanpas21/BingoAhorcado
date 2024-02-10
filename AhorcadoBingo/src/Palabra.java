public class Palabra {

    private String p_oculta;
        private char[] p_visible;

    public Palabra() {
        String[] palabras = { "BATMAN", "SUPERMAN", "HULK", "CENICIENTA", "SPIDERMAN", "PINOCHO", "LOBEZNO" };
        int n = (int) Math.floor(Math.random() * palabras.length);
        p_oculta = palabras[n];
        p_visible = new char[p_oculta.length()];
        for (int i = 0; i < p_visible.length; i++) {
            p_visible[i] = '_';
        }
    }

    public boolean esta_adivinada() {
        // IMPLEMENTAR
        boolean n = false;


        String cadena = new String(p_visible);

        if (cadena.equals(p_oculta)) {
            n=true;

        }

        return n;
    }
    public void mostrar_visible() {
        // IMPLEMENTAR
        for (int i = 0; i < p_visible.length; i++) {

            System.out.print(p_visible[i] + " ");

        }
        System.out.println();
    }
    public int buscar(char c) {
        // IMPLEMENTAR
        int num = 0;
        for (int i = 0; i < p_oculta.length(); i++) {

            if (c == p_oculta.charAt(i)) {
                num++;
                p_visible[i] = c;

            }

        }
        return num;
    }
    public int letras_diferentes() {
        // IMPLEMENTAR
        int num = 0;
        char b;
        for (int i = 0; i < p_oculta.length(); i++) {
            b = p_oculta.charAt(i);
            for (int j = 0; j < p_oculta.length(); j++) {
                if (b == p_oculta.charAt(j)) {
                    num++;
                }

            }

        }

        return num;
    }
}

