package com.practica.contracts;

import com.mongodb.client.MongoDatabase;

public interface ReadNoSQL {
    public void read(MongoDatabase mongoDb, String tableName);
}
