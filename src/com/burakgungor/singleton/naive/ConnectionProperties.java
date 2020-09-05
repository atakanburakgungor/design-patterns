package com.burakgungor.singleton.naive;

import java.util.Objects;

public class ConnectionProperties {
    /**
    • Make the default constructor private, to prevent other objects from using the new operator with the Singleton class.
    • Create a static creation method that acts as a constructor. Under the hood, this method calls the private constructor to
    create an object and saves it in a static field. All following calls to this method return the cached object.
    If your code has access to the Singleton class, then it’s able to call the Singleton’s static method. So whenever that
    method is called, the same object is always returned.
    */
    public static ConnectionProperties instance;
    public String databaseUrl;
    public String username;
    public String password;

    private ConnectionProperties(String databaseUrl, String username, String password) {
        this.databaseUrl = databaseUrl;
        this.username = username;
        this.password = password;
    }

    public static ConnectionProperties getProperties(String databaseUrl, String username, String password) {
        if (Objects.isNull(instance)) {
            instance = new ConnectionProperties(databaseUrl,username,password);
        }
        return instance;
    }
}
