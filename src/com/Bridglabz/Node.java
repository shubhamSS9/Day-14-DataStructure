package com.Bridglabz;

public class Node<T> {
    T data;
    Node<T> next;

    public Node() {
    }

    public Node(T data){
        this.setData(data);

    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }
}
