package constructor;

public class Image {			//This is a class and class name is "Image"
	
	private String type;
	private int size;
	
	
	public Image()				//default constructor
	{
		type = "jpg";
		size = 100;
	}
	
	
	public Image(String typeImage,int sizeImage)		//parameterized constructor
	{
		type = typeImage;
		size = sizeImage;
	}
	
	public void ImageDetails()
	{
		System.out.print("Image Type is "+type+" ");
		System.out.println("and size is "+size);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Image image1 = new Image();						// this is object creation, name is image1
		Image image2 = new Image("Png",110);			// this is object creation, name is image2
		image1.ImageDetails();
		image2.ImageDetails();
	}

}
