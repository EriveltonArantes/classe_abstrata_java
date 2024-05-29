// Classe PessoaJuridica
public class PessoaJuridica extends Pessoa {
    private String cnpj;

    // Construtor
    public PessoaJuridica(String nome, String endereco, String cnpj) {
        super(nome, endereco);
        this.cnpj = cnpj;
    }

    // Método getter para o CNPJ
    public String getCnpj() {
        return cnpj;
    }

    // Implementação do método abstrato calcularImpostos
    @Override
    public double calcularImpostos() {
        // Lógica para calcular impostos para pessoa jurídica
        // (você pode adicionar sua própria lógica aqui)
        return 0.0; // Exemplo: retorna zero por enquanto
    }
}
