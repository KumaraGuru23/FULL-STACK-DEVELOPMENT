package MY_PROJECT;

import java.util.Scanner;

public class AiForMaths {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Hey Guru !!");
		System.out.println("What Can I Do For You");
		System.out.println("Say Bye To Exit");

		while (true) {

			System.out.print("You : ");
			String input = sc.nextLine().toLowerCase();

			if (input.equals("bye")) {
				System.out.println("Bot : Goodbye Have A Great Day.");
				break;
			}

			else if (input.contains("what is your name") 
					|| input.contains("who are you") || input.contains("hii")) {

				System.out.println("Bot : Hii Guru!!. I Am Your AI And I Know Maths. Help You To Find A Formula");
			}

			else if (input.contains("percentage")) { 
				
				System.out.println("Bot : part/whole * 100");
			}
			
			else if (input.contains("average")) {
				
				System.out.println("Bot : Sum of values/number of values");
			}
			
			else if (input.contains("simple interst")) {
				
				System.out.println("Bot : (SI) = P*R*T / 100 ");
			}
			
			else if (input.contains("compound interest") 
					|| input.contains("CI")) {
				
				System.out.println("Bot : A = P(1+R/100");
				
			}
			
            else if (input.contains("profit")) {
				
				System.out.println("Bot : Selling price - cost price");
			}
			
            else if (input.contains("loss")) {
				
				System.out.println("Bot : Cost price - selling price");
			}
			
            else if (input.contains("profit percentage")) {
            	
            	System.out.println("Bot : Profit / cost price * 100 ");
            }
			
            else if (input.contains("loss percentage")) {
            	
            	System.out.println("Bot : loss / cost price * 100 ");
            }
			
            else if (input.contains("discount")) {
            	
            	System.out.println("Bot : Marked price - selling price");
            }
			
            else if (input.contains("discount%")) {
            	
            	System.out.println("Bot : discount/marked price * 100 ");
            }
			
            else if (input.contains("speed")) {
            	
            	System.out.println(" Bot : distance/time ");
            }
			
            else if (input.contains("time")) {
	
            	System.out.println("Bot : distance/speed ");
            }
			
            else if (input.contains("area of rectangle")) {
	
            	System.out.println("Bot : length * breadth");
            }
			
            else if (input.contains("perimeter of rectangle")) {
	
            	System.out.println("Bot : 2(l+b)");
            }
			
            else if (input.contains("area of square")) {
	
            	System.out.println("Bot : side²");
            }
			
            else if (input.contains("perimeter of square")) {
	
            	System.out.println("Bot : 4 * side");
            }
			
            else if (input.contains("area of triangle")) {
	
            	System.out.println("Bot : 1/2 * base * height ");
            }
			
            else if (input.contains("area of circle")) {
	
            	System.out.println("Bot : πr²");
            }
			
            else if (input.contains("circumference of circle")) {
	
            	System.out.println("Bot : 2πr");
            }
			
            else if (input.contains("volume of cube")) {
	
            	System.out.println("Bot : side³");
            }
			
            else if (input.contains("volume of cuboid")) {
	
            	System.out.println("Bot : length * breadth * height");
            }
			
            else if (input.contains("volume of cylinder")) {
	
            	System.out.println("Bot : πr²h");
            }
			
            else if (input.contains("volume of cone")) {
	
            	System.out.println("Bot : 1/3πr²h ");
            
            }


			else {
				System.out.println("Bot : Sorry I Can't Understand");
			}
		}

		sc.close();
	}
}