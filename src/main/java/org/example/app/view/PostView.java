package org.example.app.view;

import org.example.app.controller.PostController;
import org.example.app.model.Post;

import java.util.List;
import java.util.Optional;

import org.example.app.controller.PostController;
import org.example.app.model.Post;

import java.util.List;
import java.util.Optional;

public class PostView {

    public void displayAllPosts(PostController postController) {
        Optional<List<Post>> allPostsOptional = postController.getAllPosts();
        allPostsOptional.ifPresentOrElse(
                posts -> posts.forEach(System.out::println),
                () -> System.out.println("Пости не знайдено.")
        );
    }

    public void displayPostById(PostController postController, int postId) {
        Optional<Post> postByIdOptional = postController.getPostById(postId);
        postByIdOptional.ifPresentOrElse(
                post -> System.out.println("Пост з ID " + postId + ": " + post),
                () -> System.out.println("Пост з ID " + postId + " не знайдено.")
        );
    }
}