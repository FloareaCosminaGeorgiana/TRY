package com.practica.contracts;

import com.mongodb.MongoClient;

public interface CloseConnectionNoSQL {
    public void close(MongoClient mongoClient );
}
