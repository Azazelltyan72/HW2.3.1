public class Main {
    public static void main(String[] args) {
        System.out.println("Task 1");
        Human maksim = new Human("Максим", "Минск", 1987, "на должности бренд-менеджера");
        System.out.println(maksim);
        Human anya = new Human("Аня", "Москва", 1993, "на должности методиста образовательных программ");
        System.out.println(anya);
        Human katya = new Human("Катя", "Калининград", 1994, "на должности продакт-менеджера");
        System.out.println(katya);
        Human artem = new Human("Артём", "Москва", 1995, "на должности директора по развитию бизнеса");
        System.out.println(artem);
        Human vlad = new Human("Владимир", "Казань", 2001, "нигде не работаю");
        System.out.println(vlad);
        System.out.println();
        System.out.println("Task 2");
        Flower[] flowers = new Flower[10];
        Flower rose = new Flower("Роза", null, "Голландия", 35.59, 0);
        Flower chrysanthemum = new Flower("Хризантема", null, null, 15, 5);
        Flower pion = new Flower("Пион", null, "Англия", 69.9, 1);
        Flower gypsophila = new Flower("Гипсофила", null, "Турция", 19.5, 10);
        System.out.println(rose);
        System.out.println(chrysanthemum);
        System.out.println(pion);
        System.out.println(gypsophila);
        System.out.println();
        System.out.println("Дополнительная часть задания");
        flowers[0] = rose;
        flowers[1] = rose;
        flowers[2] = rose;
        flowers[3] = gypsophila;
        flowers[4] = gypsophila;
        flowers[5] = gypsophila;
        flowers[6] = gypsophila;

        flowers[7] = chrysanthemum;

        calculate(flowers);
    }

    private static void calculate(Flower[] flowers) {
        int lifeSpan = Integer.MAX_VALUE;
        double sum = 0;
        String text = "В букете есть: \n";
        for (int i = 0; i < flowers.length; i++) {
            if (flowers[i] != null) {
                text += flowers[i].getFlowerName() + " , страна:  " + flowers[i].getCountry() + " \n";
                if (flowers[i].getLifeSpan() < lifeSpan) {
                    lifeSpan = flowers[i].getLifeSpan();
                }
                sum += flowers[i].getCost();
            }
        }
        sum = sum * 1.10;
        text += "\n";
        text += "Сумма букета = " + String.format(" %.2f ", sum);
        text += "\n";
        text += "Срок годности: " + lifeSpan;
        System.out.println(text);
    }
}