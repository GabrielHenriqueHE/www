package io.github.gabrielhenrique.creational.singleton;

import io.github.gabrielhenrique.creational.singleton.domain.User;
import io.github.gabrielhenrique.creational.singleton.usages.Insert;
import io.github.gabrielhenrique.creational.singleton.usages.Query;

public class Main {
    public static void main(String[] args) {

        Insert insert = new Insert();
        Query query = new Query();

        insert.add(new User("Gabriel", 20));
        insert.add(new User("Luiz", 32));
        insert.add(new User("Otavio", 23));

        query.getAll();

    }
}
