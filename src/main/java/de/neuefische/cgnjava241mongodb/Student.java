package de.neuefische.cgnjava241mongodb;

import org.springframework.data.mongodb.core.mapping.Document;

@Document("Students")
public record Student(String id, String name, int age) {
/**
 * Heißt ein Feld explizit id, wird es durch Spring Data
 * auf das _id Feld der MongoDB gesetzt.
 * Haben wir mal Fälle in denen dies nicht zutrifft
 * z. B. Bücher die mit isbn abgespeichert werden
 * müssen wir das jeweilige Feld (z. B. isbn) mit
 * @id annotieren, damit dies ebenfalls die automatisch
 * generierte ID von MongoDB überschreibt
 */
}
