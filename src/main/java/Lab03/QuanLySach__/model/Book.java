package Lab03.QuanLySach__.model;

import jakarta.validation.constraints.*;
import jdk.jshell.Snippet;
import lombok.*;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder

public class Book {
    @NotNull(message = "ID không được để trong")
    @Min(value =1, message = "ID phải là số nguyên dương lớn hơn 0")
    private int id;

    @NotBlank(message = "tiêu đề không để trống")
    @Size(max = 100, message = "tiêu đề không được vượt quá 100 ký tự")
    private String title;

    @NotBlank(message = "tác giả không để trống")
    @Size(max = 100, message = "tên tác không được vượt quá 100 ký tự")
    private String author;

    @NotNull(message = "Giá không được để trong")
    @Min(value =1, message = "giá phải là số không âm")
    private Double price;

    @NotBlank(message = "Thể loại không được để trống")
    @Pattern(regexp = "^[A-Za-z ]+$", message = "thể loiaj chi chấp nhận chữ cái và khoảng trắng ")
    private String category;

}
