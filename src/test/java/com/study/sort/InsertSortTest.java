package com.study.sort;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class InsertSortTest {

    @Test
    void sort() {
        InsertSort bs=new InsertSort();
        int[] arrays =new int[]{15,63,97,12,235,66};
        bs.sort(arrays);
        System.out.println(Arrays.toString(arrays));
    }
}