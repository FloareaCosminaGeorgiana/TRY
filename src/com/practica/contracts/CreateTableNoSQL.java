package com.practica.contracts;

import com.mongodb.client.MongoDatabase;

public interface CreateTableNoSQL {
    public void createTable(MongoDatabase mongoDb, String tableName);
}
