package gals;

public class Simbolo {
    String id;
    String tipo;
    Boolean inicializada;
    Boolean usada;
    String escopo;
    Boolean parametro;
    Integer posicao;
    Boolean vetor;
    Boolean matriz;
    Boolean refenciado;
    Boolean funcao;

    public Simbolo(String id, String tipo, Boolean inicializada, Boolean usada, String escopo, Boolean parametro, Integer posicao, Boolean vetor, Boolean matriz, Boolean refenciado, Boolean funcao) {
        this.id = id;
        this.tipo = tipo;
        this.inicializada = inicializada;
        this.usada = usada;
        this.escopo = escopo;
        this.parametro = parametro;
        this.posicao = posicao;
        this.vetor = vetor;
        this.matriz = matriz;
        this.refenciado = refenciado;
        this.funcao = funcao;
    }

    public String getId() {
        return id;
    }

    public String getTipo() {
        return tipo;
    }

    public Boolean getInicializada() {
        return inicializada;
    }

    public Boolean getUsada() {
        return usada;
    }

    public String getEscopo() {
        return escopo;
    }

    public Boolean getParametro() {
        return parametro;
    }

    public Integer getPosicao() {
        return posicao;
    }

    public Boolean getVetor() {
        return vetor;
    }

    public Boolean getMatriz() {
        return matriz;
    }

    public Boolean getRefenciado() {
        return refenciado;
    }

    public Boolean getFuncao() {
        return funcao;
    }

    @Override
    public String toString() {
        return "Simbolo{" + "id=" + id + ", tipo=" + tipo + ", inicializada=" + inicializada + ", usada=" + usada + ", escopo=" + escopo + ", parametro=" + parametro + ", posicao=" + posicao + ", vetor=" + vetor + ", matriz=" + matriz + ", refenciado=" + refenciado + ", funcao=" + funcao + '}';
    }

    
    
}
