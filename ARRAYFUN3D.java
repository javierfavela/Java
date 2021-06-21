
public class ARRAYFUN3D {
	
	public static void main (String[] args)
	   {
		//int[][][] threeD = new int[3][3][3];
		int[][][][][][] threeD = 
		    { { { { { {1,  2,  3, 100,}, { 4,  5,  6, 101,}, { 7,  8,  9, 102,} },
		       { {10, 11, 12, 103,}, {13, 14, 15, 104,}, {16, 17, 18, 105,} },
		       { {19, 20, 21, 106,}, {22, 23, 24, 107,}, {25, 26, 27, 108,} },
		       { {28, 29, 30, 109,}, {31, 32, 33, 110,}, {34, 35, 36, 111,} },
		       { {37, 38, 39, 112,}, {40, 41, 42, 113,}, {43, 44, 45, 114,} },
		       { {46, 47, 48, 115,}, {49, 50, 51, 116,}, {52, 53, 54, 117,} } },
		    { {  {1,  2,  3, 100,}, { 4,  5,  6, 101,}, { 7,  8,  9, 102,} },
			       { {10, 11, 12, 103,}, {13, 14, 15, 104,}, {16, 17, 18, 105,} },
			       { {19, 20, 21, 106,}, {22, 23, 24, 107,}, {25, 26, 27, 108,} },
			       { {28, 29, 30, 109,}, {31, 32, 33, 110,}, {34, 35, 36, 111,} },
			       { {37, 38, 39, 112,}, {40, 41, 42, 113,}, {43, 44, 45, 114,} },
			       { {46, 47, 48, 115,}, {49, 50, 51, 116,}, {52, 53, 54, 117,} } } } } 
		    { { { { {1,  2,  3, 100,}, { 4,  5,  6, 101,}, { 7,  8,  9, 102,} },
			       { {10, 11, 12, 103,}, {13, 14, 15, 104,}, {16, 17, 18, 105,} },
			       { {19, 20, 21, 106,}, {22, 23, 24, 107,}, {25, 26, 27, 108,} },
			       { {28, 29, 30, 109,}, {31, 32, 33, 110,}, {34, 35, 36, 111,} },
			       { {37, 38, 39, 112,}, {40, 41, 42, 113,}, {43, 44, 45, 114,} },
			       { {46, 47, 48, 115,}, {49, 50, 51, 116,}, {52, 53, 54, 117,} } },
			    { { {1,  2,  3, 100,}, { 4,  5,  6, 101,}, { 7,  8,  9, 102,} },
				       { {10, 11, 12, 103,}, {13, 14, 15, 104,}, {16, 17, 18, 105,} },
				       { {19, 20, 21, 106,}, {22, 23, 24, 107,}, {25, 26, 27, 108,} },
				       { {28, 29, 30, 109,}, {31, 32, 33, 110,}, {34, 35, 36, 111,} },
				       { {37, 38, 39, 112,}, {40, 41, 42, 113,}, {43, 44, 45, 114,} },
				       { {46, 47, 48, 115,}, {49, 50, 51, 116,}, {52, 53, 54, 117,} } } } }
		    };
		int matrixRow;
		int matrixCol;	
		int matrixDept;
		int matrixTheLastAirBender;
		int matrixAnotha;
		
		for (matrixAnotha = 0; matrixAnotha < threeD.length; matrixAnotha++)
		{
		for (matrixTheLastAirBender = 0; matrixTheLastAirBender < threeD[matrixAnotha].length; matrixTheLastAirBender++)
		{
			for (matrixRow = 0; matrixRow < threeD[matrixAnotha][matrixTheLastAirBender].length; matrixRow++)
			{
				for (matrixCol = 0; matrixCol < threeD[matrixAnotha][matrixTheLastAirBender][matrixRow].length; matrixCol++)
				{
					for (matrixDept = 0; matrixDept < threeD[matrixAnotha][matrixTheLastAirBender][matrixRow][matrixCol].length; matrixDept++)
					{
						
						System.out.print( threeD[matrixAnotha][matrixTheLastAirBender][matrixRow][matrixCol][matrixDept] + " "); 						
						
					}
					System.out.println();
				}
				System.out.println();
			}
			System.out.println(); 

		}
		}
		
		
	
	   }
	

}
