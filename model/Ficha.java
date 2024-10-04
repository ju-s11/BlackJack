class Ficha { 
    private int valor;
    private int quantidade; 

    public Ficha(int valor, int quantidade) { 
        this.valor = valor;
        this.quantidade = quantidade; 
    } 

    public int getValor() { 
        return valor; 
    }

    public int getQuantidade( ) { 
        return quantidade;
    }
    
    public void ganhar(int quantidade) {
        this.quantidade += quantidade;
    } 
    
    public boolean perder(int quantidade) {
        if (this.quantidade >= quantidade) {
        this.quantidade -= quantidade; return true;
        }

        else {
            return false;
        }
    }
}
    