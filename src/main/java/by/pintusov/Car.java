package by.pintusov;

import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

/**
 * Project: Test
 * Created by: USER
 * Date: 09.03.17.
 */
@Data
@NoArgsConstructor
public class Car implements Serializable {
	private static final long serialVersionUID = 1L;
	protected Vehicle vehicle;
	protected Integer speed;
}
