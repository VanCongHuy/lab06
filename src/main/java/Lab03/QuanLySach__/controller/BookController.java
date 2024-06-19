package Lab03.QuanLySach__.controller;

import Lab03.QuanLySach__.model.Book;
import jakarta.validation.Valid;
import lombok.Data;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.naming.Binding;
import java.util.List;

@Controller
@RequestMapping("/books")
public class BookController {
    @Autowired
    private List<Book> books;

    @GetMapping
    public String listBooks(Model model) {
        model.addAttribute("books", books);
        model.addAttribute("title", "Book List");
        return "Book/list";
    }
    @GetMapping("/add")
    public String addBookForm(Model model) {
        model.addAttribute("book", new Book());
        return "Book/add";
    }

    @PostMapping("/add")
    public String addBook(@Valid @ModelAttribute("book") Book book, BindingResult result, Model model) {
        if (result.hasErrors()) {
            return "Book/add";
        }
        books.add(book);
        return "redirect:/books";
    }
}
