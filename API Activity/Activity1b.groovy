package APIActivities

class Activity1b {
	
	public static void main (def arg) {
	//create a new file
	File file = new File("src/resources/input.txt");
	file.createNewFile();
	
	//write text into input.txt
	def inputText = 'A quick brown Fox jumped over the lazy Cow\nJohn Jimbo jingeled happily ever after\nTh1$ 1$ v3ry c0nfus1ng'
	file.write(inputText);
	
	/*try {
		Scanner scanner = new Scanner(new File("src/resources/input.txt"));
		while (scanner.hasNextLine()) {
			//System.out.println(scanner.nextLine());
			String line;
			if (line)
		}
		scanner.close();
	} catch (FileNotFoundException e) {
		e.printStackTrace();
	}*/
	
	println "Match Operations"
	
	//Print the line that has Cow at the end of the line
	file.eachLine {line ->
		if(line ==~/^A.*Cow$/) 
			{
			println "Line that ends with 'cow' is: $line" 
			}
		
	}
		
	//Print the line that start with capital letter 'J'
	file.eachLine {line ->
		if(line ==~/^J.*/)
			{
			println "Line that ends with capital letter 'J' is: $line"
			}
	}
	//Print the line that has two numbers one after the other
	file.eachLine {line->
		if(line ==~ /.*\d\d.*/) {
			println "Line that has two adjacent numbers: $line"
			}
	}
	
	//Print the string(s) that match the pattern '\S+er'
	println "\n\nFind Operatons:"
	
	def match1 = file.getText() =~ /\S+er/
	println "String(s) matching '/\\S+er/' are : ${match1.findAll()}"
	
	//Print the string(s) that match the pattern '\S*\d\W'
	def match2 = file.getText() =~ /\S*\d\W/
	println "String(s) matching '/\\S*\\d\\W/' are : ${match2.findAll()}"
	
}
}
