package com.codeclan;

import java.util.ArrayList;

public class Library {
  private ArrayList<Book> catalogue;
  private int capacity;

  public Library(int capacity){
    this.catalogue = new ArrayList<>();
    this.capacity = capacity;
  }

  public int bookCount () {
    return catalogue.size();
  }

  public void addBook(Book book) {
    catalogue.add(book);
  }

  public boolean hasCapacity() {
    return capacity > catalogue.size();
  }
}
