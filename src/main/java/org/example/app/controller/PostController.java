package org.example.app.controller;

import org.example.app.model.Post;
import org.example.app.network.JsonPlaceholderAPI;
import org.example.app.network.RetrofitInstance;

import java.io.IOException;
import java.util.List;
import java.util.Optional;

import retrofit2.Call;
import retrofit2.Response;

public class PostController {
    private JsonPlaceholderAPI api;

    public PostController() {
        api = RetrofitInstance.getRetrofitInstance().create(JsonPlaceholderAPI.class);
    }

    public Optional<List<Post>> getAllPosts() {
        Call<List<Post>> call = api.getAllPosts();
        try {
            Response<List<Post>> response = call.execute();
            if (response.isSuccessful()) {
                return Optional.ofNullable(response.body());
            } else {
                System.err.println("Failed to fetch posts: " + response.errorBody().string());
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return Optional.empty();
    }

    public Optional<Post> getPostById(int id) {
        Call<Post> call = api.getPostById(id);
        try {
            Response<Post> response = call.execute();
            if (response.isSuccessful()) {
                return Optional.ofNullable(response.body());
            } else {
                System.err.println("Failed to fetch post: " + response.errorBody().string());
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return Optional.empty();
    }
}