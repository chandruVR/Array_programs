package Array_Programs;

public class Min_and_Max_value_in_array {

	void get_minimum() {

		int indexx1[] = {9,1,5,3,4 ,8,2,1};
		int mini = indexx1[0]; 
		int i = 0;
		for (i = i + 1; i < indexx1.length; i++) {
			//   9> indexx1[i] 1 =1  yes mini =1 ;
			//   1> indexx1[i] 2 =5  no mini =1;
   			//   1> indexx1[i] 3 =3  no mini =1;
 			if (mini > indexx1[i]) {
				mini = indexx1[i];
			}
		}
		System.out.println(mini);
	}
	 
	void get_maximum() {

		int indexx1[] = {5,5,7,8,9,6};
		int max = indexx1[0]; 
		int i = 0; 
		for (i = i + 1; i < indexx1.length; i++) {
			if (max < indexx1[i]) {
				max = indexx1[i]; 
			}
		}
		System.out.println(max);
	}

	public static void main(String[] args) {
		Min_and_Max_value_in_array obj = new Min_and_Max_value_in_array();
		//obj.get_minimum();
        obj.get_maximum();
	}

}
