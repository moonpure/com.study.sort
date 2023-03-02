package com.study.sort;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.Random;

import static org.junit.jupiter.api.Assertions.*;

class QuickSortTest {

    @Test
    void sort() {
        QuickSort bs=new QuickSort();
        Integer[] arrays =new Integer[]{15,63,97,12,235,66};
        Random random = new Random();
        bs.sort3Ways(arrays,0,arrays.length-1,random);
        System.out.println(Arrays.toString(arrays));
    }
}