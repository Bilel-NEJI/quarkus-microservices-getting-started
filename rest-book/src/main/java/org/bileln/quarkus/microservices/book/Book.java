package org.bileln.quarkus.microservices.book;

import org.eclipse.microprofile.openapi.annotations.media.Schema;

import javax.json.bind.annotation.JsonbDateFormat;
import javax.json.bind.annotation.JsonbProperty;
import java.time.Instant;

@Schema(description = "This is a book")
public class Book {

    @JsonbProperty("isbn_13")
    @Schema(required = true)
    public String isbn13;

    @Schema(required = true)
    public String title;
    public String author;

//    @JsonbDateFormat("yyyy/MM/dd")
    @JsonbProperty("year_of_publication")
    public int yearOfPublication;
    public String genre;

    @JsonbProperty("creation_date")
    @Schema(implementation = String.class, format = "date")
    public Instant creationDate;

    @Override
    public String toString() {
        return "Book{" +
                "isbn13='" + isbn13 + '\'' +
                ", title='" + title + '\'' +
                ", author='" + author + '\'' +
                ", yearOfPublication=" + yearOfPublication +
                ", genre='" + genre + '\'' +
                ", creationDate=" + creationDate +
                '}';
    }
}
