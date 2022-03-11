package com.practica.classes;

import com.mongodb.MongoClient;

public class CloseConnectionNoSQL implements com.practica.contracts.CloseConnectionNoSQL {
    @Override
    public void close(MongoClient mongoClient) {
        mongoClient.close();
    }
}
