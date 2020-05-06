public class Box implements Comparable<Box> {
	private double length;
	private double width;
	private double height;
	
	public Box() {}

	public Box(double length, double width, double height) {
		super();
		this.length = length;
		this.width = width;
		this.height = height;
	}

	public double getLength() {
		return length;
	}

	public void setLength(double length) {
		this.length = length;
	}

	public double getWidth() {
		return width;
	}

	public void setWidth(double width) {
		this.width = width;
	}

	public double getHeight() {
		return height;
	}

	public void setHeight(double height) {
		this.height = height;
	}

	@Override
	public String toString() {
		double volume = (length * width * height);
		String str = String.format("length = " + length + ", width = " + width + 
				", height = " + height + ", Volume = %.2f", volume);
	
		return str;
	}

	@Override
	public int compareTo(Box that) {
		double thisVol = this.length * this.width * this.height;
		double thatVol = that.length * that.width * that.height;
		
		if (thisVol > thatVol) return 1;
		else if (thisVol < thatVol) return -1;
		else return 0;
	}
	
	@Override
	public int hashCode() {
		double thisVol = this.length * this.width * this.height;
		String str = String.valueOf(thisVol);
		return str.hashCode();
	}
	
	@Override
	public boolean equals(Object obj) {
		Box that = (Box) obj;
		
		double thisVol = this.length * this.width * this.height;
		double thatVol = that.length * that.width * that.height;
		
		if (thisVol == thatVol) return true;
		else return false;
	}
}