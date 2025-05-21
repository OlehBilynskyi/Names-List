package app;

import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;

public class DataHandler {
    //Метод формує виведення імені за індексом
    public String formOutput(List<String> list, int index) {
        try {
//Отримуємо ім'я за індексом
            String name = list.get(index);
//Формуємо рядок
            return "Name: " + name + " is in index " + index;

        } catch (IndexOutOfBoundsException e) {
//якщо індекс не правильний
            return "Wrong index";
        }
    }

    //Метод формує нумерований список імен
    public String formListOutput(List<String> list) {
        StringBuilder sb = new StringBuilder(); //для побудови рядка
        AtomicInteger count = new AtomicInteger(1); //лічильник з 1

        for (String name : list) {
            //Додаємо кожне ім'я з номером до рядка
            sb.append(String.format("%d) %s%n", count.getAndIncrement(), name));
        }
//Повертаємо повний рядок з заголовком
        return "Names:\n" + sb;
    }
}