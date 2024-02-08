package com.ua.project.task6.interfaces.implementation;

import com.ua.project.task6.interfaces.IMath;

import java.util.Arrays;

public class Array implements IMath {
    private int[] array;

    public Array(int size) {
        array = new int[size];
    }
    public Array() {
        array = new int[0];
    }

    public int[] getArray() {
        return array;
    }

    public void setArray(int[] array) {
        this.array = array;
    }

    public int getElement(int index) {
        if(index < this.array.length) {
            return this.array[index];
        }

        return -1;
    }

    public void setElement(int index, int value) {
        if(index < this.array.length) {
            this.array[index] = value;
        }
    }

    public int length() {
        return this.array.length;
    }

    public void push(int value) {
        int[] tempArray = Arrays.copyOf(this.array, this.array.length + 1);
        tempArray[tempArray.length - 1] = value;
        this.array = tempArray;
    }

    public int pop() {
        if(this.array.length == 0){
            throw new ArrayStoreException("Array is empty!");
        }
        int removedInteger = this.array[this.array.length - 1];
        this.array = Arrays.copyOfRange(this.array, 0, this.array.length - 1);

        return removedInteger;
    }

    @Override
    public int max(){
        int maxValue = this.array[0];

        for (int i : this.array) {
            if(maxValue < i){
                maxValue = i;
            }
        }

        return maxValue;
    }

    @Override
    public int min(){
        int minValue = this.array[0];

        for (int i : this.array) {
            if(minValue > i){
                minValue = i;
            }
        }

        return minValue;
    }

    @Override
    public float avg(){
        int avg = 0;

        for (int i : this.array) {
            avg += i;
        }

        return (float) avg / this.array.length;
    }
}
