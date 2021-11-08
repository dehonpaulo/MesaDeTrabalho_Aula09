package model;

public class Roupa {
    private String tamanho;
    private String tipo;
    private Boolean ehNovo;
    private Boolean importada;
    private static Integer contador = 0;

    public Roupa(String tamanho, String tipo, Boolean ehNovo, Boolean importada) {
        this.tamanho = tamanho;
        this.tipo = tipo;
        this.ehNovo = ehNovo;
        this.importada = importada;
        contador++;
        System.out.println("Contador: " + contador);
    }

    public String getTamanho() {
        return tamanho;
    }

    public void setTamanho(String tamanho) {
        this.tamanho = tamanho;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public Boolean getEhNovo() {
        return ehNovo;
    }

    public void setEhNovo(Boolean ehNovo) {
        this.ehNovo = ehNovo;
    }

    public Boolean getImportada() {
        return importada;
    }

    public void setImportada(Boolean importada) {
        this.importada = importada;
    }

    @Override
    public String toString() {
        return "Roupa{" +
                "tamanho='" + tamanho + '\'' +
                ", tipo='" + tipo + '\'' +
                ", ehNovo=" + ehNovo +
                ", importada=" + importada +
                '}';
    }

    public static Integer getContador() {
        return contador;
    }
}
