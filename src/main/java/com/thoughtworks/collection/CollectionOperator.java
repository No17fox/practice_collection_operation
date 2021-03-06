package com.thoughtworks.collection;

import sun.reflect.generics.reflectiveObjects.NotImplementedException;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CollectionOperator {
    public List<Integer> getListByInterval(int left, int right) {
        List<Integer> list = new ArrayList<>();
        list.add(left);
        while (left != right) {
            if (left < right) {
                left++;
            } else {
                left--;
            }
            list.add(left);
        }
        return list;
    }

    public List<Integer> getEvenListByIntervals(int left, int right) {
        List<Integer> list = this.getListByInterval(left, right);
        List<Integer> evenList = new ArrayList<>();
        for (Integer integer : list) {
            if (0 == integer % 2) {
                evenList.add(integer);
            }
        }
        return evenList;
    }

    public List<Integer> popEvenElments(int[] array) {
        List<Integer> evenElements = new ArrayList<>();
        for (int element : array) {
            if (0 == element % 2) {
                evenElements.add(element);
            }
        }
        return evenElements;
    }

    public int popLastElment(int[] array) {
        return array[array.length - 1];
    }

    public List<Integer> popCommonElement(int[] firstArray, int[] secondArray) {
        List<Integer> commonElements = new ArrayList<>();
        for (int i : firstArray) {
            for (int j : secondArray) {
                if (i == j) {
                    commonElements.add(i);
                }
            }
        }
        return commonElements;
    }

    public List<Integer> addUncommonElement(Integer[] firstArray, Integer[] secondArray) {
        List<Integer> firstList = new ArrayList<>(Arrays.asList(firstArray));
        for (Integer integer : secondArray) {
            if (!firstList.contains(integer)) {
                firstList.add(integer);
            }
        }
        return firstList;
    }
}
