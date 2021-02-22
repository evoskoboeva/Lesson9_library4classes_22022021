package com.company;

import java.util.Objects;

public class Author {
    private String autor;

    @Override
    public String toString() {
        return "Author{" +
                "autor='" + autor + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Author)) return false;
        Author author = (Author) o;
        return getAutor().equals(author.getAutor());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getAutor());
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public Author(String autor) {
        this.autor = autor;
    }
}
