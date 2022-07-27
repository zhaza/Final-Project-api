package babiesRUs.item.controller.dto;

public class ItemDTO {

    private String name;

    private String description;

    private String imgUrl;

    private Double price;
    public ItemDTO( String name, String description, String imageUrl, Double price)
    {
        this.name = name;
        this.description = description;
        this.imgUrl = imageUrl;
        this.price = price;
    }

    public String getName()
    {
        return name;
    }

    public void setName( String name )
    {
        this.name = name;
    }

    public String getDescription()
    {
        return description;
    }

    public void setDescription( String description )
    {
        this.description = description;
    }

    public String getImgUrl()
    {
        return imgUrl;
    }

    public void setImgUrl( String imgUrl )
    {
        this.imgUrl = imgUrl;
    }

    public Double getPrice() { return price; }

    public void setPrice(Double price) { this.price = price; }
}
