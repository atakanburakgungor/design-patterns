package com.burakgungor.singleton.naive;

public class Main {
    public static void main(String[] args) {
        singleThread();
        System.out.println("---Multi");
        multiThread();

    }

    private static void multiThread() {
        Thread threadConn = new Thread(new ThreadConn());
        Thread threadConn2 = new Thread(new ThreadConn2());
        threadConn.start();
        threadConn2.start();
    }

    private static void singleThread() {
        ConnectionProperties connection = getConnection("localhost:8080", "admin", "admin");
        ConnectionProperties connection2 = getConnection("localhost:9999", "user", "user");
        System.out.println(connection.databaseUrl + " , " + connection.username + " , " + connection.password + "\n" +
                connection2.databaseUrl + " , " + connection2.username + " , " + connection2.password);
    }

    private static ConnectionProperties getConnection(String databaseUrl, String username, String password) {
        return ConnectionProperties.getProperties(databaseUrl, username, password);
    }

    private static class ThreadConn2 implements Runnable {
        @Override
        public void run() {
            ConnectionProperties connectionProperties = getConnection("localhost:8080", "admin", "admin");
            System.out.println(connectionProperties.databaseUrl + " , " + connectionProperties.username + " , " + connectionProperties.password);

        }
    }

    private static class ThreadConn implements Runnable {
        @Override
        public void run() {
            ConnectionProperties connectionProperties = getConnection("localhost:9999", "user", "user");
            System.out.println(connectionProperties.databaseUrl + " , " + connectionProperties.username + " , " + connectionProperties.password);
        }
    }
}
