package com.practica.contracts;

import com.mongodb.client.MongoDatabase;

public interface InsertNoSQL {
    public void insert(MongoDatabase mongoDb, String tableName);
}
