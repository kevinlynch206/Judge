public class Judge {
	
	public int findJudge(int N, int[][] trust) {
		
			//int arrays to keep track of those who are trusted and those trust others
			int[] peopleTrusting = new int[N];
			int[] peopleTrusted = new int[N];
			
			//loops through each pair, adds person to trust if first index, and trusted if second index 
			for(int i = 0; i < trust.length; i++){
				int a = trust[i][0]; 
				int b = trust[i][1];
				peopleTrusting[a - 1]++;
				peopleTrusted[b - 1]++;
			}
			
			//loops through and checks if person doesn't exist in trusting array, and is trusted by everyone in the town
			for(int i = 0; i < N; i++){
				if(peopleTrusting[i] == 0 && peopleTrusted[i] == N - 1)
					return i + 1;
			}
			
			//if no judge is found, return -1
			return -1;
		}
}
