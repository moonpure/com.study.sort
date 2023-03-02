package com.study.sort;

import java.util.Comparator;

/**
 * 冒泡排序
 */
public class BubbleSort {
    public void Sort(int[] arrays) {
        for (int i = 0; i < arrays.length - 1; i++) {
//            控制比较次数,三者交换，实现排序
            for (int j = 0; j < arrays.length - 1 - i; j++) {
                if (arrays[j] > arrays[j + 1]) {
                    int temp = 0;//类似空桶
                    temp = arrays[j]; //A桶中水倒入空桶C中
                    arrays[j] = arrays[j + 1];//把B桶的水倒入A桶中
                    arrays[j + 1] = temp;//把C桶的水倒入B桶中
                }
            }

        }
    }

    /**
     * 使用Comparable接口的泛型冒泡排序
     */
    public <T extends Comparable<T>> void SortG(T[] list) {
        for (int i = 1; i < list.length; i++) {
            for (int j = 0; j < list.length - i; j++)
                if (list[j].compareTo(list[j + 1]) > 0) {
                    T temp = list[j];
                    list[j] = list[j + 1];
                    list[j + 1] = temp;
                }
        }
    }

    /**
     * 使用Comparator接口的泛型冒泡排序
     */
    public static <E> void SortG(E[] list, Comparator<? super E> comparator) {
        for (int i = 1; i < list.length; i++) {
            for (int j = 0; j < list.length - i; j++)
                if (comparator.compare(list[j], list[j + 1]) > 0) {
                    E temp = list[j];
                    list[j] = list[j + 1];
                    list[j + 1] = temp;
                }
        }
    }

}
