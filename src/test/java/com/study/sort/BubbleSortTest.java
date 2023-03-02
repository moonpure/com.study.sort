package com.study.sort;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class BubbleSortTest {

    @Test
    void sort() {
        BubbleSort bs=new BubbleSort();
        Integer[] arrays =new Integer[]{15,63,97,12,235,66};
        bs.SortG(arrays);
        System.out.println(Arrays.toString(arrays));
    }
}