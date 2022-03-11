package com.practica.contracts;

import com.mongodb.MongoClient;

public interface CreateConnectionNoSQL {
    public MongoClient createConnection();
}
