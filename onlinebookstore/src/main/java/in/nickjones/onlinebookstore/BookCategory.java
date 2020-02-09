package in.nickjones.onlinebookstore;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.*;
import java.util.Set;

@Entity
@Table(name="tbl_category")
@Getter
@Setter
@ToString
public class BookCategory {
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private Long id;
    @Column(name="category_name")
    private String categoryName;

    //refers to many to one reference in books
    @OneToMany(cascade =CascadeType.ALL,mappedBy = "category")
    private Set<Book> book;
}
