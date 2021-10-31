package lsk;

public class Main {

	public static void main(String[] args) {

		Project project = new Project();

		File p = new ProjectFile("1");
		File p2 = new ProjectFile("2");
		

		project.addFile(p);
		project.addFile(p2);
		
		ReadOnlyFile rf= new ReadOnlyProjectFile("3");
		ReadOnlyFile rf2= new ReadOnlyProjectFile("4");
		
		project.addReadOnlyFile(rf);
		project.addReadOnlyFile(rf2);
		
		
		System.out.println("Load files:");
		project.loadAllFiles();
		
		System.out.println("Store files:");
		project.storeAllFiles();

	}

}
