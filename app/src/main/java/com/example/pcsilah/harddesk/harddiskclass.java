package com.example.pcsilah.harddesk;

public class harddiskclass {
	private String Storge_type;
	private String brand_name;
	private String SRW;
	private String Memory_Speed;
	private String Capacity;
	private String Type_port;
	private int Image;

	public harddiskclass(String storge_type, String BN, String srw, String MS,
						 String capacity, String tp, int image) {
		Storge_type = storge_type;
		brand_name = BN;
		SRW = srw;
		Memory_Speed = MS;
		Capacity = capacity;
		Type_port = tp;
		Image = image;
	}

	public String getStorge_type() {
		return Storge_type;
	}

	public String getBrand_name() {
		return brand_name;
	}

	public String getSRW() {
		return SRW;
	}

	public String getMemory_Speed() {
		return Memory_Speed;
	}

	public String getCapacity() {
		return Capacity;
	}

	public String getType_port() {
		return Type_port;
	}

	public int getImage() {
		return Image;
	}
}
