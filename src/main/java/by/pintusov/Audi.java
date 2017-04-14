package by.pintusov;

import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * Project: Test
 * Created by: USER
 * Date: 09.03.17.
 */
@Data
@NoArgsConstructor
public class Audi extends Car {
	private String modelOfCar;

	@Override
	public String toString() {
		return "Audi{" +
				"modelOfCar='" + modelOfCar + '\'' +
				"vehicle='" + vehicle + '\'' +
				"speed='" + speed + '\'' +
				'}';
	}
}
