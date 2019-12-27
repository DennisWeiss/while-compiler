class Main {
	public static void main(String[] args) {
		long[] x = new long[3];
		
		for (int i = 0; i < args.length; i++) {
			x[i+1] = Long.parseLong(args[i]);
		}

		x[2] = x[1] + 0;
		while (x[2] != 0) {
			for (long i_1 = 0; i_1 < x[2]; i_1++) {
				x[0] = x[0] + 1;
			}
			x[2] = x[2] - 1;
		}

		System.out.println(x[0]);
	}
}