package de.neuefische.cgnjava241mongodb;

import org.springframework.data.mongodb.core.mapping.Document;

@Document("Students")
public record Student(String id, String name, int age) {
}
