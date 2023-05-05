package org.example.tree;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Tree> trees = new ArrayList<>();
        Tree magicTree = new Tree(){
            @Override
            public void display(){
                System.out.println("Magic tree!!!!");
            }
        };

        trees.add(magicTree);
        for (int i = 0; i < 10; i++) {
            trees.add(new Tree());
        }

        Collections.shuffle(trees);

        for (Tree tree : trees) {
            tree.display();
        }

        }







}
