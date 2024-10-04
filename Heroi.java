public class Heroi {
    private String nome;
    private int idade;
    private String tipo;

    public Heroi(String nome, int idade, String tipo) {
        this.nome = nome;
        this.idade = idade;
        this.tipo = tipo;
    }

    public void atacar() {
        String ataque;
        switch (tipo.toLowerCase()) {
            case "mago":
                ataque = "magia";
                break;
            case "guerreiro":
                ataque = "espada";
                break;
            case "monge":
                ataque = "artes marciais";
                break;
            case "ninja":
                ataque = "shuriken";
                break;
            default:
                ataque = "ataque desconhecido";
        }
        System.out.println("O " + tipo + " atacou usando " + ataque);
    }

    public static void main(String[] args) {
        Heroi heroi1 = new Heroi("Arthas", 30, "guerreiro");
        Heroi heroi2 = new Heroi("Jaina", 25, "mago");
        Heroi heroi3 = new Heroi("Shen", 40, "ninja");

        heroi1.atacar();  
        heroi2.atacar();  
        heroi3.atacar(); 
    }
}
