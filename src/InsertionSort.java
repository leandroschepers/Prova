public class InsertionSort extends Ordenacao {

	public InsertionSort(long a[]) {

		super(a);

	}

	public void Ordenar() {
		for (int i = 1; i < array.length; i++) {
			long elemento = array[i];
			int j = i - 1;
			while (j >= 0 && array[j] > elemento) {
				array[j + 1] = array[j];
				j = j - 1;
			}
			array[j + 1] = elemento;
		}
	}

}