package com.spring.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import antlr.collections.List;

@Entity
@Table(name="bookcategories")
public class Category { // Category has list of Books
@Id
private int cid;
@Column(name="category")
private String categoryName;
@OneToMany(mappedBy="category")
List books;
public int getCid() {
	return cid;
}
public void setCid(int cid) {
	this.cid = cid;
}
public String getCategoryName() {
	return categoryName;
}
public void setCategoryName(String categoryName) {
	this.categoryName = categoryName;
}
public List getBooks() {
	return books;
}
public void setBooks(List books) {
	this.books = books;
}


}
