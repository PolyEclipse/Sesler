
import java.io.File;
import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;

public class JavaFilePath {

	public static void main(String[] args) throws IOException, URISyntaxException {
		File file = new File("/Users/Styx/eclipse-workspace/Denemeler/Sesler/src/back.wav");
		printPaths(file);
		// relative path
		file = new File("back.wav");
		printPaths(file);
		// complex relative paths
		file = new File("/Users/Styx/../src/back.wav");
		printPaths(file);
		// URI paths
		file = new File(new URI("file:///Users/Styx/eclipse-workspace/Denemeler/Sesler/src/back.wav"));
		printPaths(file);
	}

	private static void printPaths(File file) throws IOException {
		System.out.println("Absolute Path: " + file.getAbsolutePath());
		System.out.println("Canonical Path: " + file.getCanonicalPath());
		System.out.println("Path: " + file.getPath());
	}

}
