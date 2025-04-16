package com.mathworks.tests;

import com.mongodb.client.*;
import org.bson.Document;
import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.*;

public class MongoDBValidationTest {

    @Test
    public void testStudentStatusInMongoDB() {
        MongoClient mongoClient = MongoClients.create("mongodb://localhost:27017");
        MongoDatabase db = mongoClient.getDatabase("university");
        MongoCollection<Document> students = db.getCollection("students");

        Document student = students.find(new Document("name", "John Doe")).first();
        assertNotNull(student);
        assertEquals("Admitted", student.getString("status"));
    }
}
