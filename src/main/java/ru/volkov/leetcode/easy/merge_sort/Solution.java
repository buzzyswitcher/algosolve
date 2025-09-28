package ru.volkov.leetcode.easy.merge_sort;

import java.util.Arrays;

public class Solution {

    public void mergeSort(int[] array) {
        mergeSortProcess(array);

        System.out.println(Arrays.toString(array));
    }

    public void mergeSortProcess(int[] arr) {
        // Если массив слишком маленький, нет смысла его дальше делить
        if (arr.length < 2) {
            return;
        }

        // Делим массив на две части
        int mid = arr.length / 2;
        int[] left = Arrays.copyOfRange(arr, 0, mid); // Левая половина массива
        int[] right = Arrays.copyOfRange(arr, mid, arr.length); // Правая половина массива

        // Рекурсивно сортируем обе части
        mergeSort(left);
        mergeSort(right);

        // Сливаем отсортированные части
        merge(arr, left, right);
    }

    public void merge(int[] arr, int[] left, int[] right) {
        int i = 0, j = 0, k = 0;

        // Сравниваем элементы из левого и правого массивов и записываем в исходный массив
        while (i < left.length && j < right.length) {
            if (left[i] <= right[j]) {
                arr[k++] = left[i++];  // Берем элемент из левого массива
            } else {
                arr[k++] = right[j++]; // Берем элемент из правого массива
            }
        }

        // Если остались элементы в левом массиве, добавляем их
        while (i < left.length) {
            arr[k++] = left[i++];
        }

        // Если остались элементы в правом массиве, добавляем их
        while (j < right.length) {
            arr[k++] = right[j++];
        }
    }
 }
