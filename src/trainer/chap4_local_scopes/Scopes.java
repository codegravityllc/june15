package trainer.chap4_local_scopes;

public class Scopes {

	int x = 10; // global variable, long term
	int y = 30;

	public void test() {
		int x = 20;
		int y = 30;
		{
			// int y;
			System.out.println(y);
		}

		x = 30;
		System.out.println(this.x);
	}

// duplicate para/local variable within scope not allowed
// access .. read or change within scope
	public void add(int a, int b) {// paramteric
		System.out.println(x);
		{
			// int a=30;
			int p = 20;
			{
				{
					// line it was declared
					// till
					// end of its block
					{
						{
						}
						// int p=30;
						// int a=30;
						p = 30;
					}
				}
			}
		}
		// System.out.println(p);
	}

	public void test2() {
		System.out.println(x);
		// System.out.println(c);
		// System.out.println(p);
	}

}
