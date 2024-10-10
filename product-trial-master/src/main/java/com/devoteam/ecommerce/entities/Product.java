package com.devoteam.ecommerce.entities;

import java.io.Serializable;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;


@Entity
@Table(name = "Produit")
/*@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString*/
public class Product implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 6982336043404073430L;
	/**
	 * Attributes
	 */
	@Id @GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	@Column(name = "CODE_Produit", nullable = false)
    private String code;
	@Column(name = "NOM_Produit", nullable = false)
    private String name;
	@Column(name = "Description_Produit", nullable = true)
    private String description;
	@Column(name = "Image_Produit", nullable = true)
    private String image;
	@Column(name = "Categorie_Produit", nullable = false)
    private String category;
	@Column(name = "Pice_Produit", nullable = false)
    private double price;
	@Column(name = "Quantity_Produit", nullable = false)
    private int quantity;
	@Column(name = "InternalReference_Produit", nullable = false)
    private String internalReference;
	@Column(name = "ShellId_Produit", nullable = false)
    private int shellId;
	@Column(name = "StatusStock_Produit", nullable = false)
    private StatusStock inventoryStatus;
	@Column(name = "rating_Produit", nullable = false)
    private int rating;
	@Column(name = "createdAt_Produit", nullable = false)
    private int createdAt;
	@Column(name = "updatedAt_Produit", nullable = false)
    private int updatedAt;
    /**
     * 
     */
    public enum StatusStock {
        INSTOCK,
        LOWSTOCK,
        OUTOFSTOCK
    }
    /**
     * Getters & Setters
     * @return
     */
	public String getCode() {
		return code;
	}
	public void setCode(String code) {
		this.code = code;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public String getImage() {
		return image;
	}
	public void setImage(String image) {
		this.image = image;
	}
	public String getCategory() {
		return category;
	}
	public void setCategory(String category) {
		this.category = category;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	public String getInternalReference() {
		return internalReference;
	}
	public void setInternalReference(String internalReference) {
		this.internalReference = internalReference;
	}
	public int getShellId() {
		return shellId;
	}
	public void setShellId(int shellId) {
		this.shellId = shellId;
	}
	public StatusStock getInventoryStatus() {
		return inventoryStatus;
	}
	public void setInventoryStatus(StatusStock inventoryStatus) {
		this.inventoryStatus = inventoryStatus;
	}
	public int getRating() {
		return rating;
	}
	public void setRating(int rating) {
		this.rating = rating;
	}
	public int getCreatedAt() {
		return createdAt;
	}
	public void setCreatedAt(int createdAt) {
		this.createdAt = createdAt;
	}
	public int getUpdatedAt() {
		return updatedAt;
	}
	public void setUpdatedAt(int updatedAt) {
		this.updatedAt = updatedAt;
	}
	public Long getId() {
		return id;
	}
    /**
     * Constructor
     */
	public Product() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Product(Long id, String code, String name, String description, String image, String category, double price,
			int quantity, String internalReference, int shellId, StatusStock inventoryStatus, int rating, int createdAt,
			int updatedAt) {
		super();
		this.id = id;
		this.code = code;
		this.name = name;
		this.description = description;
		this.image = image;
		this.category = category;
		this.price = price;
		this.quantity = quantity;
		this.internalReference = internalReference;
		this.shellId = shellId;
		this.inventoryStatus = inventoryStatus;
		this.rating = rating;
		this.createdAt = createdAt;
		this.updatedAt = updatedAt;
	}
	/**
	 * Methods To String
	 */
	@Override
	public String toString() {
		return "Product [id=" + id + ", code=" + code + ", name=" + name + ", description=" + description + ", image="
				+ image + ", category=" + category + ", price=" + price + ", quantity=" + quantity
				+ ", internalReference=" + internalReference + ", shellId=" + shellId + ", inventoryStatus="
				+ inventoryStatus + ", rating=" + rating + ", createdAt=" + createdAt + ", updatedAt=" + updatedAt
				+ "]";
	}
	
	
}
