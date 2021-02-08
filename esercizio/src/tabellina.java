
public class tabellina {

	public static void main(String[] args) {
		System.out.println("Tabellina:");
		for(int i=1;i<=10;i++) {
			for(int x=0;x<=5*10;x++) {			//ogni "casella" contiene 4 caratteri + 1 "|", quindi 5 * 10 caselle = 50 caratteri in orizzontale
				System.out.print("-");			//stampo 50 "-" per ogni riga
			}
			System.out.println();
			for(int j=1;j<=10;j++) {
				System.out.printf("|%3d ",i*j);	//allineamento a destra fino a terza cifra decimale -> %3d
			}
			System.out.println("|");			//stampo ultimo colonna di "|"
		}
		for(int x=0;x<=50;x++) {
			System.out.print("-");				//stampo ulteriori 50 "-"			
		}
	}
}
