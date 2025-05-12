class Lesson {
	public static void run() {
		Rectangle rect = new Rectangle(15, 20);

		System.out.println(rect.getWidth());

		RectPrism r = new RectPrism(1, 2, 3);

		System.out.println(r.getWidth());
		System.out.println(r.getLength());
		System.out.println(r.getHeight());
	}
}