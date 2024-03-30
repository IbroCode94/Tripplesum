package org.example;

import java.util.List;

import static org.example.Triplets.findTriplets;


public class Main {
    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 4, 5, 6, 7};
        int targetSum = 12;

        List<List<Integer>> result = findTriplets(nums, targetSum);

        System.out.println("Triplets that sum up to " + targetSum + ":");
        for (List<Integer> triplet : result) {
            System.out.println(triplet);
        }
    }
}