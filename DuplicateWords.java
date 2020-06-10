class DuplicateWords{
	public static void main(String ss[]){
		String input = " I am a good boy and I am a good developer.";
		System.out.println(input);
		Dupicate(input);
	}
	static void Dupicate(String s1){
		String words[] = s1.split("\\s");
		
		for(int i=0 ;i<words.length ;i++)
		{
			for(int j=0 ;j<words.length ;j++)
			{
				if(words[i].equals(words[j]))
				{
						if(i != j)
						{
							words[j]="";
						}
				}
			}
		}
		System.out.println("After removing duplicate word");
		for(int i=0 ;i<words.length ;i++)
		{
			System.out.print(words[i]+" ");
		}
	}
}