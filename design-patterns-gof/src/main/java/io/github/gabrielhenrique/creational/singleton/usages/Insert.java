package io.github.gabrielhenrique.creational.singleton.usages;

import io.github.gabrielhenrique.creational.singleton.db.MyDatabaseClassic;
import io.github.gabrielhenrique.creational.singleton.domain.User;

public class Insert {

    private final MyDatabaseClassic connection = MyDatabaseClassic.getInstance();

    public Insert() {}

    public void add(User user) {
        this.connection.add(user);
    }
}
