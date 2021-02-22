package com.company;

import java.util.Objects;

public class Content {
    private String content;

    @Override
    public String toString() {
        return "Content{" +
                "content='" + content + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Content)) return false;
        Content content1 = (Content) o;
        return getContent().equals(content1.getContent());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getContent());
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public Content(String content) {
        this.content = content;
    }
}
