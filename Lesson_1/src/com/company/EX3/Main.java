package com.company.EX3;

public class Main {
    public Main() {
    }

    public static void main(String[] args) {
        Main.Book book = new Main.Book(new Main.Title("Title"), new Main.Author("Author"), new Main.Content("Content"));
        book.show();
    }

    public static class Book {
        Main.Title title;
        Main.Author author;
        Main.Content content;

        public Book(Main.Title title, Main.Author author, Main.Content content) {
            this.title = title;
            this.author = author;
            this.content = content;
        }

        public void show() {
            this.title.show();
            this.author.show();
            this.content.show();
        }
    }

    static class Title {
        private String title;

        public Title(String title) {
            this.title = title;
        }

        public void show() {
            System.out.println(this.title);
        }
    }

    static class Author {
        private String author;

        public Author(String author) {
            this.author = author;
        }

        public void show() {
            System.out.println(this.author);
        }
    }

    static class Content {
        private String content;

        public Content(String content) {
            this.content = content;
        }

        public void show() {
            System.out.println(this.content);
        }
    }
}
