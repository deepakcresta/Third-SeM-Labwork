package labWork;

public class CollectionFramework {
	public static void main(String[] args) {
		LinkedList<Integer> name = new LinkedList<Integer>();
		name.add(10);
		name.add(200);
		name.add(30);
		name.add(400);
		name.add(50);
		System.out.println(name);
		for (int i = 0; i < name.size(); i++) {
			// System.out.println(name.get(i));

		}
		// Enhanced for loop
		// for(Interger name:m )
		// In LinkList the no are not sorted before displaying

//		ArrayList <Integer> name1 = new ArrayList<Integer>();
//		name1.add(10);
//		name1.add(200);
//		name1.add(30);
//		name1.add(400);
//		name1.add(500);
//		System.out.println(name1);
//		//In LinkList the no are  sorted before displaying
//		
//		
//		//Stack
//		Stack<Integer> s = new Stack<>();
//		s.push(11);
//		s.push(33);
//		s.push(145);
//		s.push(18);
//		s.push(91);
//		System.out.println(s);
//		int n = s.peek();
//		System.out.println("Peek is used to get element: "+n);
//		s.pop();
//		System.out.println("After using pop method: "+s);
//		for(Integer num:s) {
//			System.out.println(num);
		// }
		// set
		Set<Integer> numbers = new HashSet<>();
		numbers.add(10);
		numbers.add(200);
		numbers.add(30);
		numbers.add(400);
		numbers.add(500);
		System.out.println(numbers.size());
		for(Integer num:numbers) {
			System.out.print(num +" ");
		}
		Map<String,Interger> nameIdMap=new HashMap<>();
				nameIdMap.put("Radha",1);
				nameIdMap.put("Rami",100);
				nameIdMap.put("Rad",1000);
				nameIdMap.forEach(key,value);	
				{
					
				}
	}
}

}
