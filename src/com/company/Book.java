package com.company;

public class Book {

    Author author;
    Title title;
    Content content;

    public Book(Author author, Title title, Content content) {
        this.author = author;
        this.title = title;
        this.content = content;
    }

    public Book(String author, String title, String content) {
        this.author = new Author(author);
        this.title = new Title(title);
        this.content = new Content(content);
    }

    @Override
    public String toString() {
        return "Book{" +
                "author=" + author +
                ", title=" + title +
                ", content=" + content +
                '}';
    }

    public Author getAuthor() {
        return author;
    }

    public void setAuthor(Author author) {
        this.author = author;
    }

    public Title getTitle() {
        return title;
    }

    public void setTitle(Title title) {
        this.title = title;
    }

    public Content getContent() {
        return content;
    }

    public void setContent(Content content) {
        this.content = content;
    }
}
