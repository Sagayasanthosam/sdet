package APIActivities

class Activity1a {
	public static void main (def args){
		def inputList = [11, 2, 19, 5, "Mango", "apple", "Watermelon"]
		
		def strList=inputList.minus([11, 2, 19, 5])
		def intList = inputList.minus(["Mango", "Apple", "Watermelon"])
		
		println strList
		println intList
		
	}
}
