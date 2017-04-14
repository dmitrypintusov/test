package by.pintusov;

import lombok.Data;
import org.apache.log4j.Logger;

import java.io.*;

/**
 * Class {@code Loader}
 * @see java.lang.Class
 * @since JDK 1.0
 * Project: Test
 * Created by: USER
 * Date: 09.03.17.
 */
@Data
public class Loader {
	private static Logger logger = Logger.getLogger(Loader.class);

/*
	static {
		System.out.println("Start main thread");
	}
*/

	public static void main(String[] args) {

		/*Car car = new Car();
		Vehicle vehicle = new Vehicle();
		vehicle.setCompany("Company");
		vehicle.setModelNumber(1);
		car.setSpeed(100);
		car.setVehicle(vehicle);
		System.out.println(car);

		Audi audi = new Audi();
		audi.setModelOfCar("TT");
		Vehicle audi_v = new Vehicle();
		audi_v.setCompany("Audi");
		audi_v.setModelNumber(701);
		audi.setSpeed(250);
		audi.setVehicle(audi_v);
		System.out.println(audi);

		String s1, s2;
		s1 = "Java";
		s2 = s1;
		System.out.println(s1 + ", " + s2);
		System.out.println("сравнение ссылок == " + (s1 == s2));
		s2 = new String("Java");
		System.out.println("сравнение ссылок new == "+ (s1 == s2));
		System.out.println("сравнение значений equals() " + s1.equals(s2));

		*//*int x;
		try {
			x = System.in.read();
			char c = (char) x;
			System.out.println("Code of symbol: " + c + " = " + x);
		}catch (IOException e) {
			logger.error("Error IO " + e);
		}

		System.out.println("Print your name: ");
		Scanner scanner = new Scanner(System.in);
		String name = scanner.next();
		System.out.println("Hello, " + name);
		scanner.close();*//*

		int i = 071;
		int b = 0x51b;
		int a = 0b1010;
		System.out.println("i=" +i + " b=" + b + " a=" + a);

		byte u = 127;
		u +=5;
		System.out.println(u);

		long v = 100_000_000L;
		String str = String.valueOf(v);
		String k = v>100_000L ? str + " more than 100 000" : str + " less than 100 000";
		System.out.println(k);

		int val = 1;
		switch (val) {
			case 0:
				System.out.println("This is 0 case");
				break;
			case 1:
				System.out.println("This is 1 case");
				break;
			case 2:
				System.out.println("This is 2 case");
				break;
			default:
				System.out.println("No case chosen");
		}

		int[] arr = {1, 3, 5};
		for (int elem : arr) {
			System.out.printf("%d ", elem);
		}

		int arr1 [] [] = {
				{1},
				{1,2},
				{1,2,3}
		};
		for (int [] i1: arr1) {
			System.out.printf("%n");
			for (int i2: i1) {
				System.out.printf("%d ", i2);
			}
		}

		final long BANK_ID;
		{BANK_ID = 10000L; }

		showStrings();
		System.out.println("N=" + showStrings("This", "is", "showString", "method"));

		CarModel cm = CarModel.AUDI;
		System.out.println(cm);

		String str1 = "World";
		String str2 = new String ("World");
		String str3 = "World";
		String str4 = "Hello ";

		System.out.println(str1 == str2);
		System.out.println(str1 == str3);
		System.out.println(str1.equals(str2));
		System.out.println(str1.compareTo(str2));
		System.out.println(str4.concat(str1));
		System.out.println(str4.concat(str1).substring(6));
		System.out.println(str4.indexOf('e'));
		System.out.println(str4.concat(str1).replace('l', 'j').toUpperCase());
		System.out.println(str1.charAt(0));
		str1 += str4;
		System.out.println(str1);

		String names = " Alena Alice alina albina Anastasya ALLA ArinA ";
		String nam [] = names.trim().split(" ");
		for (int in = 0; in< nam.length-1; in++) {
			for (int je = in + 1; je < nam.length; je++) {
				if (nam[je].compareToIgnoreCase(nam[in]) < 0) {
					String temp = nam[in];
					nam[in] = nam[je];
					nam[je] = temp;
				}
			}
		}
		for (String arg: nam) {
			if (!arg.isEmpty()) {
				System.out.print(arg + " ");
			}
		}

		System.out.println();
		StringBuilder sb = new StringBuilder("String Builder");
		System.out.println(sb + " capacity=" + sb.capacity());
		sb.setLength(4);
		System.out.println(sb + " capacity=" + sb.capacity());
		sb.append("ng Build");
		System.out.println(sb);
		sb.reverse();
		System.out.println(sb);
		sb.append(str4);
		System.out.println(sb);

		StringBuffer sbf = new StringBuffer("String Buffer");
		System.out.println(sbf + " capacity=" + sbf.capacity());
		StringBuffer sbf1 = new StringBuffer("String Builder");
		System.out.println(sb.toString().contentEquals(sbf1));

		Pattern p1 = Pattern.compile("a+y");
		Matcher m1 = p1.matcher("aaay");
		boolean bi = m1.matches();
		System.out.println(bi);
		// поиск и выбор подстроки, заданной шаблоном
		String regex = "(\\w{6,})@(\\w+\\.)([a-z]{2,4})";
		String s = "адреса эл.почты:blinov@gmail.com, romanchik@bsu.by!";
		Pattern p2 = Pattern.compile(regex);
		Matcher m2 = p2.matcher(s);
		while (m2.find()) {
			System.out.println("e-mail: " + m2.group());
		}
		// разбиение строки на подстроки с применением шаблона в качестве разделителя
		Pattern p3 = Pattern.compile("\\d+\\s?");
		String[ ] words = p3.split("java5tiger 77 java6mustang");
		System.out.print(Arrays.toString(words));
		System.out.println();

		Locale current = new Locale ("be", "BY");
		System.out.println("Country=" + current.getCountry() +
							" Country name=" + current.getDisplayCountry() +
							" Language=" + current.getLanguage() +
							" Display language=" + current.getDisplayLanguage());*/

		/*Date d = new Date();
		Locale[ ] locales = DateFormat.getAvailableLocales();
		for (Locale loc : locales) {
			DateFormat df = DateFormat.getDateInstance(DateFormat.FULL, loc);
			System.out.println(loc.toString() + "---> " + df.format(d));
		}*/

		/*Formatter formatter = new Formatter();
		formatter.format("This %s is about %n%S %c", "book", "java", '8');
		System.out.println(formatter);*/

		/*TalkingThread tt = new TalkingThread();
		Thread wt = new Thread(new WalkingThread());
		tt.start();
		wt.start();*/

		/*PriorThread min = new PriorThread("Min");
		PriorThread max = new PriorThread("Max");
		PriorThread norm = new PriorThread("Norm");
		min.setPriority(Thread.MIN_PRIORITY);
		max.setPriority(Thread.MAX_PRIORITY);
		norm.setPriority(Thread.NORM_PRIORITY);
		min.start();
		max.start();
		norm.start();*/

		/*JoinThread first = new JoinThread("First");
		JoinThread second = new JoinThread("Second");
		first.start();
		second.start();
		try {
			first.join();
		} catch (InterruptedException e) {
			logger.error(e);
		}
		System.out.println(Thread.currentThread().getName());*/

		/*new Thread() { // анонимный класс
			public void run() {
				System.out.println("старт потока 1");
				Thread.yield();
				System.out.println("завершение 1");
			}
		}.start(); // запуск потока
		new Thread() {
			public void run() {
				System.out.println("старт потока 2");
				System.out.println("завершение 2");
			}
		}.start();*/

		/*DaemonThread daemon = new DaemonThread();
		DaemonThread simple = new DaemonThread();
		daemon.setDaemon(true);
		daemon.start(); //не завершит выполнение, т.к. sleep (10000), но main может завершить его
		simple.start();
		System.out.println("In the end Main");*/
		/*Vehicle.model = 15;
		Vehicle v1 = new Vehicle();
		Vehicle v2 = new Vehicle();
		Vehicle v3 = new Vehicle();
		System.out.println(v1 + " " + v2 + " " + v3);

		TreeMap<String, Integer> hm = new TreeMap<>();
		hm.put("First", 1);
		hm.put("Second", 2);
		hm.put("First", 3);
		System.out.println(hm + " size =" + hm.size());*/

		String file = "data.txt";
		File f = new File (file);
		String srt[] = {"This", " is", " test", " file!"};
		try (FileWriter fileWriter = new FileWriter(f)){
			for (String a: srt) {
				fileWriter.write(a);
			}
		} catch (IOException e) {
			logger.error(e);
		}

		int n, count = 0;
		try (FileReader fileReader=new FileReader(f)){
			while ((n = fileReader.read()) != -1) {
				System.out.print((char) n);
				count++;
			}
			System.out.print("\nbytes number=" + count);
		} catch (IOException e) {
			logger.error(e);
		}
		System.out.println();

		File dir = new File ("C:\\Documents and Settings\\USER\\Рабочий стол\\Пинтусов\\Дмитрий (прочее)\\Java Developer\\CS\\Test");
		File[] files = dir.listFiles();
		for(int i = 0; i < files.length; i++) {
			System.out.printf("%s ", files[i].getName());
		}

		File root = File.listRoots()[1];
		System.out.printf("\n%s %,d из %,d свободно.", root.getPath(), root.getUsableSpace(),
				root.getTotalSpace());

		String data = "data.data";
		File f2 = new File (data);
		double[ ] v = { 1.10, 1.2, 1.401, 5.01, 6.017, 7, 8 };
		try (PrintWriter printWriter = new PrintWriter(new BufferedWriter(new FileWriter(f2)))) {
			for (double d: v) {
				printWriter.printf("Java %.2g%n", d);
			}
		} catch (IOException e) {
			logger.error(e);
		}
		System.out.println();

		try (BufferedReader br = new BufferedReader(new FileReader(f2))) {
			String tmp = "";
			while ((tmp = br.readLine()) != null) {
				String s [] = tmp.split("\\s");
				for (String str: s) {
					System.out.println(str);
				}
			}
		} catch (IOException e) {
			logger.error(e);
		}
	}

	/* AFTER MAIN METHODS */
	private static int showStrings (String ... strings) {
		int count = 0;
		if (strings.length == 0) {
			System.out.println("No strings");
		} else {
			for (String str: strings) {
				System.out.printf("Str:%s ", str);
				count++;
			}
		}
		return count;
	}
}
