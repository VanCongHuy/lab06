package Lab03.QuanLySach__;

import Lab03.QuanLySach__.model.Book;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.ArrayList;
import java.util.List;

@Configuration
public class AppConfig {
    @Bean
    public List<Book>getBooks(){
        List<Book> listBooks = new ArrayList<>();
        Book boook3 = Book.builder()
                .id(3)
                .title("dac nhan tamEffective Java")
                .author("Joshua Bloch")
                .price(45.0)
                .category("Programing")
                .build();
        listBooks.add(boook3);
        Book boook2 = Book.builder()
                .id(2)
                .title("dalfadf")
                .author("fasdfadfh")
                .price(45.0)
                .category("Programing")
                .build();
        listBooks.add(boook2);
        return listBooks;
    }
}
