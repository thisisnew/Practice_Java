package Ex076;

public enum Sex implements Color {
	MAN{
		public String getColor() {
			return "파랑";
		}
	},
	WOMAN{
		public String getColor() {
			return "빨강";
		}
	}
}
