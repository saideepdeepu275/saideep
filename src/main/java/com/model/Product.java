package com.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.persistence.Table;

@Entity
@Table
public class Product
{
@Id
@GeneratedValue
int productId;
String productName,productDesc;
int stock,price,catId,supId;

@Lob
private byte[] image;

public byte[] getImage()
{
	return image;
}
public void setImage(byte[] image)
{
	this.image = image;
}



public int getProductId()
{
	return productId;
}
public void setProductId(int productId)
{
	this.productId = productId;
}
public String getProductName() 
{
	return productName;
}
public void setProductName(String productName)
{
	this.productName = productName;
}
public String getProductDesc() 
{
	return productDesc;
}
public void setProductDesc(String productDesc)
{
	this.productDesc = productDesc;
}
public int getStock() {
	return stock;
}
public void setStock(int stock)
{
	this.stock = stock;
}
public int getPrice()
{
	return price;
}
public void setPrice(int price)
{
	this.price = price;
}
public int getCatId() 
{
	return catId;
}
public void setCatId(int catId)
{
	this.catId = catId;
}
public int getsupId()
{
	return supId;
}
public void setsupId(int supId)
{
	this.supId = supId;
}




}