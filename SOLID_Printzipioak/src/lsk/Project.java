package lsk;

import java.util.Vector;

public class Project {
	public Vector<FStore> storeFiles = new Vector<FStore>();
	public Vector<FLoad> loadFiles = new Vector<FLoad>();

	public void addFile(File f) {
		storeFiles.add(f);
		loadFiles.add(f);
	}

	public void addReadOnlyFile(ReadOnlyFile f) {
		loadFiles.add(f);
	}

	public void storeAllFiles() {
		for (FStore f : storeFiles)
			f.storeFile();
	}

	public void loadAllFiles() {
		for (FLoad f : loadFiles)
			f.loadFile();
	}
}