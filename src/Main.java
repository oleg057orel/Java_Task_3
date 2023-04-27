import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        float clientBalance = 100.5F; //Начальный баланс клиента
        float upBalance = 800; //Стоимость одного бонуса
        float finalClientBalance = (clientBalance + upBalance);
        int bonus;
//        System.out.println("Счёт после пополнения: "+ (finalClientBalance));

        if (upBalance >= 1000) {
            bonus = (int) upBalance / 100;
            System.out.println("Полученный бонус: "+ (bonus));
            System.out.println("Ваш счёт равен: "+ (bonus + clientBalance + upBalance));
        } else {
            System.out.println("Ваш счёт равен: "+ (clientBalance + upBalance));
            System.out.println("Полученный бонус: "+ ( bonus = 0) +" Для получения бонусов, пожалуйста пополниете счёт более чем на 1000р");
        }
    }
}