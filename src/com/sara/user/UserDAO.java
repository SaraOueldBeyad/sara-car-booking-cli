package com.sara.user;

import java.util.UUID;

public class UserDAO {

    private static final User[] users;

    static {
        users = new User[] {
                new User(UUID.randomUUID(), "Sara"),
                new User(UUID.randomUUID(), "Israe"),
                new User(UUID.randomUUID(), "Ayoub"),
                new User(UUID.randomUUID(), "Samira"),
                new User(UUID.randomUUID(), "Abderrahim"),
        };
    }

    public static User[] getUsers() {
        return users;
    }
}
