package com.example.pcsilah.gpu;

public class gpuclass {
	private String Chipset_Manufacture;
	private String CPU;
	private String Cores;
	private String Clock_speed;
	private String L_Caches;
	private String Processor_Graphics;
	private String TDP;
	private int Image;

	public gpuclass(String chipset_Manufacture, String CPU, String cores, String clock_speed, String l_Caches, String processor_Graphics, String TDP, int image) {
		Chipset_Manufacture = chipset_Manufacture;
		this.CPU = CPU;
		Cores = cores;
		Clock_speed = clock_speed;
		L_Caches = l_Caches;
		Processor_Graphics = processor_Graphics;
		this.TDP = TDP;
		Image = image;
	}

	public String getChipset_Manufacture() {
		return Chipset_Manufacture;
	}

	public String getCPU() {
		return CPU;
	}

	public String getCores() {
		return Cores;
	}

	public String getClock_speed() {
		return Clock_speed;
	}

	public String getL_Caches() {
		return L_Caches;
	}

	public String getProcessor_Graphics() {
		return Processor_Graphics;
	}

	public String getTDP() {
		return TDP;
	}

	public int getImage() {
		return Image;
	}
}
