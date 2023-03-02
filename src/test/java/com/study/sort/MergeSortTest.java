package com.study.sort;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class MergeSortTest {

    @Test
    void sort() {
        MergeSort bs=new MergeSort();
        Integer[] array = new Integer[]{15,63,97,12,235,66};
        //临时数组
        Integer[] temp = new Integer[array.length];
        bs.sortG(array,temp,0,array.length-1);
        System.out.println(Arrays.toString(array));
    }
}