/*
 * 
 * 
 * 
 * 
 * 
 * &copy;TiramiAsu
 * 
 */
package ocp2018_135.c13_encapsulation;

/**
 * <pre>
 * [Bean] 2020-02-14 00:32
 * - 假設 bmi 的計算方式要保護起來, 使用私有化方法計算, 還是可以讓調用的人得到計算後的結果
 * </pre>
 * 
 * @author TiramiAsu (Email)
 */
public class BMI {

	private double w;
	private double h;
	private double bmi;

	public BMI(double w, double h) {
		this.w = w;
		this.h = h;
		bmi = calculateBmi(this.w, this.h);
	}

	public double getW() {
		return w;
	}

	public void setW(double w) {
		this.w = w;
		bmi = calculateBmi(this.w, this.h); // w 改變時, 重新計算 bmi
	}

	public double getH() {
		return h;
	}

	public void setH(double h) {
		this.h = h;
		bmi = calculateBmi(this.w, this.h); // h 改變時, 重新計算 bmi
	}

	// 不讓外部調用此方法, 計算結果必須透過建構子, 改變 w, h 時計算
//	public void setBmi(double bmi) {
//		this.bmi = bmi;
//	}

	// 使用內部調用的方式, 再把計算結果傳出去
	public double getBmi() {
		return bmi;
	}

	// 外面無法直接調用此方法, 所以能隱藏計算方式
	private double calculateBmi(double w, double h) {
		return w / Math.pow(h / 100, 2);
	}

	@Override
	public String toString() {
		return "BMI [w=" + w +
				", h=" + h +
				", bmi=" + bmi +
				"]";
	}
}
