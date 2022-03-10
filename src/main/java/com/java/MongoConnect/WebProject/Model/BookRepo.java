package com.java.MongoConnect.WebProject.Model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface BookRepo extends MongoRepository<BookModel, String> {

    @Query("{authorname:?0}")
    List<BookModel>getByAuthor(String authorname);

}
