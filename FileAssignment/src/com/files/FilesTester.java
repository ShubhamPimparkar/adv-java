package com.files;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.Scanner;

public class FilesTester {
	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {
			System.out.println("Enter File name");
			String fileName = sc.next();

			
			System.out.println("1.Sum of all deposits\r\n"
					+ "2.Max deposit amount\r\n"
					+ "3.Shopping expenses (sum of withdrawals for shopping)\r\n"
					+ "4.Date on which maximum amount withdrawn \n0.Exit");
			
		
			boolean exit=false;
			while(!exit) {
				switch (sc.nextInt()) {
				case 1:
					BufferedReader br = new BufferedReader(new FileReader(fileName));
					br.readLine();
					String line;
					double deposits=0;
					while((line= br.readLine()) !=null) {
						String values[] = line.split(",");
						deposits = deposits+  Double.parseDouble(values[3]);
					}
					System.out.println("Total Deposist : "+deposits);
					br.close();
					break;
				case 2:
					BufferedReader br2 = new BufferedReader(new FileReader(fileName));
					br2.readLine();
					String line2;
					double maxDeposit=0;
//					double currDeposit=0;
					while((line2= br2.readLine()) !=null) {
						String values[] = line2.split(",");
						double parsed = Double.parseDouble(values[3]);
						
						if(parsed>=maxDeposit) {
							maxDeposit = parsed;
						}
					}
					System.out.println("Max Deposit : "+maxDeposit);
					br2.close();
					break;
				case 3:
					BufferedReader br3 = new BufferedReader(new FileReader(fileName));
					br3.readLine();
					String line3;
					double sumWithdraw=0;
					while((line3= br3.readLine()) !=null) {
						String values[] = line3.split(",");
						sumWithdraw += Double.parseDouble(values[2]);
					}
					System.out.println("Sum Withdrawn : "+sumWithdraw);
					br3.close();
					break;
				case 4:
					BufferedReader br4 = new BufferedReader(new FileReader(fileName));
					br4.readLine();
					String line4;
					double maxWithdrawn=0;
					String date = null;
					while((line4= br4.readLine()) !=null) {
						String values[] = line4.split(",");
						double withdrawn = Double.parseDouble(values[2]);
						if(withdrawn>maxWithdrawn) {
							maxWithdrawn=withdrawn;
							date = values[0];
						}
					}
					System.out.println("Max Withdarwn : "+maxWithdrawn);
					System.out.println("Max Withdarwn Date : "+date);
					break;

				default:
					exit=true;
					break;
				}
				
			}
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
