package com.java.MongoConnect.WebProject.Model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document("bookModel")
public class BookModel {

    @Id
    String id;
    String name;
    String authorname;

    public BookModel() {
        this.id = id;
        this.name = name;
        this.authorname = authorname;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAuthorname() {
        return authorname;
    }

    public void setAuthorname(String authorname) {
        this.authorname = authorname;
    }

    @Override
    public String toString() {
        return "BookModel{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", authorname='" + authorname + '\'' +
                '}';
    }
}
