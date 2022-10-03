public class RectangleRunner {
	public static void main(String[] args) {
		// creating plots
		Rectangle plot1 = new Rectangle(150, 200);
		Rectangle plot2 = new Rectangle(125);
		Rectangle plot3 = new Rectangle();

		// setting widths to 75
		plot1.setWidth(75);
		plot2.setLength(75);
		plot2.setWidth(75);
		plot3.setWidth(75);

		// printing total area
		int totalArea = plot1.calculateArea() + plot2.calculateArea() + plot3.calculateArea();
		System.out.println("These three plots require " + totalArea + " square feet of seed");
	}
}
