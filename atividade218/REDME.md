Este código demonstra o conceito de Encapsulamento em Java (um dos pilares da Programação Orientada a Objetos). Ele serve para proteger os dados internos de uma classe, controlando exatamente como eles podem ser lidos ou alterados pelo resto do programa.

Aqui está o detalhamento de cada parte:

    private String nome; e private int idade;: Declara as características (atributos) da pessoa. A palavra private esconde essas variáveis do mundo exterior. Isso significa que nenhuma outra classe consegue alterar o nome ou a idade diretamente (ex: pessoa.nome = "João"; vai dar erro).

    public String getNome() (Getter): É uma porta de leitura. Como o atributo original está trancado (private), o programa usa esse método público para descobrir qual é o nome guardado na variável, sem correr o risco de alterá-lo por acidente.

    public void setNome(String nome) (Setter): É uma porta de escrita controlada. Se outra classe quiser mudar o nome da pessoa, precisa passar por este método. A grande vantagem é que, no futuro, você pode colocar regras aqui dentro (como "não aceite nomes vazios" ou "não aceite números").

    this.nome = nome;: O this serve para desfazer a confusão de nomes iguais. this.nome é o atributo protegido da classe, enquanto o nome sozinho é a nova palavra que acabou de chegar pelo método.

CODIGO PARA VER FUNCIONANDO
    javac Main.java
administrador@zxxxx-44b839:~/Área de trabalho/atividade218$ java Main
Nome cadastrado: Carlos Silva
Idade cadastrada: 25


O código demonstra o conceito de Encapsulamento em Programação Orientada a Objetos: esconder os dados importantes e criar portas seguras (Getters e Setters) para acessá-los.

1. A Classe Main (O Ponto de Partida)

    public static void main(String[] args): É o motor do programa. Quando você manda o código rodar, o Java procura exatamente essa linha para iniciar a execução.

    Pessoa pessoa1 = new Pessoa();: Pega o molde abstrato (a classe Pessoa) e "fabrica" um objeto real na memória do computador, batizado de pessoa1.

    pessoa1.setNome(...) e pessoa1.setIdade(...): Em vez de gravar os dados diretamente nas variáveis, o programa usa os métodos Setters para enviar as informações ("Carlos Silva" e 25) para dentro do objeto.

    System.out.println(...): Imprime texto na tela. Para pegar os dados do objeto, ele usa os Getters (getNome e getIdade), que vão até o objeto, leem os dados que foram salvos e os trazem de volta para exibição.

2. A Classe Pessoa (O Molde)

    private String nome; e private int idade;: São os atributos (características) da pessoa. A palavra private tranca essas variáveis em um "cofre". Nenhuma outra parte do código consegue ler ou alterar essas variáveis diretamente, o que evita que os dados sejam corrompidos.

    getNome() e getIdade() (Os Getters): São métodos de leitura. Eles simplesmente pegam o que está guardado no atributo privado e devolvem (return) para quem pediu.

    setNome(...) e setIdade(...) (Os Setters): São os métodos de gravação. Eles recebem um valor de fora e o guardam nas variáveis da classe. O comando this.nome = nome significa: "pegue o atributo da classe (this.nome) e guarde nele o valor que acabou de chegar no parâmetro (nome)".

    O bloco if (idade >= 0): Aqui está a maior vantagem dos Setters. Como a variável idade é privada, a única forma do sistema alterá-la é passando por este método. O if serve como um segurança na porta: ele verifica se a idade faz sentido numérico antes de autorizar a gravação, impedindo que o sistema registre acidentalmente alguém com -5 anos.

Quer ver como adicionar um Construtor nessa classe?