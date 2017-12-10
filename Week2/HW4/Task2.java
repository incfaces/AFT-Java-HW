package Week2.HW4;

import java.util.ArrayList;

/**
 * 2. Формируется новогодний подарок. Он может включать в себя разные сладости (Candy, Jellybean, etc.)
 * У каждой сладости есть название, вес, цена и свой уникальный параметр.
 * Необходимо собрать подарок из сладостей. Найти общий вес подарка,
 * общую стоимость подарка и вывести на консоль информацию о всех сладостях в подарке.
 */


public class Task2 {

    static class Sweets {
        private String name;
        private int price;
        private int weight;
        private String param;

        public Sweets(String name, int price, int weight, String param) {
            this.name = name;
            this.price = price;
            this.weight = weight;
            this.param = param;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public int getPrice() {
            return price;
        }

        public void setPrice(int price) {
            this.price = price;
        }

        public int getWeight() {
            return weight;
        }

        public void setWeight(int weight) {
            this.weight = weight;
        }

        public String getParam() {
            return param;
        }

        public void setParam(String param) {
            this.param = param;
        }

    }

    public static void main(String[] args) {

        int totalW = 0;
        int totalP = 0;

        Sweets chocolate = new Sweets("Nuts", 40, 80, "yellow");
        Sweets cookies = new Sweets("Twix", 30, 60, "pair");
        Sweets cake = new Sweets("Ekler", 45, 50, "tasty");

        Sweets [] gift = {chocolate, cookies, cake};


        for (Sweets i: gift) {
            System.out.println("Название - " + i.getName() + "," + " Цена - " + i.getPrice()+ "," + " Вес - " + i.getWeight());
            totalP += i.getPrice();
            totalW += i.getWeight();
        }
        System.out.println("\nОбщая цена подарка - " + totalP + " и вес - " + totalW);
    }
}
