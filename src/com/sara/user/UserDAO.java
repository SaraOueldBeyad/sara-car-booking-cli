package com.sara.user;

import java.util.UUID;

public class UserDAO {

    private static final User[] users;

    static {
        users = new User[] {
                new User(UUID.fromString("8ca51d2b-aaaf-4bf2-834a-e02964e10fc3"), "Sara"),
                new User(UUID.fromString("550e8400-e29b-41d4-a716-446655440000"), "Israe"),
                new User(UUID.fromString("3f2504e0-4f89-41d3-9a0c-0305e82c3301"), "Ayoub"),
                new User(UUID.fromString("6ba7b810-9dad-41d1-80b4-00c04fd430c8"), "Samira"),
                new User(UUID.fromString("123e4567-e89b-42d3-a456-426614174000"), "Abderrahim"),
        };
    }

    public static User[] getUsers() {
        return users;
    }

    public  static User getUserById(UUID id){
        User userById = null;
        for (int i = 0; i < users.length; i++) {
            if (users[i].getId().equals(id)){
                userById = users[i];
                break;
            }
        }
        return userById;
    }
}
