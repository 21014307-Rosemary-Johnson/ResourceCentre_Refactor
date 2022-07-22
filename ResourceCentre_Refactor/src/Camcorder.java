public class Camcorder extends Item{
  private int opticalZoom;

  public Camcorder(String assetTag, String description, int opticalZoom) {
    super(assetTag, description);
    this.opticalZoom = opticalZoom;
  }

	public int getOpticalZoom() {
		return opticalZoom;
	}
	
	public String toString(){
<<<<<<< HEAD
		// Write your codes here
		String output = super.toString();
		output = String.format("%-63s %-20d", output, opticalZoom);
		return output;
		}
}
=======

	    // Write your codes here
	    String output = super.toString();
	    output = String.format("%-63s %-20d", output, opticalZoom);
	    return output;

	}
}

>>>>>>> branch 'master' of https://github.com/21014307-Rosemary-Johnson/ResourceCentre_Refactor.git
