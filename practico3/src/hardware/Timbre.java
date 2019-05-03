package hardware;

import java.io.InputStream;

import javax.sound.sampled.AudioFormat;
import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.SourceDataLine;
import javax.sound.sampled.DataLine.Info;


public class Timbre {

	public Timbre() {

	}

	public void sonar() {
		System.err.println("Alarma Sonado!!");
		new Thread(new Sonar()).start();
	}

	private class Sonar implements Runnable {
		@Override
		public void run() {
			try {
				InputStream waveStream = Timbre.class.getResourceAsStream("alarm.wav");
				AudioInputStream audioInputStream = AudioSystem.getAudioInputStream(waveStream);


				// Obtain the information about the AudioInputStream
				AudioFormat audioFormat = audioInputStream.getFormat();
				Info info = new Info(SourceDataLine.class, audioFormat);

				// opens the audio channel
				SourceDataLine dataLine = null;
				dataLine = (SourceDataLine) AudioSystem.getLine(info);
				dataLine.open(audioFormat, 128 * 1024);

				// Starts the music :P
				dataLine.start();

				int readBytes = 0;
				byte[] audioBuffer = new byte[128 * 1024];

				while (readBytes != -1) {
					readBytes = audioInputStream.read(audioBuffer, 0,
							audioBuffer.length);
					if (readBytes >= 0){
						dataLine.write(audioBuffer, 0, readBytes);
					}
				}
				// plays what's left and and closes the audioChannel
				dataLine.drain();
				dataLine.close();

			} catch (Exception e) {
				e.printStackTrace();
			}	
		}
	}
}
