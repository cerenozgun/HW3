package odev3;



public class UserManager {
	

		
		public void add(User user) {
			System.out.println(user.getUserName() + "isimli");
			System.out.println(user.getNationalIdentity()  + " no'lu kullan�c� eklendi.");
		}
			
			public void remove(User user) {
				System.out.println(user.getUserName() + " isimli");
				System.out.println(user.getNationalIdentity() + " no'lu kullan�c� silindi.");
			}
		
	
		public void addMultiple (User [] users) {
			for(User user : users ) {
				add(user);
				
			}
		}

	

		
	}

