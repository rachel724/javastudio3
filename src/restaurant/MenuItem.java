package restaurant;

public class MenuItem {
    private Boolean isNew;
    private Double price;
    private String description;
    private String category;

    public Boolean getIsNew(){
        return isNew;
    }

    public void setIsNew(Boolean isNew){
        this.isNew = isNew;
    }

    public Double getPrice(){
        return price;
    }

    public void setPrice(Double price){
        this.price = price;
    }

    public String getDescription(){
        return description;
    }

    public void setDescription(String description){
        this.description = description;
    }

    public String getCategory(){
        return category;
    }

    public void setCategory(String category){
        this.category = category;
    }
    //new Menu Item
    public MenuItem(Boolean isNew, Double price, String description, String category){
        this.isNew = isNew;
        this.price = price;
        this.description = description;
        this.category = category;
    }

    public static void main(String[] args) {
        MenuItem newItem = new MenuItem(true, 4.99,"queso", "appetizer");
        System.out.println("isNew: " + newItem.isNew + " price: " + newItem.price + " description: " + newItem.description + " category: " + newItem.category);
    }

}

