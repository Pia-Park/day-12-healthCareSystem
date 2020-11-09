package ca.healthcare.system;

import java.util.Comparator;

public class UserSorter {
	
	public static class CompareByName implements Comparator<User>{
		@Override
		public int compare(User u1, User u2) {
			return u1.getLName().compareTo(u2.getLName());
		}
	}

}
