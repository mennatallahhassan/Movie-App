package com.example.movieapp;

public class Movie {

        private String title;
        private String description;
        private int image;

        public String getTitle() {
            return title;
        }



        public String getDescription() {
            return description;
        }



        public int getImage() {
            return image;
        }

        public Movie(String title, String description, int image) {
            this.title = title;
            this.description = description;
            this.image = image;
        }
    }

