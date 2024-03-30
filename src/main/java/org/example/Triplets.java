package org.example;

import java.util.*;

public class Triplets {
    public static List<List<Integer>> findTriplets(int[] nums, int targetSum) {
        List<List<Integer>> triplets = new ArrayList<>();
        Arrays.sort(nums); // Sort the array to avoid duplicates
        int n = nums.length;

        for (int i = 0; i < n - 2; i++) {
            if (i == 0 || (i > 0 && nums[i] != nums[i - 1])) {
                int left = i + 1;
                int right = n - 1;
                int target = targetSum - nums[i];

                while (left < right) {
                    if (nums[left] + nums[right] == target) {
                        triplets.add(Arrays.asList(nums[i], nums[left], nums[right]));

                        // Skip duplicates
                        while (left < right && nums[left] == nums[left + 1]) left++;
                        while (left < right && nums[right] == nums[right - 1]) right--;

                        left++;
                        right--;
                    } else if (nums[left] + nums[right] < target) {
                        left++;
                    } else {
                        right--;
                    }
                }
            }
        }

        return triplets;
    }
    }

