public class QuickSort extends Ordenacao {

	public QuickSort(long a[]) {

		super(a);

	}

	public void Ordenar() {

		Ordenar(0, array.length);

	}

	public void Ordenar(int began, int end) {
		int i, j;
		i = began;
		j = end - 1;
		long pivo = array[(began + end) / 2];
		long aux;
		while (i <= j) {
			while (array[i] < pivo && i < end) {
				i++;
			}
			while (array[j] > pivo && j > began) {
				j--;
			}
			if (i <= j) {
				aux = array[i];
				array[i] = array[j];
				array[j] = aux;
				i++;
				j--;
			}
		}
		if (j > began)
			Ordenar( began, j + 1);
		if (i < end)
			Ordenar(i, end);

	}

}