class Heroi:
    def __init__(self, nome, idade, tipo):
        self.nome = nome
        self.idade = idade
        self.tipo = tipo

    def atacar(self):
        if self.tipo == "mago":
            ataque = "magia"
        elif self.tipo == "guerreiro":
            ataque = "espada"
        elif self.tipo == "monge":
            ataque = "artes marciais"
        elif self.tipo == "ninja":
            ataque = "shuriken"
        else:
            ataque = "ataque desconhecido"

        print(f"O {self.tipo} atacou usando {ataque}")


heroi1 = Heroi("Arthas", 30, "guerreiro")
heroi2 = Heroi("Jaina", 25, "mago")
heroi3 = Heroi("Shen", 40, "ninja")

heroi1.atacar()  
heroi2.atacar()  
heroi3.atacar()  
