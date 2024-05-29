// Classe PessoaFisica
public class PessoaFisica extends Pessoa {
    private String cpf;

    // Construtor
    public PessoaFisica(String nome, String endereco, String cpf) {
        super(nome, endereco);
        this.cpf = cpf;
    }

    // Método getter para o CPF
    public String getCpf() {
        return cpf;
    }

    // Implementação do método abstrato calcularImpostos
    @Override
    public double calcularImpostos() {
        // Lógica para calcular impostos para pessoa física
        // (você pode adicionar sua própria lógica aqui)
        return 0.0; // Exemplo: retorna zero por enquanto
    }
}
