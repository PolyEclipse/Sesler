import java.io.*;
import javax.sound.sampled.*;

public class SesBasla {

	public static void main(String[] args) {
		try {
			// File("/Users/Styx/eclipse-workspace/Denemeler/Sesler/src/back.wav");
			File yourFile = new File("./src/back.wav");
			AudioInputStream stream;
			AudioFormat format;
			DataLine.Info info;
			Clip clip;

			stream = AudioSystem.getAudioInputStream(yourFile);
			format = stream.getFormat();
			info = new DataLine.Info(Clip.class, format);
			clip = (Clip) AudioSystem.getLine(info);
			clip.open(stream);
			clip.start();
			Thread.sleep(clip.getMicrosecondLength() / 1000);

		} catch (Exception e) {
			// whatevers
		}

	}

}
