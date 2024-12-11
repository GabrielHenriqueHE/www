package io.github.gabrielhenrique.creational.singleton.usages;

import io.github.gabrielhenrique.creational.singleton.db.MyDatabaseClassic;

public class Query {

    private final MyDatabaseClassic connection = MyDatabaseClassic.getInstance();

    public Query() {}

    public void getAll() {
        this.connection.getAll();
    }
}
