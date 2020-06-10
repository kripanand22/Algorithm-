

class DuplicateWords{
	public static void main(String ss[]){
		String input = "I am a good boy and i am a good developer";
		System.out.println(input);
		Dupicate(input);
	}
	static void Dupicate(String s1){
		String words[] = s1.split("\\s");
		
		for(int i=0 ;i<words.length ;i++)
		{
			if(words[i].equals("good"))
			{
				for(int j=i+1 ;j<words.length ;j++)
				{
					if(words[i].equals(words[j]))
					{
						if(i != j)
							words[j] = "";
					}
				}
			}
		}
		System.out.println("After removing 2nd good in a sentence");
		for(int i=0 ;i<words.length ;i++)
		{
			System.out.print(words[i]+" ");
		}
	}
}