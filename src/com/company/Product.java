package com.company;

public class Product {
    private String nameOfProduct;

    public Product(String nameOfProduct){
        this.nameOfProduct = nameOfProduct;
    }

    public String getNameOfProduct() {
        return nameOfProduct;
    }

    public void setNameOfProduct(String nameOfProduct) {
        this.nameOfProduct = nameOfProduct;
    }

    @Override
    public boolean equals(Object obj) {
        Product product = (Product)obj;
        return this.nameOfProduct.equals(product.nameOfProduct);
    }

    @Override
    public int hashCode() {
       return this.nameOfProduct.hashCode();
    }
}
