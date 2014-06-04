package com.larry.seeasyoureyes;
public class ColorRecognizer {

	public static void main(String args[]) {

		String colorAquired = "696969";// aquired
		String colorToBeCompared = "000000" ; 
		int offset = 0;
		int minOffset = 0;
		String adjacentColorName = "X";
		String adjacentColorValue = "X";
		class ColorX {
			public String colorName = "";
			public String colorStr = "";
		}// class->function->inner-class
		ColorX[] c;
		c = new ColorX[32];

		for (int i = 0; i < 32; i++) {
			c[i] = new ColorX();
		}// initialize
		c[0].colorName = "RED";
		c[0].colorStr = "FF0000";
		c[1].colorName = "GREEN";
		c[1].colorStr = "00FF00";
		c[2].colorName = "BLUE";
		c[2].colorStr = "0000FF";
		c[3].colorName = "GREY";
		c[3].colorStr = "808080";
		c[4].colorName = "WHITE";
		c[4].colorStr = "FFFFFF";
		c[5].colorName = "BLACK";
		c[5].colorStr = "000000";
		c[6].colorName = "YELLOW";
		c[6].colorStr = "FFFF00";
		c[7].colorName = "PURPLE";
		c[7].colorStr = "800080";
		c[8].colorName = "PINK";
		c[8].colorStr = "FFC0CB";
		c[9].colorName = "BROWN" ; 
		c[9].colorStr = "A52A2A" ;
		c[10].colorName = "SILVER" ; 
		c[10].colorStr = "C0C0C0" ; 
		c[11].colorName = "SKYBULE" ; 
		c[11].colorStr = "87CECB" ; 
		c[12].colorName = "ORANGE" ;
		c[12].colorStr = "FF4500" ;
		
		c[13].colorName = "midnightblue" ; 
		c[13].colorStr = "191970" ; 
		c[14].colorName = "lightgreen" ; 
		c[14].colorStr = "90EE90" ; 
		c[15].colorName = "darkgreen" ;
		c[15].colorStr = "006400" ;
		
		c[16].colorName = "gold" ; 
		c[16].colorStr = "FFD700" ; 
		c[17].colorName = "lightyellow" ; 
		c[17].colorStr = "FFFFE0" ; 
		c[18].colorName = "ivory" ;
		c[18].colorStr = "FFFFF0" ;
		
		c[19].colorName = "deeppink" ; 
		c[19].colorStr = "FF1493" ; 
		c[20].colorName = "lightpink";
		c[20].colorStr = "FFB6C1" ; 
		c[21].colorName = "darkred" ;
		c[21].colorStr = "8B0000" ;
		
		c[22].colorName = "chocolate" ; 
		c[22].colorStr = "D2691E" ; 
		c[23].colorName = "darkorange";
		c[23].colorStr = "FF8C00" ; 
		c[24].colorName = "violet" ;
		c[24].colorStr = "EE82EE" ;
		
		c[25].colorName = "olive" ; 
		c[25].colorStr = "808000" ; 
		c[26].colorName = "forestgreen";
		c[26].colorStr = "228B22" ; 
		c[27].colorName = "deepskyblue" ;
		c[27].colorStr = "00BFFF" ;
		
		c[28].colorName = "lightskyblue" ; 
		c[28].colorStr = "87CEFA" ; 
		c[29].colorName = "darkcyan";
		c[29].colorStr = "008B8B" ; 
		c[30].colorName = "aqua(cyan)" ;
		c[30].colorStr = "00FFFF" ;
		c[31].colorName = "lightcyan" ; 
		c[31].colorStr = "E0FFFF";
		adjacentColorName = c[0].colorName; // default adjacent color is the
											// first color
		adjacentColorValue = c[0].colorStr;
		String colorDefault = c[0].colorStr;

		//calculate the offset between the given color and the c[0] color and make it the default minOffset
		int[] arrColorAquired = {
				Integer.parseInt(colorAquired.substring(0, 2), 16),
				Integer.parseInt(colorAquired.substring(2, 4), 16),
				Integer.parseInt(colorAquired.substring(4, 6), 16) };
		int[] arrColorDefault = { Integer.parseInt(colorDefault.substring(0, 2), 16),
				Integer.parseInt(colorDefault.substring(2, 4), 16),
				Integer.parseInt(colorDefault.substring(4, 6), 16) };
		minOffset = (arrColorAquired[0] - arrColorDefault[0])
				* (arrColorAquired[0] - arrColorDefault[0])
				+ (arrColorAquired[1] - arrColorDefault[1])
				* (arrColorAquired[1] - arrColorDefault[1])
				+ (arrColorAquired[2] - arrColorDefault[2])
				* (arrColorAquired[2] - arrColorDefault[2]);
		for (int j = 0; j < 32; j++) {
			// System.err.println(c[i].colorName + "&&" + c[i].colorStr);
			colorToBeCompared = c[j].colorStr;
//			System.out.println(colorToBeCompared);
			int[] arrColorToBeCompared = { Integer.parseInt(colorToBeCompared.substring(0, 2), 16),
					Integer.parseInt(colorToBeCompared.substring(2, 4), 16),
					Integer.parseInt(colorToBeCompared.substring(4, 6), 16) };

			for (int i = 0; i < 3; i++) {
				offset = offset + (arrColorAquired[i] - arrColorToBeCompared[i])
						* (arrColorAquired[i] - arrColorToBeCompared[i]);
				 System.err.println(colorAquired+"&"+colorToBeCompared);
				 System.err.println("offset is ----->" + offset );
			}
			if (offset < minOffset) {
				minOffset = offset;
				adjacentColorName = c[j].colorName;
				adjacentColorValue = c[j].colorStr;
			}
			offset = 0 ; 
		}
		System.out.println("The given color value is----->" + colorAquired
				+ "\n" + "The adjacent color is----->" + adjacentColorValue
				+ "\n" + "which is called----->" + adjacentColorName
				+ "\nminOffset is ----->"+minOffset
				);
	}
}
