package org.example.app.ui;

import java.util.Scanner;

import org.example.app.controller.PostController;
import org.example.app.view.PostView;

public class PostApp {

    public static void run() {
        PostController postController = new PostController();
        PostView postView = new PostView();

        Scanner scanner = new Scanner(System.in);

        boolean exit = false;
        while (!exit) {
            System.out.println("Меню:");
            System.out.println("1. Отримати всі пости");
            System.out.println("2. Отримати пост за ID");
            System.out.println("3. Вийти");
            System.out.print("Виберіть опцію: ");

            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.println("\nОтримання всіх постів:");
                    postView.displayAllPosts(postController);
                    break;
                case 2:
                    System.out.print("\nВведіть ID поста: ");
                    int postId = scanner.nextInt();
                    System.out.println("\nОтримання поста за ID " + postId + ":");
                    postView.displayPostById(postController, postId);
                    break;
                case 3:
                    exit = true;
                    break;
                default:
                    System.out.println("Невірний вибір. Будь ласка, спробуйте ще раз.");
            }
        }
        scanner.close();
        System.out.println("Дякую за використання додатку!");
    }
}