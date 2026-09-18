

// Classe principal onde o programa começa a rodar
public class Main {
    public static void main(String[] args) {
        // 1. Criamos (instanciamos) um objeto do tipo Pessoa
        Pessoa pessoa1 = new Pessoa();

        // 2. Usamos os SETTERS para guardar as informações de forma segura
        pessoa1.setNome("Carlos Silva");
        pessoa1.setIdade(25);

        // 3. Usamos os GETTERS para ler as informações e exibir na tela
        System.out.println("Nome cadastrado: " + pessoa1.getNome());
        System.out.println("Idade cadastrada: " + pessoa1.getIdade());
    }
}

// A classe que serve de molde (pode ficar no mesmo arquivo ou em um arquivo Pessoa.java)
class Pessoa {
    private String nome; // Só a própria classe enxerga
    private int idade;   // Só a própria classe enxerga

    // GETTER e SETTER para o Nome
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    // GETTER e SETTER para a Idade
    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        // Exemplo de regra de negócio no Setter:
        if (idade >= 0) {
            this.idade = idade;
        } else {
            System.out.println("Erro: A idade não pode ser negativa!");
        }
    }
}