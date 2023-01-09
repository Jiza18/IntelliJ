package org.example;

import com.github.gerardfp.NanoServer;

public class Main {
    public static void main(String[] args) {
        NanoServer
                .create("localhost", 8002)
                .endpoint("/", (query, response) -> {
                    response.send("<h1>Hello</h1>");
                })
                .endpoint("/get", (query, response) -> {
                    response.send("<p>Query = " + query + "</p>");
                })
                .start();
    }
}