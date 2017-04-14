package by.pintusov;

import lombok.Data;

import java.io.Serializable;

/**
 * Project: Test
 * Created by: USER
 * Date: 09.03.17.
 */
@Data
public class Vehicle implements Serializable {
	private String company;
	private Integer modelNumber;
	public static int model=10;
	private static final double serialVersionUID = 2L;

	public Vehicle (String company) {
		this.company = company;
		this.modelNumber = model++;
	}

	public Vehicle () {
		this.modelNumber = model++;
	}
}
