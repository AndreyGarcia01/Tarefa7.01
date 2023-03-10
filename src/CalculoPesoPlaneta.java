import java.util.Scanner;

public class CalculoPesoPlaneta {

    public static void main(String[] args) {
        // solicita o peso da pessoa na Terra
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite o seu peso em kg: ");
        double peso = scanner.nextDouble();

        //cria uma lista de planetas
        Planeta[] planetas = {new Mercurio(), new Venus(), new Terra(), new Marte(),
                new Jupiter(), new Saturno(), new Urano(), new Netuno()};

        // apresenta a lista de planetas disponíveis
        System.out.println("Escolha um planeta para viajar:");
        for (int i = 0; i < planetas.length; i++) {
            System.out.println(i + ". " + planetas[i].getNome());
        }

        // solicita a escolha do planeta
        System.out.print("Digite o número do planeta escolhido: ");
        int indexPlaneta = scanner.nextInt();

        if (indexPlaneta < 0 || indexPlaneta >= planetas.length) {
            System.out.println("Planeta inválido!");
        } else {
            // calcula o peso da pessoa no planeta escolhido
            double pesoPlaneta = planetas[indexPlaneta].calcularPeso(peso);
            System.out.println("Seu peso no planeta " + planetas[indexPlaneta].getNome() + " é de " + pesoPlaneta + " N.");
        }

        scanner.close();
    }
}


class Planeta {
    private String nome;
    private double gravidade;

    public Planeta(String nome, double gravidade) {
        this.nome = nome;
        this.gravidade = gravidade;
    }

    public String getNome() {
        return nome;
    }

    public double getGravidade() {
        return gravidade;
    }

    public double calcularPeso(double peso) {
        return peso * gravidade;
    }
}

class Mercurio extends Planeta {
    public Mercurio() {
        super("Mercúrio", 0.38);
    }
}

class Venus extends Planeta {
    public Venus() {
        super("Vênus", 0.91);
    }
}

class Terra extends Planeta {
    public Terra() {
        super("Terra", 1.00);
    }
}

class Marte extends Planeta {
    public Marte() {
        super("Marte", 0.38);
    }
}

class Jupiter extends Planeta {
    public Jupiter() {
        super("Júpiter", 2.34);
    }
}

class Saturno extends Planeta {
    public Saturno() {
        super("Saturno", 0.93);
    }
}

class Urano extends Planeta {
    public Urano() {
        super("Urano", 0.92);
    }
}

class Netuno extends Planeta {
    public Netuno() {
        super("Netuno", 1.12);
    }
}
