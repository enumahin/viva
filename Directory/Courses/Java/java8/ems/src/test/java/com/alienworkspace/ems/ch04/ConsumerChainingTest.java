package com.alienworkspace.ems.ch04;


import com.alienworkspace.ems.model.Response;

import java.util.function.Consumer;

public class ConsumerChainingTest {

    public static void main(String[] args) {
        Response response = getResponse();

        // void accept(T t);

        Consumer<Response> kafka = (Response r) -> sendMessage(r);
        Consumer<Response> db = (Response r) -> storeInDB(r);


        // Compose them.
        Consumer<Response> chainResponse = kafka.andThen(db);

        processResponse(chainResponse, response);
    }

    private static void processResponse(Consumer<Response> operation, Response r) {
        operation.accept(r);

    }

    private static Response getResponse() {
        return new Response(404, "Resource not found");

    }

    private static void sendMessage(Response r) {
        System.out.println("Sending response to kafka...");
    }

    private static void storeInDB(Response r) {
        System.out.println("Storing response in db...");
    }
}
