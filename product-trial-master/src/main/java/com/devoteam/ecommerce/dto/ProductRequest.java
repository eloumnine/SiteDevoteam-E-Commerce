package com.devoteam.ecommerce.dto;

import com.devoteam.ecommerce.entities.Product.StatusStock;

import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;


/*@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString*/
public class ProductRequest {

	/**
	 * Attributes
	 */
	@NotNull(message = "Le code est oblegatoir")
	@Size(min = 5, max = 20, message = "Nombre de caractere doit compris entre 5 et 20")
    private String code;
	@NotNull(message = "Le name est oblegatoir")
	@Size(min = 5, max = 20, message = "Nombre de caractere doit compris entre 5 et 20")
    private String name;
    private String description;
    private String image;
    private String category;
    private double price;
    private int quantity;
    private String internalReference;
    private int shellId;
    private StatusStock inventoryStatus;
    private int rating;
    private int createdAt;
    private int updatedAt;
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
	/**
	 * Constructor
	 */
	public ProductRequest() {
		super();
		// TODO Auto-generated constructor stub
	}
	public ProductRequest( String code, String name, String description, String image, String category,
			double price, int quantity, String internalReference, int shellId, StatusStock inventoryStatus, int rating,
			int createdAt, int updatedAt) {
		super();
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
	
    
}
