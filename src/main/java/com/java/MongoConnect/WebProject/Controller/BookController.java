package com.java.MongoConnect.WebProject.Controller;
import com.java.MongoConnect.WebProject.Model.BookModel;
import com.java.MongoConnect.WebProject.Model.BookRepo;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/test")
public class BookController {
    Logger logger = LoggerFactory.getLogger(getClass());
    @Autowired
    BookRepo bookRepo;

    @PostMapping( "/addbook")
    public String savebook(@RequestBody BookModel book) {
        bookRepo.save(book);
        return "book Added";

    }
    @GetMapping("/all")
    public List<BookModel> getAllBooks()  {
//           return bookservice.getall();
           List<BookModel> models = bookRepo.findAll();
        for (BookModel names:models){
            System.out.println("the books are "+names);
        }
          return models;
    }

    @GetMapping("/find/{id}")
    public Optional<BookModel> getBook(@PathVariable String id) {
        logger.info("find Book by id : "+id);
        Optional<BookModel> book = bookRepo.findById(id);
        return book;
    }

    @DeleteMapping("/delete/{id}")
    public String deleteBook(@PathVariable String id) {
        bookRepo.deleteById(id);
        return "Delete emp for id " + id;
    }
    @PutMapping("/update/{id}")
    public BookModel updateBook(@PathVariable String id, @RequestBody BookModel book) {
        logger.info("Updating movie with ID: {}", id);
        return bookRepo.save(book);
    }
    @GetMapping ("/AuthorName/{authorname}")
    public  List<BookModel>  getByAuthorName(@PathVariable String authorname){
        List<BookModel> bookModels=bookRepo.getByAuthor(authorname);
        if(bookModels.isEmpty()){
            return null;
        }else{
            return bookModels;
        }

    }

}
