package app;

import java.util.ArrayList;
import java.util.List;


public class DataRepository {
    //Метод повертає список імен
    public List<String> getData() {
        //Створюємо новий список типу ArrayList
        List<String> list = new ArrayList<>();

//Додаємо імена до списку
        list.add("Alice");
        list.add("Bob");
        list.add("Lucy");
        list.add("Denis");
        list.add("Tom");

        //Повертаємо список
        return list;
    }
}