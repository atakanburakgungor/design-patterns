package com.burakgungor.singleton.naive;

public class Main {
    public static void main(String[] args) {
        singleThread();
        System.out.println("---");
        multiThread();

    }

    private static void multiThread() {
        Thread threadFoo = new Thread(new ThreadFoo());
        Thread threadBar = new Thread(new ThreadBar());
        threadFoo.start();
        threadBar.start();
    }

    private static void singleThread() {
        Singleton objectFoo = getSingleton("FOO");
        Singleton objectBar = getSingleton("BAR");
        System.out.println(objectFoo.value);
        System.out.println(objectBar.value);
    }

    private static Singleton getSingleton(String value) {
        return Singleton.getInstance(value);
    }

    private static class ThreadBar implements Runnable {
        @Override
        public void run() {
            Singleton singleton = getSingleton("BAR");
            System.out.println(singleton.value);

        }
    }

    private static class ThreadFoo implements Runnable {
        @Override
        public void run() {
            Singleton singleton = getSingleton("FOO");
            System.out.println(singleton.value);
        }
    }
}
