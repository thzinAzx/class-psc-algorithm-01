import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int alegria = 0, tristeza = 0;

        System.out.print("Quantas amizades ela fez? ");
        int amizades = sc.nextInt();
        alegria += amizades > 0 ? amizades * 10 : 0;
        tristeza += amizades == 0 ? 30 : 0;

        double soma = 0;
        for (int i = 1; i <= 3; i++) {
            System.out.print("Nota A" + i + ": ");
            soma += sc.nextDouble();
        }

        if ((soma / 3) >= 7) alegria += 50;
        else tristeza += 50;

        System.out.print("Quantos exercícios resolveu? ");
        int ex = sc.nextInt();

        alegria += ex * 10;
        tristeza += (10 - ex) * 10;

        System.out.println(alegria > tristeza
                ? "A mudança para a nova cidade foi uma experiência incrível para a Riley.\r\n"
                : "A mudança para a nova cidade foi uma experiência desagradável para a Riley.");

        sc.close();
    }
}