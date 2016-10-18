public class Lotto{
		//declare vars

		private int nums[] = new int[5];
		private int Lnums[] = new int[5];

		private int myCorrectNumbers;

		//constructor
		public Lotto(){
			for(int i=0; i<5; i++){
				Lnums[i]=(int)((Math.random() * 4)+1);
				}

		myCorrectNumbers=0;

	}
	//set methods
	public void setGuesses(int nums[]){
		for(int i=0;i<5;i++)
		this.nums[i]=nums[i];


		}

		//compute
		public void checkNumbers(){
			for(int i=0;i<5;i++){
			if(nums[i]==Lnums[0]||
			nums[i]==Lnums[1]||
			nums[i]==Lnums[2]||
			nums[i]==Lnums[3]||
			nums[i]==Lnums[4]){
				myCorrectNumbers++;
				}
			}
			}
		public int getMyCorrectNumbers(){
			return myCorrectNumbers;
			}
	}