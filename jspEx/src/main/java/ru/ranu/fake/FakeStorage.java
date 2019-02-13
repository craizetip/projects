package ru.ranu.fake;
import ru.ranu.models.User;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

/**
 * FakeStorage
 * Класс, реализующий паттеррн Singleton
 * Представляет собой InMemory-хранилище для получения информации о зарегистрированных пользователях
 */
public class FakeStorage {
    // переменная, которая хранит ссылку на единственный экземпляр объекта класса FakeStorage
    private static final FakeStorage storage;

    // статически инициализатор, создающий объект класса FakeStorage. Вызывается один раз при загрузке класса в JVM
    static {
        storage = new FakeStorage();
    }

    // поле-список, хранящее список пользователей системы
    private List<User> users;

    // приватный констуктор, выполняющий инициализацию списка
    private FakeStorage() {
        this.users = new ArrayList<>();
        User users1 = new User("Artem1", "123456", LocalDate.parse("1993-11-24"));
        User users2 = new User("Artem2", "123456", LocalDate.parse("1993-11-24"));
        User users3 = new User("Artem3", "123456", LocalDate.parse("1993-11-24"));

        users.add(users1);
        users.add(users2);
        users.add(users3);
    }

    // метод, предоставляющий доступ к объекту класса
    public static FakeStorage storage() {
        return storage;
    }

    // метод, возвращающий список пользователей
    public List<User> users() {
        return users;
    }
}