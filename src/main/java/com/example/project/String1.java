package com.example.project;

public class String1 {
    private char[] str;
    private int size;

    public String1() {
        size = -1;
        str = new char[80];
    }

    public void append(char c) {
        if (size + 1 >= str.length) {
            throw new ArrayIndexOutOfBoundsException("Cannot append more characters, array is full.");
        }
        str[++size] = c;
    }

    public char remove() {
        if (size < 0) {
            throw new IllegalStateException("No characters to remove.");
        }
        return str[size--];
    }

    public char getChar(int i) {
        if (i < 0 || i > size) {
            throw new IndexOutOfBoundsException("Index out of bounds.");
        }
        return str[i];
    }

    public int length() {
        return size + 1;
    }

    public void makeEmpty() {
        size = -1;
    }

    public void concat(String1 s) {
        for (int i = 0; i < s.length(); i++) {
            append(s.getChar(i));
        }
    }

  public boolean equal(String1 s) {
        if (s == null || this.size != s.size) {
            return false;
        }
        for (int i = 0; i <= this.size; i++) {
            if (this.str[i] != s.getChar(i)) {
                return false;
            }
        }
        return true;
    }

    public void reverse() {
        if (size < 0) {
            return; // No characters to reverse
        }
        int left = 0;
        int right = size;
        while (left < right) {
            char temp = str[left];
            str[left] = str[right];
            str[right] = temp;
            left++;
            right--;
        }
    }
}
