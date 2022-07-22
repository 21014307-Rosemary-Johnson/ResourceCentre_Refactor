
public class Item {
  private String assetTag;
  private String description;
  private String dueDate;
  private boolean isAvailable;

<<<<<<< HEAD

  public Item(String assetTag, String description) {
    this.assetTag = assetTag;
    this.description = description;
    this.dueDate = "";
    this.isAvailable = true;
  }
  public String toString() {
    
    // Write your codes here
    String itemInfo = String.format("%-10s %-30s %-10s %-10s", 
        assetTag,
        description,
        ResourceCentre.showAvailability(isAvailable),
        dueDate);
    
    return itemInfo;
  }
  public String getAssetTag() {
    return assetTag;
  }
=======
	public Item(String assetTag, String description) {
		this.assetTag = assetTag;
		this.description = description;
		this.dueDate = "";
		this.isAvailable = true;
	}
	public String toString() {

	    
	    // Write your codes here
	    String itemInfo = String.format("%-10s %-30s %-10s %-10s", 
	        assetTag,
	        description,
	        ResourceCentre.showAvailability(isAvailable),
	        dueDate);
	    
	    return itemInfo;


	}
	public String getAssetTag() {
		return assetTag;
	}
>>>>>>> branch 'master' of https://github.com/21014307-Rosemary-Johnson/ResourceCentre_Refactor.git

  public String getDescription() {
    return description;
  }

  public String getDueDate() {
    return dueDate;
  }

  public void setDueDate(String dueDate) {
    this.dueDate = dueDate;
  }

  public boolean getIsAvailable() {
    return isAvailable;
  }

  public void setIsAvailable(boolean isAvailable) {
    this.isAvailable = isAvailable;
  }
}