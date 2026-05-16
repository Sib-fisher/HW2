public class Z2 {
    public static void main(String[] args) {
        int start = 350;
        int popolnenie = 1850;
        if (popolnenie > 1000) {
        int itog = popolnenie / 100 + start + popolnenie;
        int bonus = popolnenie /100;
        System.out.println("Итоговая сумма: " + itog);
        System.out.println("Бонусные рубли: " + bonus);
        }
        else{
            int itog = popolnenie + start;
            System.out.println("Итоговая сумма: " + itog);
            System.out.println("Бонусные рубли: 0");
        }
    }
}
