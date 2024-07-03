package java8_practice;


import java.util.Optional;

class optional{

	public static void main(String[] args)
	{

		String[] str = new String[5];

		str[2] = "Optional example is printed";

		Optional<String> empty = Optional.empty();
		System.out.println(empty);

		Optional<String> value = Optional.of(str[2]);
		System.out.println(value);
	}
}
