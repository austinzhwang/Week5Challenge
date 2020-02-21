package week5challenge.demo;

import com.sun.istack.NotNull;
import org.hibernate.annotations.Type;
import org.hibernate.validator.constraints.Length;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotEmpty;

@Entity
public class Job {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    @NotNull
    @NotEmpty
    private String title;

    @NotNull
    @NotEmpty
    @Type(type="text")
    private String description;

    @NotNull
    @NotEmpty
    private String postedDate;

    @NotNull
    @NotEmpty
    private String author;

    @NotNull
    private long phone;

    public Job() {

    }

    public Job(@NotEmpty String title, @NotEmpty String description, @NotEmpty String postedDate,
               @NotEmpty String author, long phone) {
        this.title = title;
        this.description = description;
        this.postedDate = postedDate;
        this.author = author;
        this.phone = phone;
    }


    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getPostedDate() {
        return postedDate;
    }

    public void setPostedDate(String postedDate) {
        this.postedDate = postedDate;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public long getPhone() {
        return phone;
    }

    public void setPhone(long phone) {
        this.phone = phone;
    }
}
