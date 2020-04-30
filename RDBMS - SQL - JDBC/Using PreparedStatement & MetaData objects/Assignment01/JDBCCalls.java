public class JDBCCalls {

	public static void main(String[] args) {
		int option = Integer.parseInt(args[0]);
		DAOClass dao = new DAOClass();
		
		switch (option) {
		case 1: // insert: java JDBCCalls 1 101 Ajit IV 20-Nov-2001 4000
			int rollno = Integer.parseInt(args[1]);
			String name = args[2];
			String grade = args[3];
			String dob = args[4];
			int fee = Integer.parseInt(args[5]);
			
			if (dao.insert(rollno, name, grade, dob, fee))
				System.out.println("Inserted successfully");
			else 
				System.out.println("Insertion error");
			break;
			
		case 2: // delete: java JDBCCalls 2 101 
			rollno = Integer.parseInt(args[1]);
			
			if (dao.delete(rollno))
				System.out.println("Deleted successfully");
			else 
				System.out.println("Deletion error");
			
			break;
			
		case 3: // update: java JDBCCalls 3 101 4500
			rollno = Integer.parseInt(args[1]);
			fee = Integer.parseInt(args[2]);
			
			if (dao.modify(rollno, fee))
				System.out.println("Modified successfully");
			else 
				System.out.println("Modification error");
			break;
			
		case 4: // select: java JDBCCalls 4 101
			try {
				rollno = Integer.parseInt(args[1]);
				dao.display(rollno);
				break;
			} catch (Exception e) {
				dao.display();
				break;
			}
			
			
		}

	}

}
