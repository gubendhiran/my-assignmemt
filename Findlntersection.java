package week.day1;

public class Findlntersection {

		public static void main(String[] args) {

				int[] A={3,2,8,3,6,4};

				int[] B={1,2,8,4,9,7};

				for (int i = 0; i < A.length; i++)

					for (int j = 0; j < B.length; j++) 

						if(A[i]==B[j])

							System.out.println("The intersection is at  "+A[i]);

			}
		}
		


