package com.practica.classes;

import com.mongodb.client.MongoDatabase;

public class CreateTableNoSQL implements com.practica.contracts.CreateTableNoSQL {
    @Override
    public void createTable(MongoDatabase mongoDb, String str) {
        if(mongoDb.getCollection(str) != null) {
            mongoDb.getCollection(str).drop();
        }

        mongoDb.createCollection(str);
    }
}
