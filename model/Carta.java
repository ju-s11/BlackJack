class Carta {
    private String valor;
    private String naipe;

    public Carta(String valor, String naipe) {
        this.valor = valor;
        this.naipe = naipe;
    }

    public String getValor() {
        return valor;
    }

    public String getNaipe() {
        return naipe;
    }

    public int getValorNumerico() {
        if (valor.equals("A")) {
            return 11;  // As vale 11 pontos inicialmente
        } else if (valor.equals("K") || valor.equals("Q") || valor.equals("J")) {
            return 10;  // Reis, Damas e Valetes valem 10 pontos
        } else {
            return Integer.parseInt(valor);  // Cartas numéricas valem seu valor
        }
    }


    public String toString() {
        return valor + " de " + naipe;
    }
}
