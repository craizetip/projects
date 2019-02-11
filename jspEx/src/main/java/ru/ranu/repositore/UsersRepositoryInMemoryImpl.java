package ru.ranu.repositore;

import ru.ranu.models.User;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class UsersRepositoryInMemoryImpl implements UsersRepository {
    private List<User> users;

    public UsersRepositoryInMemoryImpl(){
        this.users = new ArrayList<>();
        User users1 = new User("Artem1", "123456", LocalDate.parse("1993-11-24"));
        User users2 = new User("Artem2", "123456", LocalDate.parse("1993-11-24"));
        User users3 = new User("Artem3", "123456", LocalDate.parse("1993-11-24"));
        this.users.add(users1);
        this.users.add(users2);
        this.users.add(users3);
    }
    public List<User> findAll(){
        return this.users;
    }

    @Override
    public void save(User user) {
        users.add(user);
    }
}
