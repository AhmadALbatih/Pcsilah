package com.example.pcsilah.gpu;

public class gpuclass {
	private String Chipset_Manufacture;
	private String GPU;
	private String Brand;
	private String Memory;
	private String Memory_Type;
	private String GPU_clock;
	private String Memory_clock;
	private String Memory_bandwidth;
	private int Image;

	public gpuclass(String chipset_Manufacture, String GPU, String brand, String memory, String memory_type, String gpu_clock, String memory_clock, String memory_bandwidth, int image) {
		Chipset_Manufacture = chipset_Manufacture;
		this.GPU = GPU;
		Brand = brand;
		Memory = memory;
		Memory_Type = memory_type;
		GPU_clock = gpu_clock;
		Memory_clock = memory_clock;
		this.Memory_bandwidth = memory_bandwidth;
		Image = image;
	}

	public String getChipset_Manufacture() {
		return Chipset_Manufacture;
	}

	public String getGPU() {
		return GPU;
	}
	public String getBrand() {
		return Brand; }

	public String getMemory() {
		return Memory;
	}

	public String getMemory_Type() {
		return Memory_Type;
	}

	public String getGPU_clock() {
		return GPU_clock;
	}

	public String getMemory_clock() {
		return Memory_clock;
	}

	public String getMemory_bandwidth() {
		return Memory_bandwidth;
	}

	public int getImage() {
		return Image;
	}
}
