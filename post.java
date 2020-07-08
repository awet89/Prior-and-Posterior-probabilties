public static void main(String[] args) {
		// pass the path to the file as a parameter
		//System.out.printf("Cherry = %f and Lime = %f\n", Cherry,Lime);		
				double h1_prior = .10;
				double h2_prior = .20;
				double h3_prior = .40;
				double h4_prior = .20;
				double h5_prior = .10;
				double c1_bag = 1.0;
				double l1_bag = 0.0;
				double c2_bag = .75;
				double l2_bag = .25;
				double c3_bag = .50;
				double l3_bag = .50;
				double c4_bag = .25;
				double l4_bag = .75;
				double c5_bag = 0.0;
				double l5_bag = 1.0;
				double Cherry =(h1_prior*c1_bag) + (h2_prior*c2_bag) + (h3_prior*c3_bag) + (h4_prior*c4_bag) + (h5_prior*c5_bag);
				double Lime = 1-Cherry;
				String fileName ="output.txt";
				try {
					int b;
					PrintWriter output = new PrintWriter(fileName);
					System.out.printf("Observation sequence Q: ");
					Scanner in = new Scanner(System.in);
					String a=in.nextLine();
					output.println("Observation sequence Q: "+a);
					output.println("Length of Q: "+a.length()+ "\n");
					System.out.printf("Length of Q: %d\n\n", a.length());
					char observe;
					String temp;
					for(int i = 0;i<a.length();i++) {
						observe=a.charAt(i);
						System.out.printf("After Observation %d = %s\n\n", i+1,observe);
						b=i+1;
						temp = "After Observation "+ b + " = " +observe+"\n";
						output.println(temp);
						if(observe=='C') {
							h1_prior=(h1_prior*c1_bag)/Cherry;
							h1_prior=(double)Math.round(h1_prior*100000d)/100000d;
							System.out.printf("P(h1|Q) = %f\n", h1_prior);
							temp = "P(h1|Q) = "+h1_prior;
							output.println(temp);
							h2_prior=(h2_prior*c2_bag)/Cherry;
							h2_prior=(double)Math.round(h2_prior*100000d)/100000d;
							System.out.printf("P(h2|Q) = %f\n", h2_prior);
							temp = "P(h2|Q) = "+h2_prior;
							output.println(temp);
							h3_prior=(h3_prior*c3_bag)/Cherry;
							h3_prior=(double)Math.round(h3_prior*100000d)/100000d;
							System.out.printf("P(h3|Q) = %f\n", h3_prior);
							temp = "P(h3|Q) = "+h3_prior;
							output.println(temp);
							h4_prior=(h4_prior*c4_bag)/Cherry;
							h4_prior=(double)Math.round(h4_prior*100000d)/100000d;
							System.out.printf("P(h4|Q) = %f\n", h4_prior);
							temp = "P(h4|Q) = "+h4_prior;
							output.println(temp);
							h5_prior=(h5_prior*c5_bag)/Cherry;
							h5_prior=(double)Math.round(h5_prior*100000d)/100000d;
							System.out.printf("P(h5|Q) = %f\n\n", h5_prior);
							temp = "P(h5|Q) = "+h5_prior+"\n";
							output.println(temp);
						}
						else {
							h1_prior=(h1_prior*l1_bag)/Lime;
							h1_prior=(double)Math.round(h1_prior*100000d)/100000d;
							System.out.printf("P(h1|Q) = %f\n", h1_prior);
							temp = "P(h1|Q) = "+h1_prior;
							output.println(temp);
							h2_prior=(h2_prior*l2_bag)/Lime;
							h2_prior=(double)Math.round(h2_prior*100000d)/100000d;
							System.out.printf("P(h2|Q) = %f\n", h2_prior);
							temp = "P(h2|Q) = "+h2_prior;
							output.println(temp);
							h3_prior=(h3_prior*l3_bag)/Lime;
							h3_prior=(double)Math.round(h3_prior*100000d)/100000d;
							System.out.printf("P(h3|Q) = %f\n", h3_prior);
							temp = "P(h3|Q) = "+h3_prior;
							output.println(temp);
							h4_prior=(h4_prior*l4_bag)/Lime;
							h4_prior=(double)Math.round(h4_prior*100000d)/100000d;
							System.out.printf("P(h4|Q) = %f\n", h4_prior);
							temp = "P(h4|Q) = "+h4_prior;
							output.println(temp);
							h5_prior=(h5_prior*l5_bag)/Lime;
							h5_prior=(double)Math.round(h5_prior*100000d)/100000d;
							System.out.printf("P(h5|Q) = %f\n\n", h5_prior);
							temp = "P(h5|Q) = "+h5_prior+"\n";
							output.println(temp);
							in.close();
						}
						Cherry =(h1_prior*c1_bag) + (h2_prior*c2_bag) + (h3_prior*c3_bag) + (h4_prior*c4_bag) + (h5_prior*c5_bag);
						Cherry=(double)Math.round(Cherry*100000d)/100000d;
						Lime = 1-Cherry;
						Lime = (double)Math.round(Lime*100000d)/100000d;
						System.out.printf("Probability that the next candy will pick Cherry, give Q: %f\n", Cherry);
						temp = "Probability that the next candy will pick Cherry, give Q: "+Cherry;
						output.println(temp);
						System.out.printf("Probability that the next candy will pick Lime, give Q: %f\n\n", Lime);
						temp = "Probability that the next candy will pick Lime, give Q: "+Lime+"\n";
						output.println(temp);

					}
					output.close();
				} catch (FileNotFoundException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				
				
				
				
	}