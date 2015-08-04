public class Percolation {
	
	public boolean[][] data;

	public Percolation(int N) {
		if(N <= 0) {
			throw new java.lang.IllegalArgumentException();
		}
		this.data = new boolean[N][N];
	}

	public void open(int i, int j) {
		if(i < 1 || j < 1 || i > data.length || j > data.length) {
			throw new java.lang.IndexOutOfBoundsException();
		}
	}

	public boolean isOpen(int i, int j) {
		if(i < 1 || j < 1 || i > data.length || j > data.length) {
			throw new java.lang.IndexOutOfBoundsException();
		}

	}

	public boolean isFull(int i, int j) {
		if(i < 1 || j < 1 || i > data.length || j > data.length) {
			throw new java.lang.IndexOutOfBoundsException();
		}

	}

	public boolean percolates() {

	}

	public static void main(String[] args) {
		Percolation p = new Percolation(20);
		System.out.println(p.data.length);
	}
}