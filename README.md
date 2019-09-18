# cisc275-fall2019-first-git
1. Create java files to make this code compile and run.

2. What five objects are created in the main?

	1.A new arrayList called dogs. 
	2.A new dog Fido with 4 legs.
	3.A new dog Fido with 3 legs.
	4.A new dog Alfie with 4 legs.
	5.A new comparator


3. Can you spot the Comparator constructor call? Where is the class definition for the Comparator?

	The comparator constructor call is 
			public int compare(Animal a, Animal b){
			    return a.getLegs() - b.getLegs();
			}
	but the class definition is in the Collections interface.