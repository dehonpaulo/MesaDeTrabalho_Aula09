import model.Roupa;

import java.util.HashMap;
import java.util.Map;

public class RoupaFactory {
    private Integer numeroDePedidos;
    private static Map<String, Roupa> flyweight = new HashMap<>();

    public RoupaFactory() {
        this.numeroDePedidos = 0;
    }

    public Roupa buscarRoupa(String tamanho, String tipo, Boolean ehNovo, Boolean importada) {
        String id = "tipo:" + tipo;

        if(!flyweight.containsKey(id)) {
            flyweight.put(id, new Roupa(tamanho, tipo, ehNovo, importada));
            System.out.println("Nova roupa criada!");
        }

        this.numeroDePedidos++;
        return flyweight.get(id);
    }

    // número de vezes que a factory foi chamada
    public Integer getNumeroDePedidos() {
        return this.numeroDePedidos;
    }

    // quantidade de objetos do tipo Roupa instanciados
    public Integer getTamanhoDaFabrica() {
        return Roupa.getContador();
    }
}
