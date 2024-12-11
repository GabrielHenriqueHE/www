package io.github.gabrielhenrique.creational.singleton.db;

import io.github.gabrielhenrique.creational.singleton.domain.User;

import java.util.ArrayList;
import java.util.List;

public class MyDatabaseClassic {
    private static MyDatabaseClassic instance;

    private final List<User> users = new ArrayList<>();

    private MyDatabaseClassic() {}

    public static MyDatabaseClassic getInstance() {
        if (MyDatabaseClassic.instance == null) {
            MyDatabaseClassic.instance = new MyDatabaseClassic();
        }

        return MyDatabaseClassic.instance;
    }

    public void add(User user) {
        this.users.add(user);
    }

    public void remove(int index) {
        this.users.remove(index);
    }

    public void getAll() {
        for (User user : this.users) {
            System.out.println(user);
        }
    }
}
