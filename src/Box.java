public class Box {
	Box next;
	public int[][] solutionMatrix;
	public int n;

	Box(int[][] matrix, Box ref) {
		next = ref;
		solutionMatrix = matrix;
	}

	Box(int anyInt, Box ref) {
		next = ref;
		n = anyInt;
	};

}
