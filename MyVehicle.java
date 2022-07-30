package week3.day1;

public class MyVehicle {
	public static void main(String[] args) {
		Truck truck = new Truck();
		truck.applybreak();
		truck.applybreak();
		
		AshokLeyland al = new AshokLeyland();
		al.capacity();
		al.bigcapacity();
		al.applybreak();
		al.applybreak();
		
		Bike bk =new Bike();
		bk.speed();
		bk.applybreak();
		
		Suzuki sk =new Suzuki();
		sk.speed();
		sk.applybreak();
		sk.highspeed();
		sk.applybreak(0, 0);
		
		
	}

}
