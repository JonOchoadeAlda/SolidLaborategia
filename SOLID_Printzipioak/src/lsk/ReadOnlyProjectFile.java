package lsk;

public class ReadOnlyProjectFile extends ReadOnlyFile {
	public String filePath;

	public ReadOnlyProjectFile(String filePath) {
		this.filePath = filePath;

	}

	public void loadFile() {
		System.out.println("file loaded from " + filePath);

	}
}
