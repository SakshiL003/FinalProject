package com.eb.main;

import java.util.ListIterator;
import java.util.Scanner;

import com.eb.dao.MenuDao;
import com.eb.pojo.Menu;


public class App {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter your Name:");
		
		String name=sc.next();
		
		System.out.println("Welcome to Surbhi Restaurant" +name);
		
		int ch=0;
		do {
			System.out.println("Press 1 Add Menu");
			System.out.println("Press 2 Update Menu");
			System.out.println("Press 3 Delete Menu");
			System.out.println("Press 4 Read Menu ");
		
			System.out.println("Press 5 Exit");
			System.out.println("Enter choice:");
			ch=sc.nextInt();
			switch(ch) {
			
			case 1:
				System.out.println("Enter Menu Name:");
				
				String menuname=sc.next();
				System.out.println("Enter Menu type:");
				
				String menutype=sc.next();
				System.out.println("Enter Menu prise:");
				
				int prise=sc.nextInt();
				System.out.println("Enter Menu quantity:");
				
				int quantity=sc.nextInt();
				
				Menu m=new Menu(prise, menuname,menutype,prise,quantity);
				boolean ans=MenuDao.craeteMenu(m);
				System.out.println("Menu inserted Successfully");
			break;
			case 2:
				System.out.println("press 1 to update menu name:");
				System.out.println("press 2 to update menu type:");
				int val=sc.nextInt();
				
				if(val==1) {
					System.out.println("Enter menu name which u want to update:");
					String menuname1=sc.next();
					System.out.println("Enter Id:");
					
					int id=sc.nextInt();
					Menu m1=new Menu();
					m1.setMenuName(menuname1);
					boolean f=MenuDao.updateMenuData(val, menuname1, id, m1);
					System.out.println("Menu Name is updated successfully");
			}
				else if(val==2) {
					System.out.println("Enter Menu type which u want to update:");
					String menutype1=sc.next();
					System.out.println("Enter Id:");
					
					int id=sc.nextInt();
					Menu m1=new Menu();
					m1.setMenuType(menutype1);
					boolean f=MenuDao.updateMenuData(val, menutype1, id, m1);					
					System.out.println("menu type is updated successfully");
				}
				
				else {
					System.out.println("Data is not updated");
				}
				
				break;
			case 3:
				System.out.println("Enter Id which u want delete:");
				int id=sc.nextInt();
				MenuDao.deleteMenu(id);
				System.out.println("Id is deleted");
				break;
			case 4:
			MenuDao.shoAllMenus();
				break;
			
			case 5:
				System.out.println("Bye Bye:");
				break;
				default:
					System.out.println("Wrong choice");
			}
		
		}while(ch!=5);
		}


	}