public class Main {
    public static void main(String[] args) {
        Baralho baralho = new Baralho();

        System.out.printf("\nBaralho antes de ser embaralhado\n\n");
        System.out.println(baralho);

        baralho.embaralhar();
        System.out.printf("\nBaralho depois de ser embaralhado\n\n");
        System.out.println(baralho);

        System.out.printf("\nCarta distribuida\n\n");
        System.out.println(baralho.distribuirCarta());

        System.out.printf("\nBaralho com menos uma carta\n\n");
        System.out.println(baralho);
    }
}
