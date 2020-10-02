package com.wipro.bean;

public class Marks {

	private int eng = 0, sci = 0, math = 0;

	public Marks() {

	}

	public Marks(int eng, int sci, int math) {
		super();
		this.eng = eng;
		this.sci = sci;
		this.math = math;
	}

	public int getEng() {
		return eng;
	}

	public void setEng(int eng) {
		this.eng = eng;
	}

	public int getSci() {
		return sci;
	}

	public void setSci(int sci) {
		this.sci = sci;
	}

	public int getMath() {
		return math;
	}

	public void setMath(int math) {
		this.math = math;
	}

	@Override
	public String toString() {
		return "" + (this.math + this.eng + this.sci);
	}

}
