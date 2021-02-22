package com.company;

import java.util.Objects;

public class Title {
    private String title;

    @Override
    public String toString() {
        return "Title{" +
                "title='" + title + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Title)) return false;
        Title title1 = (Title) o;
        return getTitle().equals(title1.getTitle());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getTitle());
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Title(String title) {
        this.title = title;
    }
}
