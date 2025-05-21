package app;

public class Main {

    public static void main(String[] args) {
        //Створюємо об'єкт класу DataRepository
        DataRepository repository = new DataRepository();

        //Створюємо об'єкт класу DataHandler
        DataHandler handler = new DataHandler();

        //Створюємо об'єкт класу UIOperator
        UIOperator uiOperator = new UIOperator();

        //Виводимо нумерований список імен
        uiOperator.getOutput(handler.formListOutput(repository.getData()));

        //Виводимо ім'я за індексом 2
        uiOperator.getOutput(handler.formOutput(repository.getData(), 2));
    }
}