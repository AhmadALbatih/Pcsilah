package com.example.pcsilah.ram;

public class ramclass {
	private String brand_name;
	private String Memory_Speed;
	private String Capacity;
	private String Ram_memory_technology;
	private String Voltage;


	private int Image;

	public ramclass(String brand_name, String Memory_Speed, String Capacity, String Ram_memory_technology, String Voltage, int image) {
		this.brand_name = brand_name;
		this.Memory_Speed = Memory_Speed;
		this.Capacity = Capacity;
		this.Ram_memory_technology = Ram_memory_technology;
		this.Voltage = Voltage;
		Image = image;
	}

	public String getRam_memory_technology() {
		return Ram_memory_technology;
	}

	public String getVoltage() {
		return Voltage;
	}

	public String getBrand_name() {
		return brand_name;
	}

	public String getCapacity() {
		return Capacity;
	}

	public String getMemory_Speed() {
		return Memory_Speed;
	}

	public int getImage() {
		return Image;
	}
}
